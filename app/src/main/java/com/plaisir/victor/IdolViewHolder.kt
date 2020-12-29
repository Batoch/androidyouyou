package com.plaisir.victor

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class IdolViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    var txvIdolName: TextView = itemView.findViewById(R.id.e_idol_txt_name)
    var imvIdol: ImageView = itemView.findViewById(R.id.e_idol_img)
    var imvBackground: ImageView = itemView.findViewById(R.id.e_idol_background)
}