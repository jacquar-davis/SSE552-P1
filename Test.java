
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Test
{

    //private static int numE;
    //private static Scanner sc = new Scanner(System.in);
    //static String res = "";
    public static void main(String[] args) 
    {
        String sel = "y";

        Scanner inp = new Scanner(System.in);
        while(!(sel.toLowerCase().equals("q")))
        {
            menu();
            sel =  inp.nextLine();
            sel = sel.trim().toLowerCase();

            switch(sel)
            {
                case "u":
                    USD_EURO();
                    break;

                default:
                    System.out.println("\nCommand was not recognized; Please try again.\n");
            }
        }
        
    }

    public static void menu()
    {
        clear();

        //Creates a seperator 
        for (int y = 0; y < 40; y++)
        {
            System.out.print("-");
        }


    }
}