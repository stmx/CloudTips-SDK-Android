package ru.cloudtips.sdk.api.models

import com.google.gson.annotations.SerializedName

data class PaymentPage(
	@SerializedName("amount") val amount: PaymentPageAmount?)

data class PaymentPageAmount(
	@SerializedName("constraints") val constraints: ArrayList<AmountConstraint>?)

data class AmountConstraint(
	@SerializedName("type") val type: String?,
	@SerializedName("currency") val currency: String?,
	@SerializedName("value") val value: Int)

