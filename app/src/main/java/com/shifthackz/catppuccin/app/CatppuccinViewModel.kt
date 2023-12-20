package com.shifthackz.catppuccin.app

import androidx.lifecycle.ViewModel
import com.shifthackz.catppuccin.app.navigation.NavigationUiItem
import com.shifthackz.catppuccin.app.settings.SettingsUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CatppuccinViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(CatppuccinUiState())
    val uiState: StateFlow<CatppuccinUiState> = _uiState.asStateFlow()

    fun applySettings(settingsUiState: SettingsUiState) {
        _uiState.update {
            it.copy(settingsUiState = settingsUiState)
        }
    }

    fun navigate(item: NavigationUiItem) {
        _uiState.update {
            it.copy(navigationUiItem = item)
        }
    }
}
