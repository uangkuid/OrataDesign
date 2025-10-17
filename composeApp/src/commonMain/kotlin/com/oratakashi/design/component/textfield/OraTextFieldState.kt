package com.oratakashi.design.component.textfield

/**
 * OraTextFieldState is a sealed class that defines different states for text fields,
 * each state is represented by a data class which may carry an optional caption.
 * @author oratakashi
 * @since 16 Oct 2025
 */
sealed class OraTextFieldState(open val caption: String? = null) {
    data class Default(override val caption: String? = null) : OraTextFieldState(caption)
    data class Success(override val caption: String? = null) : OraTextFieldState(caption)
    data class Error(override val caption: String? = null) : OraTextFieldState(caption)
    data class Locked(override val caption: String? = null) : OraTextFieldState(caption)
}