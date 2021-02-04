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

    private int number;
    private String customerSSN ;
    private String customerName;


    public CheckValidation(Scanner s)
    {
        String ss = s.toString();
        if (ss.isEmpty()){
            System.out.println("Field cannot be empty");
        }
        else {
            String correctMatch = "^[A-Za-z]$";
            // CHECK VALIDATION
            Pattern pattern = Pattern.compile(correctMatch);
            Matcher matchPattern = pattern.matcher(s.toString());

            matchPattern.find();
            System.out.println("Username is : " + ss);
            s.close();
        }
    }
    public CheckValidation(Scanner sc, int a){
        if (customerName.isEmpty()){
            System.out.println("Field cannot be empty");
        }
        else {
            // CHECK VALIDATION
            String s ="[0-9]";
            Pattern pattern = Pattern.compile(s);
            Matcher matchPattern = pattern.matcher(s.toString());

            if (matchPattern.find()) {
                System.out.println("Username is : " + s);
            }
            return;
    }
}}
