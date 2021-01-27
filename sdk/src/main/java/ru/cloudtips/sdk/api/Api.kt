package ru.cloudtips.sdk.api

import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import ru.cloudtips.sdk.api.models.*


class Api {

    companion object {

        fun getLayout(phoneNumber: String): Single<ArrayList<Layout>> {
            return ApiFactory.getTipsApi()
                .getLayout(phoneNumber)
                .subscribeOn(Schedulers.io())
        }

        fun offlineRegister(phoneNumber: String, name: String): Single<ArrayList<Layout>> {

            var body = OfflineRegisterRequestBody(phoneNumber = phoneNumber,
                    name = name)

            return ApiFactory.getTipsApi()
                .offlineRegister(body)
                .subscribeOn(Schedulers.io())
        }

        fun getUser(layoutId: String): Single<Profile> {
            return ApiFactory.getTipsApi()
                .getUser(layoutId)
                .subscribeOn(Schedulers.io())
        }

        fun getPaymentPage(layoutId: String): Single<PaymentPage> {
            return ApiFactory.getTipsApi()
                .getPaymentPage(layoutId)
                .subscribeOn(Schedulers.io())
        }

        fun getPublicId(layoutId: String): Single<PublicId> {

            var body = GetPublicIdRequestBody(layoutId = layoutId)

            return ApiFactory.getTipsApi()
                .getPublicId(body)
                .subscribeOn(Schedulers.io())
        }

        fun verify(version: String, token: String, amount: String, layoutId: String): Single<VerifyResponse> {

            val body = VerifyRequestBody(version = version,
                token = token,
                amount = amount,
                layoutId = layoutId)

            return ApiFactory.getTipsApi()
                .verify(body)
                .subscribeOn(Schedulers.io())
        }

        fun auth(layoutId: String, cryptogram: String, amount: String, comment: String, token: String): Single<PaymentResponse> {

            val body = PaymentRequestBody(layoutId = layoutId,
                cryptogram = cryptogram,
                amount = amount,
                comment = comment,
                captchaVerificationToken = token)

            return ApiFactory.getTipsApi()
                .auth(body)
                .subscribeOn(Schedulers.io())
        }

        fun postThreeDs(md: String, paRes: String): Single<PaymentResponse> {

            val body = PostThreeDsRequestBody(md = md,
                    paRes = paRes)

            return ApiFactory.getTipsApi()
                    .postThreeDs(body)
                    .subscribeOn(Schedulers.io())
        }
    }
}