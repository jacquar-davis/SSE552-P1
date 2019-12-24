
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Test
{

    //private static int numE;
    //private static Scanner sc = new Scanner(System.in);
    //static String res = "";
    private static double rates[] = {.901957, //USD - EUR
                              109.336, //USD - JPY
                              1.10870, //EUR - USD
                              121.208, //EUR - JPY
                              .00914614, //JPY - USD
                              .00825030 //JPY - EUR
                             };

    public static void main(String[] args) 
    {
        String sel = "w";

        Scanner inp = new Scanner(System.in);
        while(!(sel.toLowerCase().equals("q")))
        {
            menu();
            sel =  inp.nextLine();
            sel = sel.trim().toLowerCase();

            switch(sel)
            {
                case "d":
                    convertAmt(0);
                    break;

                case "g":
                    convertAmt(1);
                    break; 
                    
                case "v":
                    convertAmt(2);
                    break;

                case "b":
                    convertAmt(3);
                    break;

                case "y":
                    convertAmt(4);
                    break;

                case "i":
                    convertAmt(5);
                    break;
                
                case "q":
                    break;

                default:
                    System.out.println("\nCommand was not recognized; Please try again.\n");
            }
        }
        
    }

    public static void menu()
    {
        //clear();

        System.out.println("--------------------------------");
        System.out.println("|    Action: d - USD to EUR    |");
        System.out.println("|          : g - USD to JPY    |");
        System.out.println("|          : v - EUR to USD    |");
        System.out.println("|          : b - EUR to JPY    |");
        System.out.println("|          : y - JPY to USD    |");
        System.out.println("|          : i - JPY to EUR    |");
        System.out.println("|          : q - Quit          |");
        System.out.println("--------------------------------");
        System.out.print("Enter Action: ");
    }

    public static void convertAmt(int rateSel)
    {
        Scanner inp2 = new Scanner(System.in);
        String firstSym,endSym, endWord;
        firstSym = endSym = endWord = "";

        if(rateSel == 0 || rateSel == 1)
        {firstSym = "$";}
        else if(rateSel == 2 || rateSel == 3)
        {firstSym = "€";}
        else if(rateSel == 4 || rateSel == 5)
        {firstSym = "¥";}
        
        if(rateSel == 2 || rateSel == 4)
        {endSym = "$"; endWord = "US Dollar(s)";}
        else if(rateSel == 0 || rateSel == 5)
        {endSym = "€"; endWord = "Euro(s)";}
        else if(rateSel == 1 || rateSel == 3)
        {endSym = "¥"; endWord = "Japanese Yen(s)";}

        System.out.print("Enter initial amount: " + firstSym);
        double amt =  inp2.nextDouble();



        //System.out.println("The converted amount (in " + endWord + ") is " + endSym + (amt*(rates[rateSel])));
        System.out.println("The converted amount (in " + endWord + ") is " + endSym + Utilities.toFormat(amt*(rates[rateSel])));
        //inp2.close();
    }
}