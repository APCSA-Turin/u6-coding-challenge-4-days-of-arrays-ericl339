
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method

        String[][] list = new String[names.length][names.length];
        for (int i = 0; i < names.length; i++) {
            int random = (int) (Math.random() * (2 - 1 + 1)) + 1;
            if (random == 1) {
                list[0][i] = names[i];
            }
            else {
                list[1][i] = names[i];
            }
        }

        return list; //you must return a two dimensional string array
    }

    public static void main(String[] args) {
        String[] names = {"John", "Matt", "Lucy", "Nina", "Roxy", "Andrew", "Henry", "Donnie", "Sasha", "Mohammad", "Elsa", "Ruby"};
        System.out.println(nameSort(names));
    }
}