package ru.cloudtips.sdk.api

const val HOST = "https://lk.cloudtips.ru/"
const val HOST_PREPROD = "https://lk-sandbox.cloudtips.ru/"
const val API_URL = "api/"

const val API_ENDPOINT = HOST + API_URL
const val API_ENDPOINT_PREPROD = HOST_PREPROD + API_URL

object ApiEndPoint {

    var testMode = false

    fun getUrl(): String {
        return if (testMode) {
            API_ENDPOINT_PREPROD
        } else {
            API_ENDPOINT
        }
    }
}