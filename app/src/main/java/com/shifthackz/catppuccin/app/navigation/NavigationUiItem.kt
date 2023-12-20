package com.shifthackz.catppuccin.app.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

enum class NavigationUiItem(
    val id: Int,
    val icon: ImageVector,
    val label: String,
) {
    ABOUT(
        id = 0,
        icon = Icons.Default.Info,
        label = "About",
    ),
    STYLEGUIDE(
        id = 1,
        icon = Icons.Default.Face,
        label = "Styleguide",
    ),
    TYPOGRAPHY(
        id = 2,
        icon = Icons.Default.Create,
        label = "Typography",
    ),
    SETTINGS(
        id = 3,
        icon = Icons.Default.Settings,
        label = "Settings",
    ),
}
