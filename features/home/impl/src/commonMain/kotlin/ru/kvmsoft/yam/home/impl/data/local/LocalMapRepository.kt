package ru.kvmsoft.yam.home.impl.data.local

import dev.sargunv.maplibrecompose.compose.offline.OfflinePackDefinition
import io.github.dellisd.spatialk.geojson.BoundingBox
import ru.kvmsoft.yam.home.impl.model.LatLngBounds
import kotlin.math.max

class LocalMapRepository(private val offlineManager: ru.kvmsoft.yam.home.impl.data.utils.OfflineManager) {
  private val styleUrl = "https://tiles.openfreemap.org/styles/liberty"
  private val crimeaBounds = LatLngBounds(
      north = 32.890600, east = 36.783321,
      south = 44.406716, west = 44.539102)
  private val minZoom: Int = 10
  private val maxZoom: Int = 15
  private val pixelRatio: Float = 1.0f

  val offlinePackDefinition = OfflinePackDefinition.TilePyramid(
      styleUrl = styleUrl,
      bounds = BoundingBox(west = crimeaBounds.west, north = crimeaBounds.north, south = crimeaBounds.south, east = crimeaBounds.east),
      minZoom = minZoom,
      maxZoom = maxZoom
  )
}