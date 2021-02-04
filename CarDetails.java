package src.com.carproject;

/*
* CREATE A USER LOGIN PAGE.
* AIM: CREATE DATA STRUCTURE AND ADD LOGIN DETAILS TO SQL DATA
*
* */

import src.com.carproject.ModelDetailsOption;
import src.com.carproject.CheckValidation;

import java.io.IOException;
import java.util.Scanner;

public class CarDetails {

    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    protected int carNumberPlate;
    private String customerName;
    private String customerSSN;

    CheckValidation checkValidation = new CheckValidation();
    //   boolean isValidName;
    //   boolean isValidSSN;

    public CarDetails() {

        System.out.println("Enter your Full Name: ");
        customerName = scan1.nextLine();
        checkValidation.isValidName(customerName);
    }


    public CarDetails(int i){

        System.out.println("Enter Social Security Number: ");
        customerSSN = scan2.nextLine();
        checkValidation.isValidSSN(customerSSN);
    }
}