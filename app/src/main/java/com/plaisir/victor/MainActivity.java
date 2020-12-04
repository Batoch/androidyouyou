package com.plaisir.victor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Boolean victorcontent = Boolean.FALSE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.a_main_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changervictor();
            }
        });

    }
    @SuppressLint("SetTextI18n")
    public void changervictor(){
        victorcontent = !victorcontent;
        if (victorcontent){
            findViewById(R.id.a_main_img_victorheurx).setVisibility(View.VISIBLE);
            button.setText("Calmer victor");
        }
        else {
            findViewById(R.id.a_main_img_victorheurx).setVisibility(View.INVISIBLE);
            button.setText("Refaire du bien a Victor");
        }

    }

}

