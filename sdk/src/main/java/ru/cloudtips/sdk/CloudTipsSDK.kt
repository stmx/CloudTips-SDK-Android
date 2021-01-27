package ru.cloudtips.sdk

import androidx.appcompat.app.AppCompatActivity
import ru.cloudtips.sdk.ui.TipsActivity

public interface CloudTipsSDK {
	fun start(configuration: TipsConfiguration, from: AppCompatActivity)

	companion object {
		public fun getInstance(): CloudTipsSDK {
			return CloudTipsSDKImpl()
		}
	}
}

internal class CloudTipsSDKImpl: CloudTipsSDK {
	override fun start(configuration: TipsConfiguration, from: AppCompatActivity) {
		from.startActivity(TipsActivity.getStartIntent(from, configuration))
	}
}