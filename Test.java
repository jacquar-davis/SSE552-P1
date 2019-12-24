
import java.util;
import java.io.*;
import java.util.Scanner;

public class Test
{

    private static int numE;
    private static Scanner sc = new Scanner(System.in);
    static String res = "";
    public static void main(String[] args) {
        for (int w = 0; w < 5; w++)
        {
            String tester = sc.nextLine().toLowerCase().substring(0,1);
            res = res + (String)(tester);
            System.out.println(res);

        }
    }
}