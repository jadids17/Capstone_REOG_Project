package com.reihan.reogapp.preferences

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ReogModel (
    var id: String,
    var name: String,
    var token: String
) : Parcelable