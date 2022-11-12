package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ExternalPicture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.externalpicture);

        Button btn_change = findViewById(R.id.btn_change);
        ImageView iv_external = findViewById(R.id.iv_external);

        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_external.setImageResource(R.drawable.steam2);
            }
        });
    }
}
