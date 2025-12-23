package com.oratakashi.design.component.alert

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.oratakashi.design.foundation.OrataTheme
import com.oratakashi.design.resources.Res
import com.oratakashi.design.resources.ic_alert_triangle_filled
import com.oratakashi.design.resources.ic_circle_check_filled
import com.oratakashi.design.resources.ic_circle_x_filled
import com.oratakashi.design.resources.ic_info_circle_filled
import org.jetbrains.compose.resources.painterResource

/**
 * OraAlertDefaults is an object that provides default values and configurations for [com.oratakashi.design.component.alert.OraAlert] components.
 * It centralizes the default settings for consistent button behavior and appearance across the app.
 * @author oratakashi
 * @since 02 Nov 2025
 */
object OraAlertDefaults {
    /**
     * colors function creates a [com.oratakashi.design.component.alert.OraAlertColors] that represents the default container and content colors used in a
     * [com.oratakashi.design.component.alert.OraAlert].
     * @author oratakashi
     * @since 02 Nov 2025
     * @param containerColor the container color of this alert component
     * @param contentColor the content color of this alert component
     * @param borderColor the border color of this alert component
     * @param containerIconColor the container icon color of this alert component
     * @param contentIconColor the content icon color of this alert component
     * @param actionColor the action color of this alert component
     */
    @Composable
    fun colors(
        containerColor: Color = OrataTheme.colors.primaryContainer,
        contentColor: Color = OrataTheme.colors.onSurface,
        borderColor: Color = OrataTheme.colors.onPrimaryContainer,
        containerIconColor: Color = OrataTheme.colors.onPrimaryContainer,
        contentIconColor: Color = OrataTheme.colors.surface,
        actionColor: Color = OrataTheme.colors.onPrimaryContainer,
    ): com.oratakashi.design.component.alert.OraAlertColors {
        return OraAlertColors(
            containerColor = containerColor,
            contentColor = contentColor,
            borderColor = borderColor,
            containerIconColor = containerIconColor,
            contentIconColor = contentIconColor,
            actionColor = actionColor
        )
    }

    /**
     * successColors colors function creates a [com.oratakashi.design.component.alert.OraAlertColors] with success variant that represents the default container and content colors used in a
     * [com.oratakashi.design.component.alert.OraAlert].
     * @author oratakashi
     * @since 02 Nov 2025
     * @param containerColor the container color of this alert component
     * @param contentColor the content color of this alert component
     * @param borderColor the border color of this alert component
     * @param containerIconColor the container icon color of this alert component
     * @param contentIconColor the content icon color of this alert component
     * @param actionColor the action color of this alert component
     */
    @Composable
    fun successColors(
        containerColor: Color = OrataTheme.colors.successContainer,
        contentColor: Color = OrataTheme.colors.onSurface,
        borderColor: Color = OrataTheme.colors.onSuccessContainer,
        containerIconColor: Color = OrataTheme.colors.onSuccessContainer,
        contentIconColor: Color = OrataTheme.colors.surface,
        actionColor: Color = OrataTheme.colors.onSuccessContainer,
    ): com.oratakashi.design.component.alert.OraAlertColors {
        return OraAlertColors(
            containerColor = containerColor,
            contentColor = contentColor,
            borderColor = borderColor,
            containerIconColor = containerIconColor,
            contentIconColor = contentIconColor,
            actionColor = actionColor
        )
    }

    /**
     * infoColors colors function creates a [com.oratakashi.design.component.alert.OraAlertColors] with info variant that represents the default container and content colors used in a
     * [com.oratakashi.design.component.alert.OraAlert].
     * @author oratakashi
     * @since 02 Nov 2025
     * @param containerColor the container color of this alert component
     * @param contentColor the content color of this alert component
     * @param borderColor the border color of this alert component
     * @param containerIconColor the container icon color of this alert component
     * @param contentIconColor the content icon color of this alert component
     * @param actionColor the action color of this alert component
     */
    @Composable
    fun infoColors(
        containerColor: Color = OrataTheme.colors.infoContainer,
        contentColor: Color = OrataTheme.colors.onSurface,
        borderColor: Color = OrataTheme.colors.onInfoContainer,
        containerIconColor: Color = OrataTheme.colors.onInfoContainer,
        contentIconColor: Color = OrataTheme.colors.surface,
        actionColor: Color = OrataTheme.colors.onInfoContainer,
    ): OraAlertColors {
        return OraAlertColors(
            containerColor = containerColor,
            contentColor = contentColor,
            borderColor = borderColor,
            containerIconColor = containerIconColor,
            contentIconColor = contentIconColor,
            actionColor = actionColor
        )
    }

