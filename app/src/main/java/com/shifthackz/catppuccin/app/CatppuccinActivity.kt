@file:OptIn(ExperimentalMaterial3Api::class)

package com.shifthackz.catppuccin.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.shifthackz.catppuccin.app.about.AboutScreen
import com.shifthackz.catppuccin.app.guideline.GuidelineScreen
import com.shifthackz.catppuccin.app.navigation.NavigationUiItem
import com.shifthackz.catppuccin.app.settings.SettingsScreen
import com.shifthackz.catppuccin.app.typography.TypographyScreen
import com.shifthackz.catppuccin.compose.CatppuccinTheme

class CatppuccinActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBar?.hide()
        val viewModel: CatppuccinViewModel by viewModels()
        setContent {
            val uiState by viewModel.uiState.collectAsStateWithLifecycle()
            val uiLabel: @Composable (NavigationUiItem) -> Unit = {
                Text(
                    text = it.label,
                    color = LocalContentColor.current,
                )
            }
            val uiIcon: @Composable (Modifier, NavigationUiItem) -> Unit =
                { modifier: Modifier, navigationUiItem: NavigationUiItem ->
                    Icon(
                        modifier = modifier,
                        imageVector = navigationUiItem.icon,
                        contentDescription = uiState.navigationUiItem.label,
                        tint = LocalContentColor.current,
                    )
                }
            CatppuccinTheme.Palette(
                palette = uiState.settingsUiState.palette,
            ) {
                Surface {
                    Scaffold(
                        topBar = {
                            CenterAlignedTopAppBar(
                                title = { uiLabel(uiState.navigationUiItem) },
                            )
                        },
                        bottomBar = {
                            NavigationBar {
                                NavigationUiItem.entries.forEach { item ->
                                    val selected = item.id == uiState.navigationUiItem.id
                                    NavigationBarItem(
                                        selected = selected,
                                        onClick = { if (!selected) viewModel.navigate(item) },
                                        icon = { uiIcon(Modifier, item) },
                                        label = { uiLabel(item) },
                                    )
                                }
                            }
                        },
                    ) { paddingValues ->
                        val modifier = Modifier.padding(paddingValues)
                        when (uiState.navigationUiItem) {
                            NavigationUiItem.STYLEGUIDE -> GuidelineScreen(
                                modifier = modifier,
                                settings = uiState.settingsUiState,
                            )

                            NavigationUiItem.TYPOGRAPHY -> TypographyScreen(
                                modifier = modifier,
                            )

                            NavigationUiItem.SETTINGS -> SettingsScreen(
                                modifier = modifier,
                                settings = uiState.settingsUiState,
                                onChanged = viewModel::applySettings,
                            )

                            NavigationUiItem.ABOUT -> AboutScreen(
                                modifier = modifier,
                            )
                        }
                    }
                }
            }
        }
    }
}
