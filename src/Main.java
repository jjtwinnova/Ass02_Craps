import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        //Declare Variables
        Scanner in = new Scanner(System.in);
        String playAgain = "y";
        Random rnd = new Random();

        //Begin game and play again
        while (playAgain.equalsIgnoreCase("y"))
        {
            // Declare die and more variables
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            int point = crapsRoll;
            String game = "continue";

            //Output of dice roll
            System.out.print("You rolled " + die1 + " + " + die2 + " = " + crapsRoll);
            System.out.println();

            //Outcome of game
                if(crapsRoll == 7 || crapsRoll == 11)
                {
                    System.out.print("You're a natural! You rolled a " + crapsRoll + ". You win!");
                }
                else if(crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
                {
                    System.out.print("Aw Crap! You rolled a " + crapsRoll + ". You lose!");
                }
                else
                {
                    System.out.print("Your point is: " + point);
                    System.out.println();
                    while(game.equals("continue"))
                    {
                        die1 = rnd.nextInt(6) + 1;
                        die2 = rnd.nextInt(6) + 1;
                        crapsRoll = die1 + die2;
                        System.out.print("You rolled " + die1 + " + " + die2 + " = " + crapsRoll);
                        System.out.println();
                            if(crapsRoll == point)
                            {
                                System.out.print("That's the point! You win!");
                                game = "stop";
                            }

                            else if(crapsRoll == 7)
                            {
                                System.out.print("Aw Crap! You rolled a " + crapsRoll + ". You lose!");
                                game = "stop";
                            }

                    }

                }
            //Determine if player wants to play again
            System.out.println();
            System.out.print("Would you like to play again? Please enter Y or N: ");

            playAgain = in.nextLine();

            //Check for correct input
            while(!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N"))
            {
                System.out.print("Error, please enter Y or N: ");
                playAgain = in.nextLine();
            }
        }

        System.out.println("Thanks for playing! If you or someone you know has a gambling problem, please call 1-800-589-9966.");

    }
}