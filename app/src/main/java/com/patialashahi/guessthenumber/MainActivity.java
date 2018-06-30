package com.patialashahi.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int number;
    int count=0;
    public void makeToast(String string){
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
    public void guess(View view) {


        EditText editText2 = (EditText) findViewById(R.id.editText2);
        int a = Integer.parseInt(editText2.getText().toString());

            if (a > number) {
                Toast.makeText(MainActivity.this, "Lower!", Toast.LENGTH_SHORT).show();
                count++;
            }
            if (a < number) {
                Toast.makeText(MainActivity.this, "Higher!", Toast.LENGTH_SHORT).show();
                count++;

            } if(a == number) {
                Toast.makeText(MainActivity.this, "You got this! in " + count + " attempts" + " Try Again", Toast.LENGTH_SHORT).show();
            Random rand = new Random();
            number =(rand.nextInt(100) + 1);
            count =0;

            }
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
         number =(rand.nextInt(100) + 1);

    }
}
