package com.plaisir.victor

import java.io.Serializable

data class IdolModel(
        val ID: Number,
        val name: String,
        val img_background: Int,
        val img_icon: Int,
        val access_lv: Number,
        val age: Number,
        val police: String,
        val police_size: Float,
        val activity_name: String
) : Serializable