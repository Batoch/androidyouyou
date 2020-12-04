package com.plaisir.victor

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var victorEstNormal: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changervictor(view: View) {
        if (victorEstNormal) {
            findViewById<ImageView>(R.id.a_main_img_victor).setImageResource(R.drawable.victorheureux)
            findViewById<ImageView>(R.id.a_main_frame).setImageResource(R.drawable.fire_frame_design)
            findViewById<Button>(R.id.a_main_btn).text = getString(R.string.CalmerVictor)
            Toast.makeText(this, "Hmmm c'est bon", Toast.LENGTH_SHORT).show()
        } else {
            findViewById<ImageView>(R.id.a_main_img_victor).setImageResource(R.drawable.victornormal)
            findViewById<ImageView>(R.id.a_main_frame).setImageResource(R.drawable.gold_frame_design)
            findViewById<Button>(R.id.a_main_btn).text = getString(R.string.faire_du_bien_a_victor)
            Toast.makeText(this, "Merci mec !", Toast.LENGTH_SHORT).show()
        }
        victorEstNormal = !victorEstNormal
    }
}