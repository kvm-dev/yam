rootProject.name = "Yam"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

include(":composeApp")
include(":features:asmode:api")
include(":features:asmode:impl")
include(":features:home:api")
include(":features:home:impl")
include(":features:info:api")
include(":features:info:impl")
include(":features:splash:api")
include(":features:splash:impl")
include(":features:orders:api")
include(":features:orders:impl")
include(":features:settings:api")
include(":features:settings:impl")
include(":base:network")
include(":base:storage")
include(":base:ui")
include(":base:utils")
include(":base:notifications")
include(":base:navigation")
include(":base:screens")
include(":base:sms")
include(":base:viewmodel")
include(":base:di")
include(":features:user:api")
include(":features:geo:api")
include(":features:geo:impl")
include(":features:user:impl")
