/*
    MATTHEW CULIN
    0597375
    COIS 2240
    ASSIGNMENT 2

    THE PURPOSE OF THIS PROGRAM IS TO ALLOW A USER TO REGISTER TO VOTE AND SUBMIT A BALLOT
 */

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class VotePersonalIdentification
{

    ////////////////////////////////////////////////////////////
    public static void main(String[] args)
    {
        //////////////////////////////
        // Scanner and variables
        Scanner scan = new Scanner(System.in);
	    String voterLastName;
	    String voterFirstName;
	    Integer voterSIN;
	    String voterAddress;
	    String voterProvince;
	    String voterCity;
	    String voterPostalCode;

        //////////////////////////////
	    // Last Name
	    System.out.print("Last Name: ");
        voterLastName = scan.next().toUpperCase();
        scan = new Scanner(System.in);

        //////////////////////////////
        // First Name
        System.out.print("First Name: ");
        voterFirstName = scan.next().toUpperCase();
        scan = new Scanner(System.in);

        //////////////////////////////
        // SIN Number
        System.out.print("SIN Number: ");
        voterSIN = scan.nextInt();
        scan = new Scanner(System.in);

        //////////////////////////////
        // Address
        System.out.print("Address: ");
        voterAddress = scan.next();
        scan = new Scanner(System.in);

        //////////////////////////////
        // City
        System.out.print("City: ");
        voterCity = scan.next();
        scan = new Scanner(System.in);

        //////////////////////////////
        // Province
        System.out.print("Province: ");
        voterProvince = scan.next();
        scan = new Scanner(System.in);

        //////////////////////////////
        // Postal Code
        System.out.print("Postal Code: ");
        voterPostalCode = scan.next();

        //////////////////////////////
        // Validates user input
        validateLastName(voterLastName);
        validateFirstName(voterFirstName);
        validateSIN(voterSIN);
        validatePostalCode(voterPostalCode);

        //////////////////////////////
        // Registers voter
        successfullyRegistered();
        BallotCreation voterBallot = new BallotCreation(voterID(voterFirstName, voterLastName));

        //////////////////////////////
        // Generates a ballot and allows a vote
        voterBallot.submitBallot();

        System.out.println("Thank you for voting!");

    }// END OF MAIN


    ////////////////////////////////////////////////////////////
    // Validates the voterLastName
    public static boolean validateLastName(String lastName)
    {
        String check = "^[a-zA-Z]+$";
        if(lastName.matches(check))
            return true;

        return false;
    }// VALIDATE LAST NAME


    ////////////////////////////////////////////////////////////
    // Validates the voterFirstName
    public static boolean validateFirstName(String firstName)
    {
        String check = "^[a-zA-Z]+$";
        if(firstName.matches(check))
            return true;

        return false;
    }// VALIDATE FIRST NAME


    ////////////////////////////////////////////////////////////
    // Validates the voterSIN
    public static boolean validateSIN(Integer sinNumber)
    {
        if(sinNumber == (int) sinNumber)
        {
            // Checks if the sinNumber is of length 9 (#########)
            int length = String.valueOf(sinNumber).length();

            if (length == 9)
                return true;

            else
                return false;
        }

        return false;
    }// END OF VALIDATE SIN


    ////////////////////////////////////////////////////////////
    // Validates the voterPostalCode
    public static boolean validatePostalCode(String postalCode)
    {
        // Checks each character in the postal code to determine if it is a valid character
        if(postalCode.length() == 6)
        {
            char a = postalCode.charAt(0);
            char b = postalCode.charAt(1);
            char c = postalCode.charAt(2);
            char d = postalCode.charAt(3);
            char e = postalCode.charAt(4);
            char f = postalCode.charAt(5);

            if(! Character.isLetter(a))
                return false;
            else if(! Character.isDigit(b))
                return false;
            else if(! Character.isLetter(c))
                return false;
            else if(! Character.isDigit(d))
                return false;
            else if(! Character.isLetter(e))
                return false;
            else if(! Character.isDigit(f))
                return false;
            else
                return true;
        }

        return false;
    }// END OF VALIDATE POSTAL CODE


    ////////////////////////////////////////////////////////////
    // Returns that the voter is successfully registered
    public static String successfullyRegistered()
    {
        System.out.println("\nSuccessfully registered. Generating voter ID...");

        return "";
    }// END OF SUCCESSFULLY REGISTERED


    ////////////////////////////////////////////////////////////
    // Creates a voterID for the registered voter
    public static String voterID(String firstName, String lastName)
    {
        String voterID;
        int randomNum;

        randomNum = ThreadLocalRandom.current().nextInt(1, 9999);
        voterID = firstName + lastName + String.valueOf(randomNum);

        System.out.println("Voter ID is " + voterID);

        return voterID;
    }// END OF VOTER ID

}// END OF VOTE PERSONAL IDENTIFICATION CLASS
