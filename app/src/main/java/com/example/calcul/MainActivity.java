package com.example.calcul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Culc(View view){
        TextView res = findViewById(R.id.textView);
        EditText first =findViewById(R.id.first_numb);
        EditText second =findViewById(R.id.second_numb);
        EditText operator =findViewById(R.id.operator);

        Toast toast = Toast.makeText(this,"Не ломай систему, идиот",Toast.LENGTH_SHORT);

        int fir = Integer.parseInt(first.getText().toString());
        int sec = Integer.parseInt(second.getText().toString());
        String op = operator.getText().toString();
        int resul;
        switch (op){
            case("+"):
                resul = fir+sec;
                res.setText(Integer.toString(resul));
                break;
            case("-"):
                resul = fir-sec;
                res.setText(Integer.toString(resul));
                break;
            case("/"):
                resul = fir/sec;
                res.setText(Integer.toString(resul));
                break;
            case("*"):
                resul = fir*sec;
                res.setText(Integer.toString(resul));
                break;
            default:
                toast.show();
                break;
        }
    }
}