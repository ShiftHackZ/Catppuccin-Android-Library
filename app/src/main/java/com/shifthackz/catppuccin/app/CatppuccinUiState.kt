package com.shifthackz.catppuccin.app

import com.shifthackz.catppuccin.app.navigation.NavigationUiItem
import com.shifthackz.catppuccin.app.settings.SettingsUiState

data class CatppuccinUiState(
    val settingsUiState: SettingsUiState = SettingsUiState(),
    val navigationUiItem: NavigationUiItem = NavigationUiItem.entries.first(),
)
