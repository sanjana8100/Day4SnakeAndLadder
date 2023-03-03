package com.bridgelabz;

import java.util.Scanner;

public class SnakeAndLadder {
    public int DiceRoll(char PlayerName){
        int dice=0,check=1;
        int player=0;
        int endPos =100;
        int DiceRollCount=0;
        int winner=0;
        int needToWin = endPos-player;
        while(player<=endPos && check == 1) {
            System.out.println("__________________________________________________________________________________________________");
            System.out.println("PLAYER " +PlayerName+ ": \nDo you want to Roll a Dice: \n 1: YES \t 2: NO \t");
            Scanner sc = new Scanner(System.in);
            int WantToPlay = sc.nextInt();
            System.out.println("***********************************************");
            if (WantToPlay == 1) {
                dice = (int) Math.floor(Math.random() * 10) % 7;
                System.out.println("Current Player "+PlayerName+" Position is: "+player);
                System.out.println("The number after rolling the dice: " + dice);
                DiceRollCount++;
                check = (int) Math.floor(Math.random() * 10) % 3;
                if (check == 1) {
                    System.out.println("You got ladder! Moving ahead by " + dice + " positions.");
                    player += dice;
                } else if (check == 2) {
                    System.out.println("You got Snake! Moving behind by " + dice + " positions.");
                    player -= dice;
                    if(player<0){
                        System.out.println("The Position will be less than 0. So Starting Again!!!");
                        player=0;
                    }
                } else {
                    System.out.println("You got NO-Play! Thus, staying in the same position.");
                }
                System.out.println("Current New Player "+PlayerName+" Position is " + player);
                System.out.println("Number of position needed to win: "+needToWin);
            } else if (WantToPlay == 2) {
                break;
            }
        }
        if(player==endPos){
            winner=1;
            System.out.println("***********************************************************************************");
            System.out.println("Number of times the dice was rolled to WIN the game: "+DiceRollCount);
        }
        else if(player>endPos){
            player-=dice;
            System.out.println("Reached position greater than 100. Thus, Current New Player Position is "+player);
        }
        return winner;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game.");
        int WinA=0,WinB=0;
        SnakeAndLadder playerA= new SnakeAndLadder();
        SnakeAndLadder playerB= new SnakeAndLadder();
        while(WinA==0 && WinB==0){
            WinA=playerA.DiceRoll('A');
            WinB=playerB.DiceRoll('B');
        }
        if(WinA==1)
            System.out.println("\nPlayer A is the WINNER!!!\n");
        else
            System.out.println("\nPlayer B is the WINNER!!!\n");
    }

}
