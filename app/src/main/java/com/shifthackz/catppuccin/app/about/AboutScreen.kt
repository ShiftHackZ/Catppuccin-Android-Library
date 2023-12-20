package com.shifthackz.catppuccin.app.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shifthackz.catppuccin.app.R
import com.shifthackz.catppuccin.app.utils.getVersionString
import com.shifthackz.catppuccin.app.utils.openWebPage

const val GITHUB_LIB = "https://github.com/ShiftHackZ/Catppuccin-Android-Library"
const val GITHUB_CATPPUCCIN = "https://github.com/catppuccin/catppuccin"

@Composable
@Preview(showBackground = true)
fun AboutScreen(
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.weight(1f))

        Image(
            modifier = Modifier.size(200.dp),
            painter = painterResource(id = R.drawable.catppuccin),
            contentDescription = "Catppuccin",
        )
        Text(
            text = "Catppuccin",
            style = MaterialTheme.typography.displaySmall,
        )
        Text(
            text = "Android Library",
            style = MaterialTheme.typography.headlineSmall,
        )

        Spacer(modifier = Modifier.weight(2f))

        Text(
            text = "Version ${context.getVersionString()}",
            style = MaterialTheme.typography.labelLarge,
        )
        Text(
            text = "Made with \uD83D\uDC9C by ShiftHackZ",
            style = MaterialTheme.typography.labelLarge,
        )
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            ) {
            Button(
                modifier = Modifier
                    .weight(1f),
                onClick = { context.openWebPage(GITHUB_LIB) },
            ) {
                Icon(
                    imageVector = Icons.Default.Code,
                    contentDescription = null,
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "GitHub",
                    color = LocalContentColor.current,
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            OutlinedButton(
                    modifier = Modifier

                        .weight(1f),
            onClick = { context.openWebPage(GITHUB_CATPPUCCIN) },
            ) {
                Icon(
                    imageVector = Icons.Default.Palette,
                    contentDescription = null,
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "Palette",
                    color = LocalContentColor.current,
                )
            }
        }


        Spacer(modifier = Modifier.height(16.dp))
    }
}
