package Insulter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Filereader
{

        //Laver en arraylist af strings.
        ArrayList<String> insults = new ArrayList<>();



    public ArrayList<String> insults()
    {
        //Læser min txt fil med insults ved brug af Path.
        //Skal ændres til der hvor man har sin fil.
    Path path = Paths.get("C:\\Users\\joja\\Desktop\\Files","insults.txt");


    try
        {
                //Tilføjer ordene fra txt filen til min arraylist.
            insults = (ArrayList<String>) Files.readAllLines(path);

        }
    catch (IOException e)
        {
            System.out.println("IOEXCEPTION: " + e.toString());
        }

        return insults;

    }

        //Finder og returnerer længden af en arrayliste med ord.
    public int findListSize(ArrayList<String> x)
    {

        int length = x.size();

        return length;
    }

        //Bruger metoden ovenfor til at finde længden af min ordliste.
   public int listSize()
    {
        int size = findListSize(insults());
        return size;
    }

}
