package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        else {
            int randomNum = (int) (Math.random() * (4 - 0 + 1)) + 0;
            String randomString = elf_names[randomNum];
            return randomString + " " + name;
        }
    }
    // public static void main(String[] args) {
    //     System.out.println(Day1.generateElfName("Joe"));
    // }
}