    /**
     * warningColors colors function creates a [com.oratakashi.design.component.alert.OraAlertColors] with warning variant that represents the default container and content colors used in a
     * [com.oratakashi.design.component.alert.OraAlert].
     * @author oratakashi
     * @since 02 Nov 2025
     * @param containerColor the container color of this alert component
     * @param contentColor the content color of this alert component
     * @param borderColor the border color of this alert component
     * @param containerIconColor the container icon color of this alert component
     * @param contentIconColor the content icon color of this alert component
     * @param actionColor the action color of this alert component
     */
    @Composable
    fun warningColors(
        containerColor: Color = OrataTheme.colors.warningContainer,
        contentColor: Color = OrataTheme.colors.onSurface,
        borderColor: Color = OrataTheme.colors.onWarningContainer,
        containerIconColor: Color = OrataTheme.colors.onWarningContainer,
        contentIconColor: Color = OrataTheme.colors.surface,
        actionColor: Color = OrataTheme.colors.onWarningContainer,
    ): OraAlertColors {
        return OraAlertColors(
            containerColor = containerColor,
            contentColor = contentColor,
            borderColor = borderColor,
            containerIconColor = containerIconColor,
            contentIconColor = contentIconColor,
            actionColor = actionColor
        )
    }

    /**
     * errorColors colors function creates a [com.oratakashi.design.component.alert.OraAlertColors] with error variant that represents the default container and content colors used in a
     * [com.oratakashi.design.component.alert.OraAlert].
     * @author oratakashi
     * @since 02 Nov 2025
     * @param containerColor the container color of this alert component
     * @param contentColor the content color of this alert component
     * @param borderColor the border color of this alert component
     * @param containerIconColor the container icon color of this alert component
     * @param contentIconColor the content icon color of this alert component
     * @param actionColor the action color of this alert component
     */
    @Composable
    fun errorColors(
        containerColor: Color = OrataTheme.colors.errorContainer,
        contentColor: Color = OrataTheme.colors.onSurface,
        borderColor: Color = OrataTheme.colors.onErrorContainer,
        containerIconColor: Color = OrataTheme.colors.onErrorContainer,
        contentIconColor: Color = OrataTheme.colors.surface,
        actionColor: Color = OrataTheme.colors.onErrorContainer,
    ): OraAlertColors {
        return OraAlertColors(
            containerColor = containerColor,
            contentColor = contentColor,
            borderColor = borderColor,
            containerIconColor = containerIconColor,
            contentIconColor = contentIconColor,
            actionColor = actionColor
        )
    }

    /**
     * IconSuccess provides a default success icon for the alert component.
     * @author oratakashi
     * @since 05 Nov 2025
     */
    val IconSuccess
        get() = @Composable {
            Icon(
                painter = painterResource(Res.drawable.ic_circle_check_filled),
                contentDescription = "success",
            )
        }

    /**
     * IconInfo provides a default info icon for the alert component.
     * @author oratakashi
     * @since 05 Nov 2025
     */
    val IconInfo
        get() = @Composable {
            Icon(
                painter = painterResource(Res.drawable.ic_info_circle_filled),
                contentDescription = "info",
            )
        }

    /**
     * IconWarning provides a default warning icon for the alert component.
     * @author oratakashi
     * @since 05 Nov 2025
     */
    val IconWarning
        get() = @Composable {
            Icon(
                painter = painterResource(Res.drawable.ic_alert_triangle_filled),
                contentDescription = "warning",
            )
        }

    /**
     * IconError provides a default error icon for the alert component.
     * @author oratakashi
     * @since 05 Nov 2025
     */
    val IconError
        get() = @Composable {
            Icon(
                painter = painterResource(Res.drawable.ic_circle_x_filled),
                contentDescription = "error",
            )
        }
}