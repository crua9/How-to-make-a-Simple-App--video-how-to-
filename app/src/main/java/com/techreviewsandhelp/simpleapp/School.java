package com.techreviewsandhelp.simpleapp;

import java.util.Random;

/**
 * Created by crua9 on 2/1/2016.
 */
public class School {
    public String getSchool(){

        String[] school ={
                "Tech Reviews and Help",
                "TRH",
                "Me"
        };

        String schools = "";
        //Random
        Random randomGenerator= new Random();
        int randomNumber = randomGenerator.nextInt(school.length);
        schools = school[randomNumber];

        return schools;
    }
}
