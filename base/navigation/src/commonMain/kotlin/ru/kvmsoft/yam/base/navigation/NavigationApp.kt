package ru.kvmsoft.yam.base.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalRippleConfiguration
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import ru.kvmsoft.yam.base.navigation.res.icons.iconHome
import ru.kvmsoft.yam.base.navigation.res.icons.iconInformation
import ru.kvmsoft.yam.base.navigation.res.icons.iconOrders
import ru.kvmsoft.yam.base.navigation.res.icons.iconSettings
import ru.kvmsoft.yam.base.navigation.res.images.menuBackGround
import ru.kvmsoft.yam.base.ui.theme.MainBlackLight
import ru.kvmsoft.yam.base.ui.theme.MainGreyLight
import ru.kvmsoft.yam.base.ui.theme.MainMenuBackgroundLight
import ru.kvmsoft.yam.base.ui.utils.NoRippleConfiguration
import ru.kvmsoft.yam.home.impl.presentation.HomeScreen
import ru.kvmsoft.yam.info.impl.presentation.InfoScreen
import ru.kvmsoft.yam.orders.impl.presentation.OrdersScreen
import ru.kvmsoft.yam.settings.impl.presentation.SettingsScreen
import ru.kvmsoft.yam.splash.impl.presentation.SplashScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationApp() {
    var isShowNavBar by remember { mutableStateOf(false) }
    val navController = rememberNavController() // Инициализация контроллера навигации
    val navItems = listOf(
        NavigationItem(label = AppDestinations.HOME.name, icon = iconHome, route = AppDestinations.HOME.name),
        NavigationItem(label = AppDestinations.ORDERS.name, icon = iconOrders, route = AppDestinations.ORDERS.name),
        NavigationItem(label = AppDestinations.INFO.name, icon = iconInformation, route = AppDestinations.INFO.name),
        NavigationItem(label = AppDestinations.SETTINGS.name, icon = iconSettings, route = AppDestinations.SETTINGS.name)
    )
    val navigationBarItemColors = NavigationBarItemDefaults.colors(
            indicatorColor = Color.Transparent, // Color of the selected item's indicator
            selectedIconColor = MainBlackLight, // Color of the icon when selected
            unselectedIconColor = MainGreyLight, // Color of the icon when unselected
            selectedTextColor = MainBlackLight, // Color of the text when selected
            unselectedTextColor = MainGreyLight // Color of the text when unselected
        )

    Scaffold(
        bottomBar = {
            if(isShowNavBar){
                Box(modifier = Modifier.fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))){
                    Image(
                        modifier = Modifier.fillMaxWidth(),
                        imageVector = menuBackGround,
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth
                    )
                }
//                HorizontalDivider(Modifier, 1.dp, MainGreenLight)
                BottomAppBar(
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .clip(RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp)),
                    containerColor = MainMenuBackgroundLight
                ){
                    // Нижняя панель приложения
                    NavigationBar(
                        containerColor = Color.Transparent
                    )  { // Компонент для нижней навигации
                        val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route // Текущий маршрут
                        navItems.forEach { item ->
                            CompositionLocalProvider(LocalRippleConfiguration provides NoRippleConfiguration) {
                            NavigationBarItem(
                                colors = navigationBarItemColors,
                                icon = {
                                    item.icon?.let {
                                        Icon(
                                            imageVector = it, // Reference your ImageVector from the .kt file
                                            contentDescription = it.name,
                                            modifier = Modifier.size(32.dp),
                                        )
                                    }
                                },
                                label = { Text(item.label) },
                                selected = currentRoute == item.route,
                                onClick = {
                                    navController.navigate(item.route) {
                                        // Опции навигации, например, чтобы избежать повторных входов в один и тот же экран
                                        popUpTo(navController.graph.findStartDestination().id) {
                                            saveState = true
                                        }
                                        launchSingleTop = true
                                        restoreState = true
                                    }
                                }
                            )
                        }
                        }
                    }
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = AppDestinations.SPLASH.name // Splash экран
        ) {
            // Определяем маршруты и их Composable-функции
            composable(AppDestinations.HOME.name) {
                HomeScreen(onBack = {
                    //show exit dialog
                }) // Возврат на предыдущий экран
            }
            composable(AppDestinations.ORDERS.name) {
                OrdersScreen(onBack = { navController.popBackStack() })
            }
            composable(AppDestinations.INFO.name) {
                InfoScreen(onBack = { navController.popBackStack() })
            }
            composable(AppDestinations.SETTINGS.name) {
                SettingsScreen(onBack = { navController.popBackStack() })
            }
            composable(AppDestinations.SPLASH.name) {
                SplashScreen(onNavigateToHome = {
//                    navController.navigate(route = AppDestinations.HOME.name)
                    navController.navigate(AppDestinations.HOME.name) {
                        popUpTo(AppDestinations.SPLASH.name){
                            inclusive = true
                        }
                    }
                    isShowNavBar = true
                })
            }
        }
    }
}