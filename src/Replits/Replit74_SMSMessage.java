package Replits;

import java.util.Scanner;

public class Replit74_SMSMessage
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        sender = message.substring(message.indexOf("<") + 1, message.indexOf(">"));
        phoneNumber = message.substring(message.indexOf("[") + 1, message.indexOf("]"));
        messageBody = message.substring(message.indexOf("{") + 1, message.indexOf("}"));

        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);

			/*
			Instructions from your teacher:
			We have a message variable already declared and assigned value in this format

			Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

			Variables are already declared:

			sender, phoneNumber, messageBody
			- by using String methods:
			retrieve related information from SMSmessage string and assign to those 3 variables.
			-print each variable in separate line

			Sender: Mike Smith
			Phone Number: 202-123-3456
			Message body: I love programing and problem solving
			 */
    }
}
