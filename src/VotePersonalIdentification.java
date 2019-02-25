import java.util.Scanner;

public class VotePersonalIdentification
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

	    String voterLastName;
	    String voterFirstName;
	    Integer voterSIN;
	    String voterAddress;
	    String voterProvince;
	    String voterCity;
	    String voterPostalCode;

	    // Last Name
	    System.out.println("Last Name: ");
        voterLastName = scan.next().toUpperCase();
        scan = new Scanner(System.in);

        // First Name
        System.out.println("First Name: ");
        voterFirstName = scan.next().toUpperCase();
        scan = new Scanner(System.in);

        // SIN Number
        System.out.println("SIN Number: ");
        voterSIN = scan.nextInt();
        scan = new Scanner(System.in);

        // Address
        System.out.println("Address: ");
        voterAddress = scan.next();
        scan = new Scanner(System.in);

        // Province
        System.out.println("Province: ");
        voterProvince = scan.next();
        scan = new Scanner(System.in);

        // City
        System.out.println("City: ");
        voterCity = scan.next();
        scan = new Scanner(System.in);

        // Postal Code
        System.out.println("Postal Code: ");
        voterPostalCode = scan.next();

        /////////////////////////////////////////
        //
        // validateLastName(voterLastName);
        // validateFirstName(voterFirstName);
        // validateSIN(voterSIN);
        // validatePostalCode(voterPostalCode);
        //
        /////////////////////////////////////////

    }// END OF MAIN

    // Validates the voterLastName
    public Boolean validateLastName(String lastName)
    {
        String check = "^[a-zA-Z]+$";
        if(lastName.matches(check))
            return true;

        return false;
    }// VALIDATE LAST NAME

    // Validates the voterFirstName
    public Boolean validateFirstName(String firstName)
    {
        String check = "^[a-zA-Z]+$";
        if(firstName.matches(check))
            return true;

        return false;
    }// VALIDATE FIRST NAME

    // Validates the voterSIN
    public Boolean validateSIN(Integer sinNumber)
    {
        if(sinNumber == (int) sinNumber)
        {
            // Checks if the sinNumber is of length 11 (###_###_###)
            int length = String.valueOf(sinNumber).length();
            if (length == 11)
                return true;

            return false;
        }

        return false;
    }// END OF VALIDATE SIN

    // Validates the voterPostalCode
    public Boolean validatePostalCode(String postalCode)
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

}// END OF VOTE PERSONAL IDENTIFICATION
