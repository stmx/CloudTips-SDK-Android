package ru.cloudtips.sdk

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import androidx.appcompat.app.AppCompatActivity
import ru.cloudtips.sdk.ui.TipsActivity

interface CloudTipsSDK {

    fun start(configuration: TipsConfiguration, from: AppCompatActivity, requestCode: Int)

    enum class TransactionStatus {
        Succeeded,
        Cancelled;
    }

    enum class IntentKeys {
        TransactionStatus;
    }

    companion object {
        fun getInstance(): CloudTipsSDK {
            return CloudTipsSDKImpl()
        }

        fun getContract(): ActivityResultContract<TipsConfiguration, TransactionStatus?> {
            return CloudTipsContract()
        }
    }
}

internal class CloudTipsSDKImpl : CloudTipsSDK {

    override fun start(
		configuration: TipsConfiguration,
		from: AppCompatActivity,
		requestCode: Int,
	) {
        from.startActivityForResult(TipsActivity.getStartIntent(from, configuration), requestCode)
    }
}

internal class CloudTipsContract :
    ActivityResultContract<TipsConfiguration, CloudTipsSDK.TransactionStatus?>() {
    override fun createIntent(context: Context, configuration: TipsConfiguration): Intent {
        return TipsActivity.getStartIntent(context, configuration)
    }

    override fun parseResult(resultCode: Int, result: Intent?): CloudTipsSDK.TransactionStatus? {
        if (result == null) return null
        if (resultCode != Activity.RESULT_OK) return null
        return when (val transactionStatus =
            result.getSerializableExtra(CloudTipsSDK.IntentKeys.TransactionStatus.name)) {
            is CloudTipsSDK.TransactionStatus -> transactionStatus
            else -> null
        }
    }
}