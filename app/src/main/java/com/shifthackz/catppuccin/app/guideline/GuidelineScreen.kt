package com.shifthackz.catppuccin.app.guideline

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shifthackz.catppuccin.app.settings.SettingsUiState
import com.shifthackz.catppuccin.app.ui.CheckBoxWithText
import com.shifthackz.catppuccin.app.ui.RadioButtonWithText
import com.shifthackz.catppuccin.app.utils.withBackgroundPalette

@Composable
@Preview(showBackground = true)
fun GuidelineScreen(
    modifier: Modifier = Modifier,
    settings: SettingsUiState = SettingsUiState(),
) {
    Column(
        modifier = modifier.verticalScroll(rememberScrollState()),
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Column(
            modifier = Modifier.withBackgroundPalette(settings.palette),
        ) {
            var isError by remember { mutableStateOf(false) }
            var supportingText by remember { mutableStateOf(false) }
            var text by remember { mutableStateOf("") }
            Text(
                modifier = Modifier
                    .padding(top = 12.dp, bottom = 4.dp)
                    .padding(horizontal = 16.dp),
                text = "TextField example",
                style = MaterialTheme.typography.titleMedium,
            )
            Spacer(modifier = Modifier.height(6.dp))
            TextField(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxSize(),
                value = text,
                onValueChange = { text = it },
                isError = isError,
                supportingText = supportingText.takeIf { it }?.let {
                    {
                        val prefix = if (isError) "Error" else "Supporting"
                        Text(
                            text = "$prefix text example",
                            color = LocalContentColor.current,
                        )
                    }
                },
            )
            Spacer(modifier = Modifier.height(8.dp))
            CheckBoxWithText(
                modifier = Modifier.fillMaxWidth(),
                text = "Show supporting text",
                checked = supportingText,
                onCheckedChange = { supportingText = it },
            )
            CheckBoxWithText(
                modifier = Modifier.fillMaxWidth(),
                text = "Error state",
                checked = isError,
                onCheckedChange = { isError = it },
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .withBackgroundPalette(settings.palette),
        ) {
            Text(
                modifier = Modifier
                    .padding(top = 12.dp, bottom = 4.dp)
                    .padding(horizontal = 16.dp),
                text = "Buttons example",
                style = MaterialTheme.typography.titleMedium,
            )
            Spacer(modifier = Modifier.height(6.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                onClick = { },
            ) {
                Icon(
                    imageVector = Icons.Default.ThumbUp,
                    contentDescription = null,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Filled Button",
                    color = LocalContentColor.current,
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            OutlinedButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                onClick = { },
            ) {
                Icon(
                    imageVector = Icons.Default.ThumbUp,
                    contentDescription = null,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Outlined Button",
                    color = LocalContentColor.current,
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .withBackgroundPalette(settings.palette),
        ) {
            Text(
                modifier = Modifier
                    .padding(top = 12.dp, bottom = 4.dp)
                    .padding(horizontal = 16.dp),
                text = "Radio buttons example",
                style = MaterialTheme.typography.titleMedium,
            )
            Spacer(modifier = Modifier.height(6.dp))
            val options = listOf(
                "Option 1",
                "Option 2",
                "Option 3",
            )
            var selectedOption by remember { mutableStateOf(options.first()) }
            options.forEach {
                RadioButtonWithText(
                    modifier = Modifier.fillMaxWidth(),
                    text = it,
                    selected = selectedOption == it,
                    onClick = { selectedOption = it },
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
        }
    }
}
