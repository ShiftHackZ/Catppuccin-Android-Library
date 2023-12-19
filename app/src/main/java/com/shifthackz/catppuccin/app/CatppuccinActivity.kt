package com.shifthackz.catppuccin.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.shifthackz.catppuccin.app.ui.ButtonsExample
import com.shifthackz.catppuccin.palette.Catppuccin
import com.shifthackz.catppuccin.compose.CatppuccinTheme
import com.shifthackz.catppuccin.palette.CatppuccinPalette

class CatppuccinActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var palette by remember {
                mutableStateOf<CatppuccinPalette>(Catppuccin.Latte)
            }
            CatppuccinTheme.Palette(
                palette = palette,
            ) {
                palette = Catppuccin.Mocha
                Surface {
                    ButtonsExample(
                        palette = palette,
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
