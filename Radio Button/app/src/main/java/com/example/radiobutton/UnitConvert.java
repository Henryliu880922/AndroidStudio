package com.example.radiobutton;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class UnitConvert extends AppCompatActivity implements TextWatcher,RadioGroup.OnCheckedChangeListener {
    private RadioGroup un_rg;
    private EditText un_txt_input;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.unitconvert);

        un_rg = findViewById(R.id.un_rg);
        un_txt_input = findViewById(R.id.un_txt_input);

        un_rg.setOnCheckedChangeListener(this);
        un_txt_input.addTextChangedListener(this);
    }
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i,int i1,int i2){

    }
    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2){

    }
    @Override
    public void afterTextChanged(Editable editable){
        calc();
    }
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i){
        calc();
    }
    private void calc(){
        TextView tv_km = findViewById(R.id.tv_km);
        TextView tv_mi = findViewById(R.id.tv_mi);

        double km,mi;
        if(un_rg.getCheckedRadioButtonId()==R.id.rb_km){
            km = Double.parseDouble(un_txt_input.getText().toString());
            mi = km*0.621;
        }
        else{
            mi = Double.parseDouble(un_txt_input.getText().toString());
            km = mi*0.621;
        }
        tv_km.setText("公里/小時：" + km);
        tv_mi.setText("英里/小時："+ mi);
    }
}
