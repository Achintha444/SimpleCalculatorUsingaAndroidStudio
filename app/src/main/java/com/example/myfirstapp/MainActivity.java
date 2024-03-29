package com.example.myfirstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String tag = "the_custom_message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private int[] onClick(View v){
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText)findViewById(R.id.num2);

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int[] temp = {number1,number2};
        return temp;
    }

    public void onClickAdd(View v){
        int[] temp = onClick(v);
        int ans = temp[0]+temp[1];
        TextView answer = (TextView)findViewById(R.id.answer);
        answer.setText(Integer.toString(ans));
    }

    public void onClickSub(View v){
        int[] temp = onClick(v);
        int ans = temp[0]-temp[1];
        TextView answer = (TextView)findViewById(R.id.answer);
        answer.setText(Integer.toString(ans));
    }

    public void onClickMul(View v){
        int[] temp = onClick(v);
        int ans = temp[0]*temp[1];
        TextView answer = (TextView)findViewById(R.id.answer);
        answer.setText(Integer.toString(ans));
    }

    public void onClickDiv(View v){
        int[] temp = onClick(v);
        int ans = temp[0]/temp[1];
        TextView answer = (TextView)findViewById(R.id.answer);
        answer.setText(Integer.toString(ans));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
