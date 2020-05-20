package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class VitalInfoLoginPractice
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner Scan=new Scanner(System.in);
        Password pass=new Password();
        VitalInfo caller=new VitalInfo();
        boolean exe=true;
        do
        {
            System.out.println("Do you have a password?");
            String Answer=Scan.next();
            if(Answer.equalsIgnoreCase("yes"))
            {
                System.out.println("Enter your index number: ");
                int index=Scan.nextInt();
                System.out.println("Enter your password");
                String password=Scan.next();
                boolean check=pass.checkPassword(index, password);
                if(check)
                {
                    System.out.println("Password ");
                    for(int i=0; i<password.length(); i++)
                    {
                        System.out.print("*");
                    }
                    System.out.print(" accepted.\n");
                    System.out.println("Welcome Number "+index+".\nWarning!!>> You will be accessing the Vital Information! Continue?");
                    String answer=Scan.next();
                    if(answer.equalsIgnoreCase("yes"))
                    {
                        System.out.println("Processing.");
                        for(int i=0; i<10; i++)
                        {
                            Thread.sleep(1000);
                            System.out.print(".");
                            if(i==9)
                            {
                                System.out.println("\nProcess Completed.");
                            }
                        }
                        System.out.println("Here is the Vital Information: "+caller.getVitalinfo());
                        System.out.println("Do you wish to change the vital info?");
                        String answer1=Scan.next();
                        if(answer1.equalsIgnoreCase("yes"))
                        {
                            System.out.println("What will be the new Information?");
                            String newinfo=Scan.nextLine();
                            Scan.nextLine();
                            System.out.println("Warning!>> This process will change the Vital Information! Continue?");
                            String answer2=Scan.next();
                            if(answer2.equalsIgnoreCase("yes"))
                            {
                                caller.setVitalinfo(newinfo);
                                System.out.println("Warning!>> This process will take 20 seconds!");
                                System.out.println("Processing...");
                                for(int i=0; i<20; i++)
                                {
                                    Thread.sleep(1000);
                                    if(i==0)
                                    {
                                        System.out.print("Clearing Database(New data)_");
                                    }
                                    System.out.print(".");
                                    if(i==5)
                                    {
                                        System.out.print("\nDatabase Cleared. Inserting new data(Process Z0-25, No warnings)_");
                                    }
                                    if(i==15)
                                    {
                                        System.out.print("\nNew data inserted. Optiming System for new data(Process X0-23, No Warnings)_");
                                    }
                                    if(i==19)
                                    {
                                        System.out.println("\nProcess Completed. New Data is"+newinfo+"Directing to login page...");
                                    }
                                }
                            }
                            else
                            {
                                System.out.println("Process Terminated. Returning to login page");
                            }
                        }
                        if(answer1.equalsIgnoreCase("no"))
                        {
                            System.out.println("Returning to login page.");
                        }
                    }
                    else
                    {
                        System.out.println("Terminating process... Goodbye Number "+index+". Returning to Login...");
                    }
                }
                else
                {
                    System.out.println("Incorrect login!");
                }
            }
            if(Answer.equalsIgnoreCase("no"))
            {
                System.out.println("Enter a new password\nNo space please");
                String newPassword=Scan.next();
                System.out.println("Password Created. Your index number is: "+pass.PasswordCreater(newPassword));
                System.out.println("Getting back to Login page...");
            }
        }
        while(exe);
    }
}

class Password
{
    ArrayList<String> PasswordList=new ArrayList<String>();
    int count=0;

    public int PasswordCreater(String Password)
    {
        PasswordList.add(count, Password);
        count++;
        return count-1;
    }

    public boolean checkPassword(int index, String password)
    {
        String temp=PasswordList.get(index);
        return temp.equals(password);
    }
}

class VitalInfo
{
    private String Vitalinfo="Java is Great!";

    public String getVitalinfo()
    {
        return Vitalinfo;
    }

    public void setVitalinfo(String vitalinfo)
    {
        this.Vitalinfo=vitalinfo;
    }
}