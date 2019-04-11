package Insulter;

import java.util.Random;

public class Randomizer
{
    public static void print(int n) {
        Random rand = new Random();
        Filereader filereader = new Filereader();
        int max = filereader.listSize();
        int randomNumber = rand.nextInt(max);

        if (n > max)
        {
            System.out.println("CHOSE TOO MANY WORDS SHITFACE");
        }

        else if (n > 0) {
            System.out.print(filereader.insults().get(randomNumber) + " ");
            print(n - 1);
        }


    }

}