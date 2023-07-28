package com.punedelights.partners.helper

interface VolleyCallback {
    fun onSuccess(
        result: Boolean,
        message: String?
    ) //void onSuccessWithMsg(boolean result, String message);
}