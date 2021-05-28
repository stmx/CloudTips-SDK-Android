package ru.cloudtips.sdk

import androidx.appcompat.app.AppCompatActivity
import ru.cloudtips.sdk.ui.TipsActivity

interface CloudTipsSDK {
	fun start(configuration: TipsConfiguration, from: AppCompatActivity)

	companion object {
		fun getInstance(): CloudTipsSDK {
			return CloudTipsSDKImpl()
		}
	}
}

internal class CloudTipsSDKImpl: CloudTipsSDK {
	override fun start(configuration: TipsConfiguration, from: AppCompatActivity) {
		from.startActivity(TipsActivity.getStartIntent(from, configuration))
	}
}