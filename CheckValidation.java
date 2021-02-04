package src.com.carproject;
/*
*
* CHECK REGULAR EXPRESSION HERE
*
* */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CheckValidation {

    public void isValidName(String s) {

        if (s.isEmpty()){
            System.out.println("Field cannot be empty (2)");
            new CarDetails();
        }

        // CHECK VALIDATION
        String correctMatch = "^[A-Za-z]$";
        String matchWith = "Vasudev Desai";

        Pattern pattern = Pattern.compile(matchWith);
        Matcher matchPattern = pattern.matcher(s);
        if (matchPattern.find())
        {
            System.out.println("Valid");
            new CarDetails(1);
        }
        else {
            System.out.println("Re-enter valid Name:");
            new CarDetails();
        }
}

    public void isValidSSN(String s){
        if (s.isEmpty()){
            System.out.println("Field cannot be empty (3)");
            new CarDetails(1);
        }
        else {
            // CHECK VALIDATION FOR SOCIAL SECURITY NUMBER
            String s1 ="^(?!000|666|9\\d{2})\\d{3}"+"-(!00)\\d{2}-"+"(!0{4})\\d{4}$";
            String s2 = "111-22-3333";
            Pattern pattern = Pattern.compile(s2);
            Matcher matchPattern = pattern.matcher(s);

            if (matchPattern.find()) {
                System.out.println("Valid \n");
                ModelDetailsOption MDO = new ModelDetailsOption();
            }
            else{
                System.out.println("Re-enter valid Number");
                new CarDetails(1);
            }
        }
    }
}