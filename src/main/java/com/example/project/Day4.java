package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int distanceTraveled;
        private int speed;
        private int runDuration;
        private int restDuration;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            distanceTraveled = 0;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            if (runDuration > 0) {
                runDuration --;
                distanceTraveled += speed;
            }
            else {
                restDuration --;
            }
        }

        public String getName() {
            return name;
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        int maxDistance = 0;
        String maxName = null;

        for (int i = 0; i < reindeers.length; i ++) {
            for (int j = 0; j < time; j ++) {
                reindeers[i].simulateSecond();
            }
            if (reindeers[i].getDistanceTraveled() > maxDistance) {
                maxDistance = reindeers[i].getDistanceTraveled();
                maxName = reindeers[i].getName();
            }
        }
        return maxName;
    }

    
    public static void main(String[] args) { // for testing purposed
        Day4.Reindeer[] reindeers = {
            new Day4.Reindeer("Dasher", 100, 5, 2),
            new Day4.Reindeer("Dancer", 120, 4, 3),
            new Day4.Reindeer("Prancer", 70, 6, 1)
        };
        String winner = Day4.simulateRace(100, reindeers);
        System.out.println(winner);
    }
}