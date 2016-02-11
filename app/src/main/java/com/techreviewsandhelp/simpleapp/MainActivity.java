package com.techreviewsandhelp.simpleapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //Log
    public static final String TAG = MainActivity.class.getSimpleName();
    //Declare our View variables
    private School mSchool = new School();
    private TextView mNameTextView;
    private TextView mSchoolTextView;
    private Button mButton;
    private RelativeLayout mRelativeLayout;
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign the Views from the layout file to the variables
        mNameTextView = (TextView) findViewById(R.id.myname);
        mSchoolTextView = (TextView)findViewById(R.id.school);
        mButton = (Button) findViewById(R.id.button);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener(){
            public void onClick(View v){
                String schools = mSchool.getSchool();
                int color = mColorWheel.getColor();

                String name = "I learned how to code for Android thanks to:";


                //set



                mSchoolTextView.setText(schools);
                mNameTextView.setText(name);
                //mButton.setVisibility(View.INVISIBLE);
                mRelativeLayout.setBackgroundColor(color);


            }

        };
        mButton.setOnClickListener(listener);


        //Toast
        Toast.makeText(MainActivity.this, "Please feel free to copy me", Toast.LENGTH_SHORT).show();

        //Log Please feel free to copy
        Log.d(TAG,"This is our test log");
    }
}
