package com.techreviewsandhelp.simpleapp;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by crua9 on 2/1/2016.
 */
public class ColorWheel {
    private String[] mColor ={
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
    };
public int getColor(){
    String color;
    //Random
    Random randomGenerator= new Random();
    int randomNumber = randomGenerator.nextInt(mColor.length);
    color = mColor[randomNumber];
    int colorAsInt = Color.parseColor(color);
    return colorAsInt;
}}
