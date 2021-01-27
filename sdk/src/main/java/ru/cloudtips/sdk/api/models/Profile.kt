package ru.cloudtips.sdk.api.models

import com.google.gson.annotations.SerializedName

data class Profile(
	@SerializedName("name") val name: String?,
	@SerializedName("photoUrl") val photoUrl: String?,
	@SerializedName("receiverType") val receiverType: String?,
	@SerializedName("purposeText") val purposeText: String?,
	@SerializedName("successPageText") val successPageText: String?,
	@SerializedName("paymentPageType") val paymentPageType: String?)
