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
    protected int carNumberPlate;
    private String customerName;
    private String customerSSN;

    //   boolean isValidName;
    //   boolean isValidSSN;

    public CarDetails() {

        System.out.println("Enter your Full Name: ");
        customerName = scan1.nextLine();

        if (customerName.isEmpty()) {
            System.out.println("Field cannot be empty: ");
            new CarDetails();
        }
        else{
            ModelDetailsOption MDO = new ModelDetailsOption();
        }
        scan1.close();

    }
}