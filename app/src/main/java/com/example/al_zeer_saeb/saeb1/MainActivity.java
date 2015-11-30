package com.example.al_zeer_saeb.saeb1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity {


    Random r=new Random();
    Button but;
    EditText ed;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int num=r.nextInt(1000);
        but=(Button)findViewById(R.id.button);
        ed= (EditText)(findViewById(R.id.editText1));

        but.setOnClickListener(new View.OnClickListener() {
Toast t;
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(ed.getText().toString());
                if (num < val) {


                    Toast.makeText(getApplicationContext(),R.string.grate, Toast.LENGTH_SHORT).show();

                    if (val - num < 5)
                        Toast.makeText(getApplicationContext(), R.string.close, Toast.LENGTH_SHORT).show();


                } else {
                    Toast.makeText(getApplicationContext(), R.string.small, Toast.LENGTH_SHORT).show();


                    if (num - val < 5)

                    Toast.makeText(getApplicationContext(),R.string.close, Toast.LENGTH_SHORT).show();

                }


            }
        });
    }
}
