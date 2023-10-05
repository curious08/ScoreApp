package com.sumesh.scoreapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = findViewById(R.id.btn_plus);
        Button minus = findViewById(R.id.btn_minus);
        TextView result = findViewById(R.id.result_tv);

        //third edit
        //to check for savedInstanceState value
        if(savedInstanceState!=null && savedInstanceState.containsKey("KEY")){
            count =savedInstanceState.getInt("KEY");
            result.setText(String.valueOf(count));
        }

        //first edit

        // todo 1: recognize or listen to button clicks
        // todo 2: Based on the button, update the value of textview

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //when the btn_plus cliked we will come here
                count++;
                result.setText(String.valueOf(count));


            }
        });


        // we can reduce the line of code by using java lambdas

        minus.setOnClickListener(view -> {
            //when btn_minus clicked we will come here
            count--;
            result.setText(String.valueOf(count));
        });
    }

    //second edit
    //whatever value you want to store you can store with outState Bundle object
    //Bundle is a class that offer a data structure to store values along with keys
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("KEY",count);
    }
}
/**
 * when you create one empty activity project you should have one xml file and one java file for each activity
 * .xml file will have design
 * .java file displays the .xml file to the user and also provides logical support to design
 *
 */