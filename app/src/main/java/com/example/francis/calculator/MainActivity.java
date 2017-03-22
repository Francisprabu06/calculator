package com.example.francis.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calc(View v){
        EditText et1=(EditText)findViewById(R.id.edt1);
        EditText et2=(EditText)findViewById(R.id.edt2);
        TextView tv1=(TextView)findViewById(R.id.tv1);
        float a=Float.parseFloat(et1.getText().toString());
        float b=Float.parseFloat(et2.getText().toString());
        float c=0;
        switch(v.getId())
        {
            case R.id.bt1:
                c=a+b;
                break;
            case R.id.bt2:
                c=a-b;
                break;
            case R.id.bt3:
                c=a*b;
                break;
            case R.id.bt4:
                c=a/b;
                break;
        }
        tv1.setText(Float.toString(c));
    }
}
