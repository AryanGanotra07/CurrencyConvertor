package com.ubtpro.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view){

        EditText editText=(EditText) findViewById(R.id.editText);
        Double dollarAmount=Double.parseDouble(editText.getText().toString());
        Double rupees=dollarAmount*70.25;

        Toast.makeText(MainActivity.this, "Rs"+rupees.toString(),Toast.LENGTH_SHORT).show();
        Log.i("amount",editText.getText().toString());

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

}
