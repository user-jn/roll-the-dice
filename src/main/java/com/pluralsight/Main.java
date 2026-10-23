package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //problem
        //roll two dice 100 times
        //display value of the two dice each time they are rolled
        //count how many times the sum of the dice is 2, 4, 6, or 7 are rolled and display result
        //made a Dice class + with method roll() that generates a random number between 1-6

        //Dice object
        Dice dice = new Dice();

        //variables for roll1 & roll2
        int roll1 = 0;
        int roll2 = 0;

        int sumRolls = 0;

        // counters for numbers 2,4,6,7
        int counterTwo = 0;
        int counterFour = 0;
        int counterSix = 0;
        int counterSeven = 0;

        System.out.println("*** Roll the Dice! ***");

        //roll 2 dice 100 times
        for (int i = 1; i <= 101; i++) {
            roll1 = dice.roll();    //calling roll() method in for loop
            roll2 = dice.roll();
            sumRolls = roll1 + roll2;

            System.out.printf("Roll %d: %d - %d | Sum: %d\n", i, roll1, roll2, sumRolls);

            if (sumRolls == 2) {
                counterTwo += 1;
            } else if (sumRolls == 4) {
                counterFour += 1;
            } else if (sumRolls == 6) {
                counterSix += 1;
            } else if (sumRolls == 7) {
                counterSeven += 1;
            }

        }

    }

}
