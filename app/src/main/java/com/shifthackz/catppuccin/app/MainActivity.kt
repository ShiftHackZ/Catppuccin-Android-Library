package com.shifthackz.catppuccin.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.shifthackz.catppuccin.app.ui.ButtonsExample
import com.shifthackz.catppuccin.app.ui.TypographyExample
import com.shifthackz.catppuccin.palette.Catppuccin
import com.shifthackz.catppuccin.compose.CatppuccinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatppuccinTheme {
                Surface {
                    ButtonsExample(
                        palette = Catppuccin.Latte,
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }
}

