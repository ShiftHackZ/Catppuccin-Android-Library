package com.shifthackz.catppuccin.app.settings

import com.shifthackz.catppuccin.app.utils.CatppuccinColorToken
import com.shifthackz.catppuccin.compose.CatppuccinMaterial

data class SettingsUiState(
    val palette: CatppuccinMaterial = CatppuccinMaterial.Frappe(),
    val primaryToken: CatppuccinColorToken = CatppuccinColorToken.BLUE,
    val secondaryToken: CatppuccinColorToken = CatppuccinColorToken.SKY,
)
