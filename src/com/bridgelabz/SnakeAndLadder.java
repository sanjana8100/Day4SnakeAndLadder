package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game.");
        int startPos = 0;
        int dice = (int) Math.floor(Math.random()*10)%7;
        System.out.println("Starting position is :- "+startPos);
        System.out.println("Dice roll number :- "+dice);
    }
}
