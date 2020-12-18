package com.plaisir.victor

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class IdolAdapter(
        private val idols: ArrayList<IdolModel>
) : RecyclerView.Adapter<IdolViewHolder>() {

    private lateinit var mContext: Context
    private lateinit var prefs: SharedPreferences
    private lateinit var name: String

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IdolViewHolder {
        mContext = parent.context

        val rowView = LayoutInflater.from(parent.context).inflate(R.layout.element_idol, parent, false)
        return IdolViewHolder(rowView)
    }


    override fun onBindViewHolder(holder: IdolViewHolder, position: Int) {
        val (id, name, img_background, img_icon, access_lv, age, police, policesize, activity) = idols[position]
        this.name = name
        val face = Typeface.createFromAsset(mContext.assets, "font/$police.ttf")

        holder.txvIdolName.text = name
        holder.txvIdolName.typeface = face
        holder.txvIdolName.textSize = policesize
        holder.imvIdol.setImageResource(img_icon)

        holder.imvBackground.setImageResource(img_background)
        holder.imvBackground.setOnClickListener {
                val intent = Intent(mContext, Class.forName("com.plaisir.victor.$activity"))
                mContext.startActivity(intent) }
    }


    fun isFavorite(id: String, favoriteList: Set<String>): Boolean {
        favoriteList.forEach {
            if (it == id)
                return true
        }
        return false
    }

    fun name(): String{
        return name
    }

    override fun getItemCount(): Int {
        return this.idols.size
    }



}