package Games;

import java.util.Random;
import java.util.Scanner;

public class RollTo20 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("...................... Welcome  ........................  ");
//hello
        /*
The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.

    Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board. Here’s the code to do this ((import is java.util.Random):

    After each roll, tell the user which game space they are on and how many more spaces they have to go to win.

    Repeat this 4 additional times, for 5 rolls in total.

    However, if the user gets to 20 before 5 rolls, end the game - they’ve won.

    If they are greater than or less than 20 spaces exactly, they lose.

    Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.

 */
        //Known properties
        int board = 20;
        int turns = 5;
        int space = 0;
        Random random = new Random();
        System.out.println("The objective of this game is to travel the entire game \n board of 20 spaces within 5 " +
                "die " +
                "rolls.\n");

        for (int i = 0; i < turns; ) {
            System.out.println("press R to roll dice and X to end game");
            String choice = scanner.nextLine().toUpperCase();
            //user rolls dice
            if (choice.equals("R")) {
                //random number from 1 to 6
                int die = random.nextInt(6) + 1;
                space = die + space;
                //success when user equals 20 in exactly 5 trys
                if (space == board && i == turns - 1) {

                    System.out.println("Roll #" + i + " : " + " You've rolled a " + die + " you got a perfect " + space +
                            " Congratulations YOU " +
                            "WON!!!");
                    break;
                }
                //
                else if (space < board && i < turns - 1) {
                    ++i;
                    System.out.println("Roll #" + i + " : " + " You've rolled a " + die + " You are now on space " + space +
                            " and have " + (board - space) + " more to go.\n");
                } else if (space < board && i == turns - 1) {
                    ++i;
                    System.out.println("Roll #" + i + " : " + " You've rolled a " + die + " You are on space " + space +
                            " You have used up all ur " + "turns " + "YOU LOSE!!!");
                    break;
                } else if (space > board) {
                    System.out.println("Roll #" + i + " : " + " You've rolled a " + die + " You exceeded the " +
                            "maximum spaces by " + (space - board) + " YOU LOSE!!!\n");
                    break;
                } else {
                    System.out.println("YOU LOSE!!!");
                    break;
                }
            } else if (choice.equals("X")) {
                break;
            } else {
                System.out.println("Invalid input please enter R to roll dice of X to exit");
            }
        }

    }
}


