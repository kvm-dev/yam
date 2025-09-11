package ru.kvmsoft.yam.home.impl.presentation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import dev.sargunv.maplibrecompose.compose.CameraState
import dev.sargunv.maplibrecompose.compose.ClickResult
import dev.sargunv.maplibrecompose.compose.MaplibreMap
import dev.sargunv.maplibrecompose.compose.layer.SymbolLayer
import dev.sargunv.maplibrecompose.compose.rememberCameraState
import dev.sargunv.maplibrecompose.compose.rememberStyleState
import dev.sargunv.maplibrecompose.compose.source.rememberGeoJsonSource
import dev.sargunv.maplibrecompose.core.CameraPosition
import dev.sargunv.maplibrecompose.core.MapOptions
import dev.sargunv.maplibrecompose.core.OrnamentOptions
import dev.sargunv.maplibrecompose.core.source.GeoJsonData
import dev.sargunv.maplibrecompose.expressions.dsl.feature
import dev.sargunv.maplibrecompose.expressions.dsl.image
import dev.sargunv.maplibrecompose.material3.controls.CompassButton
import dev.sargunv.maplibrecompose.material3.controls.ExpandingAttributionButton
import dev.sargunv.maplibrecompose.material3.controls.ScaleBar
import io.github.dellisd.spatialk.geojson.Position
import org.koin.compose.viewmodel.koinViewModel
import ru.kvmsoft.yam.base.viewmodel.model.ProgressState
import ru.kvmsoft.yam.home.impl.res.icons.userPosition
import ru.kvmsoft.yam.home.impl.presentation.viewmodel.HomeScreenViewModel

@Composable
fun HomeScreen(homeScreenViewModel: HomeScreenViewModel = koinViewModel(), onBack: () -> Unit) {
    val viewModelState by homeScreenViewModel.progressState.collectAsState()
    when (viewModelState) {
        ProgressState.IDLE -> {
            homeScreenViewModel.initViewModel()
        }
        ProgressState.LOADING -> {}
        ProgressState.COMPLETED -> {}
    }
    //offline maps
    //end of offline maps
    val startPosition = CameraPosition(
        target = Position(34.134471, 44.976127),
        bearing = 0.0,
        tilt = 0.0,
        zoom = 17.0
    )
    val firstState = CameraState(firstPosition = startPosition)
    val cameraState = rememberCameraState(firstPosition = startPosition)
    val styleState = rememberStyleState()
    Box(Modifier.fillMaxSize()) {
        MaplibreMap(
//            baseStyle = BaseStyle.Uri("https://tiles.openfreemap.org/styles/liberty"),
            cameraState = cameraState,
            styleState = styleState,
            options = MapOptions(ornamentOptions = OrnamentOptions.OnlyLogo),
        ){
//                val amtrakStations =
//                    rememberGeoJsonSource(
//                        data =
//                            GeoJsonData.Uri(
//                                "https://raw.githubusercontent.com/datanews/amtrak-geojson/refs/heads/master/amtrak-stations.geojson"
//                            )
//                    )

            val myPositionGeoJson = """
    {
      "type": "FeatureCollection",
      "features": [
        {
          "type": "Feature",
          "geometry": {
            "type": "Point",
            "coordinates": [34.134471, 44.976127]
          },
          "properties": {
            "name": "Sample Point"
          }
        }
      ]
    }
    """

            val amtrakStations =
                rememberGeoJsonSource(
                    data =
                        GeoJsonData.JsonString(myPositionGeoJson)
                )
            val marker = rememberVectorPainter(userPosition)

//            SymbolLayer(
//                id = "my-symbol-layer",
//                source = amtrakStations,
//                iconImage = image(marker, size = DpSize(32.dp, 32.dp)), // Reference to an image added to the style
//                textField =   format(
//                    span(image("railway")),
//                    span(" "),
//                    span(feature["STNCODE"].asString(), textSize = const(1.2f.em)),
//                ), // Use a property from the GeoJson feature
//                textColor = const(MaterialTheme.colorScheme.onBackground),
//                textOffset = offset(0.em, 0.6.em),
//                visible = true
//            )
            SymbolLayer(
                id = "my-symbol-layer",
                source = amtrakStations,
                iconImage = image(marker, size = DpSize(32.dp, 32.dp)), // Reference to an image added to the style
                visible = true,
                onClick = { features ->
                    println("Clicked on ${features[0].properties}")
                    println("data on ${feature.properties()}")
                    ClickResult.Consume
                }
            )
//            CircleLayer(
//                id = "amtrak-stations",
//                source = amtrakStations,
//                onClick = { features ->
//                    println("Clicked on ${features[0].json()}")
//                    ClickResult.Consume
//                },
//            )


        }

        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            ScaleBar(cameraState.metersPerDpAtTarget, modifier = Modifier.align(Alignment.TopStart))
            CompassButton(cameraState, modifier = Modifier.align(Alignment.TopEnd))
            ExpandingAttributionButton(
                cameraState = cameraState,
                styleState = styleState,
                modifier = Modifier.align(Alignment.BottomEnd),
                contentAlignment = Alignment.BottomEnd,
            )
        }
    }
}