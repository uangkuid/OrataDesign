package com.oratakashi.design.component.alert

import androidx.compose.ui.graphics.Color

/**
 * OraAlertColors data class represents the container and content colors used in an alert component.
 * @author oratakashi
 * @since 01 Nov 2025
 * @param containerColor the container color of this alert component
 * @param contentColor the content color of this alert component
 * @param borderColor the border color of this alert component
 * @param containerIconColor the container icon color of this alert component
 * @param contentIconColor the content icon color of this alert component
 * @param actionColor the action color of this alert component
 */
data class OraAlertColors(
    val containerColor: Color,
    val contentColor: Color,
    val borderColor: Color,
    val containerIconColor: Color,
    val contentIconColor: Color,
    val actionColor: Color
)