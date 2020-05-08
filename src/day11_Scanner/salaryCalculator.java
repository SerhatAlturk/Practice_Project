package day11_Scanner;
/*
  2. write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax

                            MUST use Scanner
 */

//import PackageName.ClassName;

import java.util.Scanner;


public class salaryCalculator {

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);  // scanner object

        System.out.println("Enter your salary: ");
        int salary = input.nextInt();

        System.out.println("Enter the state tax rate: ");
        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax / 100.0 ;

        System.out.println("Enter the federal tax rate: ");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax / 100.0;  // 10/3.0 ==> 3.3333


        // totalTax = (federalTaxPercentage + stateTaxPercentage) * Salary
        double totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;

        // salaryAfterTax = salry - totalTax
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary after tax is: $"+salaryAfterTax);
        System.out.println("Total tax: $"+totalTax);



    }


}
