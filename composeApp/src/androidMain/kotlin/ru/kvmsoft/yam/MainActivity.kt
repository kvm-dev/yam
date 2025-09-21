package ru.kvmsoft.yam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import org.koin.android.ext.koin.androidContext
import ru.kvmsoft.yam.base.storage.AppDatabase
import ru.kvmsoft.yam.base.storage.drivers.DatabaseDriverFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            val database = AppDatabase(DatabaseDriverFactory(LocalContext.current).createDriver())
            App(koinAppDeclaration = {
                androidContext(this@MainActivity.applicationContext)
            },
                database = database)
        }
    }
}