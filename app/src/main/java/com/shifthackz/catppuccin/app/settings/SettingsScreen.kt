package com.shifthackz.catppuccin.app.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shifthackz.catppuccin.app.ui.AccentColorSelector
import com.shifthackz.catppuccin.app.ui.RadioButtonWithText
import com.shifthackz.catppuccin.app.utils.copy
import com.shifthackz.catppuccin.app.utils.withBackgroundPalette
import com.shifthackz.catppuccin.compose.CatppuccinMaterial
import com.shifthackz.catppuccin.palette.Catppuccin

@Composable
@Preview(showBackground = true)
fun SettingsScreen(
    modifier: Modifier = Modifier,
    settings: SettingsUiState = SettingsUiState(),
    onChanged: (SettingsUiState) -> Unit = {},
) {
    Column(
        modifier = modifier.verticalScroll(rememberScrollState()),
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Column(modifier = Modifier.withBackgroundPalette(settings.palette)) {
            Text(
                modifier = Modifier
                    .padding(top = 12.dp, bottom = 4.dp)
                    .padding(horizontal = 16.dp),
                text = "Catppuccin flavor palette",
                style = MaterialTheme.typography.titleMedium,
            )
            RadioButtonWithText(
                modifier = Modifier.fillMaxWidth(),
                selected = settings.palette.toString().contains("Latte"),
                text = "\uD83C\uDF3B Catppuccin Latte",
                onClick = {
                    val palette = CatppuccinMaterial.Latte(
                        primary = settings.primaryToken.color(Catppuccin.Latte),
                        secondary = settings.secondaryToken.color(Catppuccin.Latte),
                    )
                    onChanged(settings.copy(palette = palette))
                },
            )
            RadioButtonWithText(
                modifier = Modifier.fillMaxWidth(),
                selected = settings.palette.toString().contains("Frappe"),
                text = "\uD83E\uDEB4 Catppuccin Frappé",
                onClick = {
                    val palette = CatppuccinMaterial.Frappe(
                        primary = settings.primaryToken.color(Catppuccin.Frappe),
                        secondary = settings.secondaryToken.color(Catppuccin.Frappe),
                    )
                    onChanged(settings.copy(palette = palette))
                },
            )
            RadioButtonWithText(
                modifier = Modifier.fillMaxWidth(),
                selected = settings.palette.toString().contains("Macchiato"),
                text = "\uD83C\uDF3A Catppuccin Macchiato",
                onClick = {
                    val palette = CatppuccinMaterial.Macchiato(
                        primary = settings.primaryToken.color(Catppuccin.Macchiato),
                        secondary = settings.secondaryToken.color(Catppuccin.Macchiato),
                    )
                    onChanged(settings.copy(palette = palette))
                },
            )
            RadioButtonWithText(
                modifier = Modifier.fillMaxWidth(),
                selected = settings.palette.toString().contains("Mocha"),
                text = "\uD83C\uDF3F Catppuccin Mocha",
                onClick = {
                    val palette = CatppuccinMaterial.Mocha(
                        primary = settings.primaryToken.color(Catppuccin.Mocha),
                        secondary = settings.secondaryToken.color(Catppuccin.Mocha),
                    )
                    onChanged(settings.copy(palette = palette))
                },
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
        Column(modifier = Modifier.withBackgroundPalette(settings.palette)) {
            Text(
                modifier = Modifier
                    .padding(top = 12.dp, bottom = 4.dp)
                    .padding(horizontal = 16.dp),
                text = "Primary color",
                style = MaterialTheme.typography.titleMedium,
            )
            Spacer(modifier = Modifier.height(6.dp))
            AccentColorSelector(
                modifier = Modifier.padding(horizontal = 8.dp),
                palette = settings.palette,
                selectedToken = settings.primaryToken,
                onSelected = { color, token ->
                    onChanged(
                        settings.copy(
                            palette = settings.palette.copy(primary = color),
                            primaryToken = token,
                        )
                    )
                },
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
        Column(modifier = Modifier.withBackgroundPalette(settings.palette)) {
            Text(
                modifier = Modifier
                    .padding(top = 12.dp, bottom = 4.dp)
                    .padding(horizontal = 16.dp),
                text = "Secondary color",
                style = MaterialTheme.typography.titleMedium,
            )
            Spacer(modifier = Modifier.height(6.dp))
            AccentColorSelector(
                modifier = Modifier.padding(horizontal = 8.dp),
                palette = settings.palette,
                selectedToken = settings.secondaryToken,
                onSelected = { color, token ->
                    onChanged(
                        settings.copy(
                            palette = settings.palette.copy(secondary = color),
                            secondaryToken = token,
                        )
                    )
                },
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
