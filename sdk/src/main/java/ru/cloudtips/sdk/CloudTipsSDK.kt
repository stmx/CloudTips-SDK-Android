package ru.cloudtips.sdk

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
	}
}

internal class CloudTipsSDKImpl: CloudTipsSDK {

	override fun start(configuration: TipsConfiguration, from: AppCompatActivity, requestCode: Int) {
		from.startActivityForResult(TipsActivity.getStartIntent(from, configuration), requestCode)
	}
}