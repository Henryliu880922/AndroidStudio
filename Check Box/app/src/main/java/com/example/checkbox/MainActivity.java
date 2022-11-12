package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_result = findViewById(R.id.btn_result);

        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox cb;
                String result = "";

                int []id = {R.id.dance,R.id.paint,R.id.study,R.id.computer};
                for (int i:id){
                    cb = (CheckBox) findViewById(i);
                    if (cb.isChecked()){
                        result+="\n"+cb.getText();
                    }
                }
                if (result.length()>0){
                    result = "你的興趣：" +result;
                }
                else
                    result = "可憐沒興趣";

                tv_result = findViewById(R.id.tv_result);
                tv_result.setText(result);
            }
        });
    }
}