package com.shifthackz.catppuccin.app.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shifthackz.catppuccin.compose.CatppuccinTheme
import com.shifthackz.catppuccin.palette.CatppuccinPalette

@Composable
fun TypographyExample(
    palette: CatppuccinPalette,
) {
    CatppuccinTheme(palette = palette) {
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
                Text(
                    text = "Display Large",
                    style = MaterialTheme.typography.displayLarge,
                )
                Text(
                    text = "Display Medium",
                    style = MaterialTheme.typography.displayMedium,
                )
                Text(
                    text = "Display Small",
                    style = MaterialTheme.typography.displaySmall,
                )
                Text(
                    text = "Headline Large",
                    style = MaterialTheme.typography.headlineLarge,
                )
                Text(
                    text = "Headline Medium",
                    style = MaterialTheme.typography.headlineMedium,
                )
                Text(
                    text = "Headline Small",
                    style = MaterialTheme.typography.headlineSmall,
                )
                Text(
                    text = "Title Large",
                    style = MaterialTheme.typography.titleLarge,
                )
                Text(
                    text = "Title Medium",
                    style = MaterialTheme.typography.titleMedium,
                )
                Text(
                    text = "Title Small",
                    style = MaterialTheme.typography.titleSmall,
                )
                Text(
                    text = "Body Large",
                    style = MaterialTheme.typography.bodyLarge,
                )
                Text(
                    text = "Body Medium",
                    style = MaterialTheme.typography.bodyMedium,
                )
                Text(
                    text = "Body Small",
                    style = MaterialTheme.typography.bodySmall,
                )
                Text(
                    text = "Label Large",
                    style = MaterialTheme.typography.labelLarge,
                )
                Text(
                    text = "Label Medium",
                    style = MaterialTheme.typography.labelMedium,
                )
                Text(
                    text = "Label Small",
                    style = MaterialTheme.typography.labelSmall,
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun TypographyLattePreview() {
    TypographyExample(
        palette = com.shifthackz.catppuccin.palette.Catppuccin.Latte,
    )
}

@Composable
@Preview(showBackground = true)
private fun TypographyFrappePreview() {
    TypographyExample(
        palette = com.shifthackz.catppuccin.palette.Catppuccin.Frappe,
    )
}

@Composable
@Preview(showBackground = true)
private fun TypographyMacchiatoPreview() {
    TypographyExample(
        palette = com.shifthackz.catppuccin.palette.Catppuccin.Macchiato,
    )
}

@Composable
@Preview(showBackground = true)
private fun TypographyMochaPreview() {
    TypographyExample(
        palette = com.shifthackz.catppuccin.palette.Catppuccin.Mocha,
    )
}
