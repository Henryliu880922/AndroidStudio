package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SingleChoose extends AppCompatActivity {
    private RadioGroup rg;
    private Button btn_single;
    private TextView tv_result;
    private RadioButton rb_boy,rb_girl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singlechoose);

        rb_boy = findViewById(R.id.rb_boy);
        rb_girl = findViewById(R.id.rb_girl);
        rg = findViewById(R.id.rg);
        btn_single = findViewById(R.id.btn_single);
        tv_result = findViewById(R.id.tv_result);

        btn_single.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rg.getCheckedRadioButtonId()){
                    case R.id.rb_boy:
                        tv_result.setText("你是："+rb_boy.getText()+"的");
                        break;
                    case R.id.rb_girl:
                        tv_result.setText("你是："+rb_girl.getText()+"的");
                        break;
                }
            }
        });
    }
}