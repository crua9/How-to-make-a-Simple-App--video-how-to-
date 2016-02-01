package com.techreviewsandhelp.simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private School mSchool = new School();
        //Declare our View variables
    private TextView mNameTextView;
    private TextView mSchoolTextView;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign the Views from the layout file to the variables
        mNameTextView = (TextView) findViewById(R.id.myname);
        mSchoolTextView = (TextView)findViewById(R.id.school);
        mButton = (Button) findViewById(R.id.button);

        View.OnClickListener listener = new View.OnClickListener(){
            public void onClick(View v){
                String schools = mSchool.getSchool();

                String name = "I learned how to code for Android thanks to:";


                //set



                mSchoolTextView.setText(schools);
                mNameTextView.setText(name);
                mButton.setVisibility(View.INVISIBLE);
            }

        };
        mButton.setOnClickListener(listener);
    }
}
