package com.pluralsight;

public class Dice {

    public int roll() {
        //class with method 'roll'
        //generate random # with algorithm
        //int randomNumber = (int)(Math.random() * (maxValue - minValue + 1)) + minValue
        //need inputs for algo

        //inputs
        int minValue = 1;
        int maxValue = 6;

        int randomNumber = (int)(Math.random() * (maxValue - minValue + 1)) + minValue;

        return randomNumber;

    }
}
