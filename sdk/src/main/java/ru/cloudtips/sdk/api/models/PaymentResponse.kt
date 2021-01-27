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

 //{"transactionId":10262059,"md":"10262059","paReq":"+/eyJNZXJjaGFudE5hbWUiOm51bGwsIkZpcnN0U2l4IjoiNDI0MjQyIiwiTGFzdEZvdXIiOiI0MjQyIiwiQW1vdW50IjoxMDAuMCwiQ3VycmVuY3lDb2RlIjoiUlVCIiwiRGF0ZSI6IjIwMjEtMDEtMjJUMDA6MDA6MDArMDM6MDAiLCJDdXN0b21lck5hbWUiOm51bGwsIkN1bHR1cmVOYW1lIjoicnUtUlUifQ==","acsUrl":"https://demo-preprod.cloudpayments.ru/Acs","message":null,"statusCode":"Need3ds","cardToken":null,"partnerRedirectUrl":null}
//{"type":"InsufficientFunds","title":"Ошибка оплаты!","status":422,"detail":"На карте недостаточно средств. Пожалуйста, пополните баланс или воспользуйтесь другой картой."}
