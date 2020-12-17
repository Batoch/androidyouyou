package com.plaisir.victor

import android.R
import android.content.Context
import android.content.SharedPreferences
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView


class IdolAdapter(
        private val idols: ArrayList<IdolModel>
) : RecyclerView.Adapter<IdolViewHolder>() {

    private lateinit var eContext: Context
    private lateinit var prefs: SharedPreferences

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IdolViewHolder {
        val rowView = LayoutInflater.from(parent.context).inflate(R.layout.element_idol, parent, false)
        eContext = parent.context
        return IdolViewHolder(rowView)
    }

    override fun onBindViewHolder(holder: IdolViewHolder, position: Int) {
        val (id, name, img_icon, img_background) = idols[position]

        holder.txvIdolName.text = name
        holder.imvIdol.setImageResource(img_icon)
        holder.setBackgroundResource(img_background)

        ((selector_view.getAdapter() as SimpleTabPagerAdapter).getItem(position) as ImageView).setBackgroundResource(R.drawable.p_photo_marked)


        //Toast.makeText(eContext, "favList : $isFavoriteVal", Toast.LENGTH_SHORT).show()
    }

    private fun isFavorite(id: String, favoriteList: Set<String>): Boolean {
        favoriteList.forEach {
            if (it == id)
                return true
        }
        return false
    }

    override fun getItemCount(): Int {
        return this.idols.size

    }
}