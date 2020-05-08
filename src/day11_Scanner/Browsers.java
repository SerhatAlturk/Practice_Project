package day11_Scanner;
/*
 3. write a program that can display the selected browser

                1. declear a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, output should be: Invalid Browser Name


            Note: Do Not use scanner or if statement or ternary for this task
 */

public class Browsers {

    public static void main(String[] args) {

        String browserName = "chrome";  // Firefox, firefox

        switch (browserName){

            case "firefox":
            case "Firefox":
                System.out.println("Firefox is opening...");
                break;

            case "chrome":
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;

            case "safari":
            case "Safari":
                System.out.println("Safari is opening...");
                break;

            case "opera":
            case "Opera":
                System.out.println("Opera is opening...");
                break;

            default:  // otherwise
                System.out.println("Invalid Browser Name, Please give the right browser name");
                break;

        }




    }

}
