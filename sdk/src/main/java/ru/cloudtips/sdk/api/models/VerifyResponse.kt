package ru.cloudtips.sdk.api.models

import com.google.gson.annotations.SerializedName

data class VerifyResponse(
	@SerializedName("status") val status: String?,
	@SerializedName("token") val token: String?,
	@SerializedName("type") val type: String?)