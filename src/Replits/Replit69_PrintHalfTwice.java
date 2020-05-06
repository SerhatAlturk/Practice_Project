package Replits;

import java.util.Scanner;

public class Replit69_PrintHalfTwice
    {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        int a = word.length() / 2;
        System.out.println(word.substring(0, a) + "" + word.substring(0, a));

    }
    }
