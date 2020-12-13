package com.appbatik.appbatik.data.model

data class ActionState<T>(
    val data: T? = null,
    val message: String? = null,
    val isSuccess: Boolean = true,
    var isCosumed: Boolean = false
)
