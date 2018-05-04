package com.avi.achi.manageapi

/**
 * Created by USER on 19/4/2561.
 */

data class ApiResponse<out T>(val Status: Int, val Message: String, val data: T)