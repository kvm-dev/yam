package ru.kvmsoft.yam.geo.impl.data.network

import dev.sargunv.maplibrecompose.compose.offline.DownloadProgress
import dev.sargunv.maplibrecompose.compose.offline.OfflinePackDefinition
import io.github.dellisd.spatialk.geojson.BoundingBox
import ru.kvmsoft.yam.geo.impl.model.GeoBounds
import ru.kvmsoft.yam.geo.impl.model.OfflineMapResultStatus
import ru.kvmsoft.yam.geo.impl.res.StringData.Companion.localMapTileLimitExceeded
import ru.kvmsoft.yam.geo.impl.res.StringData.Companion.localMapUnknownError
import ru.kvmsoft.yam.geo.impl.data.utils.OfflineManager as YamOfflineManager


class NetworkDataSource(private val offlineManager: YamOfflineManager) {
    private val styleUrl = "https://tiles.openfreemap.org/styles/liberty"
    private val crimeaBounds = GeoBounds(
        north = 32.890600, east = 36.783321,
        south = 44.406716, west = 44.539102)
    private val minZoom: Int = 10
    private val maxZoom: Int = 15

    val offlinePackDefinition = OfflinePackDefinition.TilePyramid(
        styleUrl = styleUrl,
        bounds = BoundingBox(west = crimeaBounds.west, north = crimeaBounds.north, south = crimeaBounds.south, east = crimeaBounds.east),
        minZoom = minZoom,
        maxZoom = maxZoom
    )
    suspend fun downloadCrimeaMap(): OfflineMapResultStatus {
        try {
            val result = offlineManager.getOfflineManager().create(offlinePackDefinition)
            return when(result.downloadProgress){
                DownloadProgress.Unknown -> OfflineMapResultStatus(status = false, errorMsg = localMapUnknownError())
                is DownloadProgress.TileLimitExceeded -> OfflineMapResultStatus(status = false, errorMsg = localMapTileLimitExceeded())
                is DownloadProgress.Error -> OfflineMapResultStatus(status = false, errorMsg = (result.downloadProgress as DownloadProgress.Error).message)
                is DownloadProgress.Healthy -> {
                    offlineManager.getOfflineManager().resume(result)
                    OfflineMapResultStatus(true, "")
                }
            }
        }
        catch (e: Exception){
            return OfflineMapResultStatus(false, e.message ?: "")
        }
    }
}