package com.joo.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import java.math.*;

public class MainActivity extends AppCompatActivity {
    private EditText editText1,editText2;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view){
        editText1 = (EditText) findViewById(R.id.text1);
        editText2 = (EditText) findViewById(R.id.text2);
        String n1=editText1.getText().toString();
        String n2=editText2.getText().toString();
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        double result = num1 + num2;
        display(result);
    }
    public void sub(View view){
        editText1 = (EditText) findViewById(R.id.text1);
        editText2 = (EditText) findViewById(R.id.text2);
        int num1 = Integer.parseInt(editText1.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());
        double result = num2-num1;
        display(result);
    }
    public void mult(View view){
        editText1 = (EditText) findViewById(R.id.text1);
        editText2 = (EditText) findViewById(R.id.text2);
        String n1=editText1.getText().toString();
        String n2=editText2.getText().toString();
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        double result = num1 * num2;
        display(result);
    }
    public void div(View view){
        editText1 = (EditText) findViewById(R.id.text1);
        editText2 = (EditText) findViewById(R.id.text2);
        int num1 = Integer.parseInt(editText1.getText().toString());
        int num2 = Integer.parseInt(editText2.getText().toString());
        int result = num2/num1;
        display(result);
    }
    public void rem(View view){
        editText1 = (EditText) findViewById(R.id.text1);
        editText2 = (EditText) findViewById(R.id.text2);
        String n1=editText1.getText().toString();
        String n2=editText2.getText().toString();
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        double result = num2 % num1;
        display(result);
    }
    public void sq(View view){
        editText1 = (EditText) findViewById(R.id.text1);
        editText2 = (EditText) findViewById(R.id.text2);
        String n1=editText1.getText().toString();
        String n2=editText2.getText().toString();
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        double result = Math.pow(num1,num2);
        display(result);
    }
    public void display(double number){
        TextView displayIntege = (TextView) findViewById(R.id.result);
        displayIntege.setText(""+number);
    }
}