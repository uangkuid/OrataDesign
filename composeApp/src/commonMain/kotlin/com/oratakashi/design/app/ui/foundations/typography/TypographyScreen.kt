package com.oratakashi.design.app.ui.foundations.typography

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.oratakashi.design.app.models.Constant
import com.oratakashi.design.app.models.TypographyData
import com.oratakashi.design.foundation.OrataTheme
import com.oratakashi.design.foundation.typography.OraTypographyKeyToken
import com.oratakashi.design.foundation.typography.toTextStyle
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview(
    showBackground = true
)
@Composable
internal fun TypographyScreen(
    modifier: Modifier = Modifier
) {
    // use constant lists directly (they are static) and avoid calling @Composable remember here
    val displayItems = remember { Constant.displayItems() }
    val headlineItems = remember { Constant.headlineItems() }
    val titleItems = remember { Constant.titleItems() }
    val labelItems = remember { Constant.labelItems() }
    val bodyItems = remember { Constant.bodyItems() }

    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(bottom = 100.dp, start = 16.dp, end = 16.dp)
    ) {
        // header with stable lowercase key
        item(key = "display") {
            Text(
                text = "Display",
                style = OrataTheme.typography.titleLarge(),
            )
        }
        // use items overload with stable key and contentType to improve recycling
        items(
            items = displayItems,
            key = { "display_${it.title}_${it.size}_${it.font}" },
            contentType = { "display" }
        ) { data ->
            TypographyItem(data = data)
        }
        // header with stable lowercase key
        item(key = "headline") {
            Text(
                text = "Headline",
                style = OrataTheme.typography.titleLarge(),
                modifier = Modifier.padding(top = 24.dp)
            )
        }
        items(
            items = headlineItems,
            key = { "headline_${it.title}_${it.size}_${it.font}" },
            contentType = { "headline" }
        ) { data ->
            TypographyItem(data = data)
        }
        // header with stable lowercase key
        item(key = "title") {
            Text(
                text = "Title",
                style = OrataTheme.typography.titleLarge(),
                modifier = Modifier.padding(top = 24.dp)
            )
        }
        items(
            items = titleItems,
            key = { "title_${it.title}_${it.size}_${it.font}" },
            contentType = { "title" }
        ) { data ->
            TypographyItem(data = data)
        }
        // header with stable lowercase key
        item(key = "label") {
            Text(
                text = "Label",
                style = OrataTheme.typography.titleLarge(),
                modifier = Modifier.padding(top = 24.dp)
            )
        }
        items(
            items = labelItems,
            key = { "label_${it.title}_${it.size}_${it.font}" },
            contentType = { "label" }
        ) { data ->
            TypographyItem(data = data)
        }
        // header with stable lowercase key
        item(key = "body") {
            Text(
                text = "Body",
                style = OrataTheme.typography.titleLarge(),
                modifier = Modifier.padding(top = 24.dp)
            )
        }
        items(
            items = bodyItems,
            key = { "body_${it.title}_${it.size}_${it.font}" },
            contentType = { "body" }
        ) { data ->
            TypographyItem(data = data)
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun TypographyItem(
    data: TypographyData = TypographyData(
        title = "Display Large",
        style = OraTypographyKeyToken.DisplayLarge,
        name = "Display",
        size = "Large",
        font = "Montserrat",
        lineHeight = "57",
        letterSpacing = "64"
    )
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(7.dp)
    ) {
        Text(
            text = data.title,
            style = data.style.toTextStyle(),
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(7.dp)
        ) {
            Text(
                text = data.name,
                style = OrataTheme.typography.bodyMedium()
            )
            Text(text = "/", style = OrataTheme.typography.bodyMedium())
            Text(text = data.size, style = OrataTheme.typography.bodyMedium())
            Text(text = "•", style = OrataTheme.typography.bodyMedium())
            Text(text = data.font, style = OrataTheme.typography.bodyMedium())
            Text(text = "•", style = OrataTheme.typography.bodyMedium())
            Text(
                text = "${data.lineHeight}/${data.letterSpacing}",
                style = OrataTheme.typography.bodyMedium()
            )
        }
    }
}
