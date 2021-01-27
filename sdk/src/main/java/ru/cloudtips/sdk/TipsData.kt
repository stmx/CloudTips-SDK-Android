package ru.cloudtips.sdk

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class TipsData(val phone: String, val name: String): Parcelable