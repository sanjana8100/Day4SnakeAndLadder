package com.bridgelabz;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game.");
        int startPos = 0;
        int player=0;
        int endPos =100;
        System.out.println("Starting position is :- "+startPos);
        while(true) {
            System.out.println("Do you want to Roll a Dice: \n 1: YES \t 2: NO \t");
            Scanner sc = new Scanner(System.in);
            int WantToPlay = sc.nextInt();
            System.out.println("***********************************************");
            if (WantToPlay == 1) {
                int dice = (int) Math.floor(Math.random() * 10) % 7;
                System.out.println("The number after rolling the dice: " + dice);
                int check = (int) Math.floor(Math.random() * 10) % 3;
                if (check == 1) {
                    System.out.println("You got ladder! Moving ahead by "+dice+" positions.");
                    player += dice;
                } else if (check == 2) {
                    System.out.println("You got Snake! Moving behind by "+dice+" positions.");
                    player -= dice;
                } else {
                    System.out.println("You got NO-Play! Thus, staying in the same position.");
                }
                System.out.println("Current player position is "+player);
            }
            else if(WantToPlay==2) {
                break;
            }
        }
    }
}
