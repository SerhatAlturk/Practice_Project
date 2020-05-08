package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //int a = 9999999999;
        System.out.println( (long)2.5 ); //2

        System.out.println("Enter a long number: ");

       long a = input.nextLong();

        System.out.println("You have entered: "+a);

        System.out.println("Enter a decimal: ");
       double b =  input.nextFloat();  // float can be assigned to double
        //long b = (long) input.nextFloat();  // float can be assigned to double

        System.out.println("You have entered: "+b);


        System.out.println("Enter a decimal number: ");
         double f =   input.nextDouble();

        System.out.println("You have entered: "+f);

        System.out.println("Enter true or false");
           boolean bool =   input.nextBoolean();

        System.out.println(bool);


        System.out.println("Enter your sentence: ");
        String str =  input.next();

        System.out.println("You have entered: "+str);



    }


}
