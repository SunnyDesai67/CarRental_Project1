package src.com.carproject;

/*
*
* CREATED SWITCH CASE FOR CHOOSE CAR DETAILS YOU WANT TO SEE
*
* */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ModelDetailsOption implements CarModelDetails {

    File file = new File("/Users/sunny/IdeaProjects/SunnyTemplate/CarRental/src/com/TextFIle/FeedbackForm.txt");

    public void Accord() {
        System.out.println("Here your Accord 001 details");
    }

    public void Civic() {
        System.out.println("Here your Civic 227 details");
    }

    public void Pilot() {
        System.out.println("Here your Pilot 008 details");
    }

    public ModelDetailsOption()  {

        int options;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Please Choice your RIDE " );
        System.out.println("------------------------");
        System.out.println("1. Accord ");
        System.out.println("2. Civic ");
        System.out.println("3. Pilot ");
        System.out.println("4. Give us Feedback");
        System.out.println("5. Exit");
        System.out.println("------------------------");

        do {
            System.out.println("Please select 1 to 5 options");
            options = sc1.nextInt();

            switch (options) {
                case 1:
                    System.out.println("Accord Details: ");
                    Accord();
                    break;
                case 2:
                    System.out.println("Civi Details: ");
                    Civic();
                    break;
                case 3:
                    System.out.println("Pilot Detials: ");
                    Pilot();
                    break;
                case 4:
                    try{
                    System.out.println("Write your feedback here");
                    FeedbackBox FB = new FeedbackBox();
                    FB.FileWriter(file);}
                    catch (IOException e){
                        System.out.println("File not Found" + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("please choice your car first...!!!");
                    break;
            }
        }
        while (options != 5);
            System.out.println("Thank you");
    }
}
