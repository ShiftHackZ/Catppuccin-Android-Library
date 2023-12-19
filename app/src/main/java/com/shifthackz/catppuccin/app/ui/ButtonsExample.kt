package com.shifthackz.catppuccin.app.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shifthackz.catppuccin.compose.CatppuccinTheme
import com.shifthackz.catppuccin.palette.Catppuccin
import com.shifthackz.catppuccin.palette.CatppuccinPalette

@Composable
fun ButtonsExample(
    palette: CatppuccinPalette,
) {
    CatppuccinTheme.Palette(palette = palette) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
            ) {
                Button(onClick = {  }) {
                    Icon(
                        imageVector = Icons.Default.Build,
                        contentDescription = null,
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Button",
                        color = LocalContentColor.current,
                    )
                }
            }
        }
    }
}

@Composable
@Preview
private fun ButtonsLattePreview() {
    ButtonsExample(palette = Catppuccin.Latte)
}

@Composable
@Preview
private fun ButtonsFrappePreview() {
    ButtonsExample(palette = Catppuccin.Frappe)
}

@Composable
@Preview
private fun ButtonsMacchiatoPreview() {
    ButtonsExample(palette = Catppuccin.Macchiato)
}

@Composable
@Preview
private fun ButtonsMochaPreview() {
    ButtonsExample(palette = Catppuccin.Mocha)
}