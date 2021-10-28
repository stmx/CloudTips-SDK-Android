package ru.cloudtips.sdk.api.models

import com.google.gson.annotations.SerializedName

data class PaymentResponse(
		@SerializedName("statusCode") val statusCode: String?,
		@SerializedName("transactionId") val transactionId: String?,
		@SerializedName("acsUrl") val acsUrl: String?,
		@SerializedName("paReq") val paReq: String?,
		@SerializedName("md") val md: String?,
		@SerializedName("status") val status: String?,
		@SerializedName("title") val title: String?,
		@SerializedName("detail") val detail: String?)