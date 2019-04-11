package Insulter;

import java.util.Scanner;

public class Menu
{

    public static void menu()
    {
        Filereader filereader = new Filereader();
        filereader.listSize();

        //Scanner til input
        Scanner input = new Scanner(System.in);
        int min = 1;

        //Sætter max antal ord til antallet af ord i listen.
        int max = filereader.listSize();


        //Start besked
        System.out.println("Enter amount of words you idiot");

        //Choice værdi der tager int input.
        int choice = input.nextInt();

        //Sød besked før du bliver svinet
        System.out.print("YOU FUCKING ");

        //Kalder random metoden med choice input.
        Randomizer.print(choice);


    }


}
