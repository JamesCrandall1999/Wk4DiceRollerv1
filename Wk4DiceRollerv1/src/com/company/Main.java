package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int j = 0;
        while(j == 0){
            Scanner input = new Scanner(System.in);
            System.out.println("Using dice notation(XdY), what to roll?");
            String roll = input.nextLine();
            String[] arrOfRoll = roll.split("d", -1);
            int total = 0;
            int check = 0;
            check = roll.indexOf("d");


            if (check != -1) {
                int numSides = Integer.parseInt(arrOfRoll[1]);
                int[] dice = new int[Integer.parseInt(arrOfRoll[0])];
                for (int i = 0; i < Integer.parseInt(arrOfRoll[0]); i++) {
                    Random rand = new Random();
                    dice[i] = rand.nextInt(numSides) + 1;
                }
                String msg = "";

                for (int die : dice) {
                    msg += "You rolled a " + die + " on a " + numSides + " sided die\n";
                    total += die;

                }
                System.out.println(msg);
                System.out.println("Your total is " + total);
            } else {
                System.out.println("Invalid, use dice notation (XdY) for rolling.");
                check = 0;
            }

        }

        // using split() for 2d8 or others
        // using while loop until no more rolling
    }
}
