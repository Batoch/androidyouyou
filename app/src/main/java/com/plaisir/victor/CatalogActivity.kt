package com.plaisir.victor

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

const val FROM_YOU_EXTRA_KEY = "FROM_YOU_EXTRA_KEY"

class CatalogActivity : AppCompatActivity() {

    private val idols: ArrayList<IdolModel> = arrayListOf<IdolModel>()
    private lateinit var rcvIdols: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        idols.add(IdolModel(1, "L'Otello", R.drawable.idol_background, R.drawable.otello_lapin, 0, 22, "wideg", 36F, "YouActivity"))
        idols.add(IdolModel(2, "Deng le president", R.drawable.background_china, R.drawable.deng, 0, 25, "zenzai", 38F, "DengActivity"))

        this.rcvIdols = findViewById(R.id.a_catalog)
        this.rcvIdols.adapter = IdolAdapter(idols)
        val linearLayoutManager = LinearLayoutManager(this)
        this.rcvIdols.layoutManager = linearLayoutManager

        val dividerItemDecoration = DividerItemDecoration(this, linearLayoutManager.orientation)
        this.rcvIdols.addItemDecoration(dividerItemDecoration)

    }

    fun idolClic(view: View) {
        Toast.makeText(this, "Not implemented yet", Toast.LENGTH_SHORT).show()
    }

}