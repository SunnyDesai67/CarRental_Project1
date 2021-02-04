package src.com.carproject;

/*
*
* USE OF FILE FORMAT FOR FEEDBACK BOX
*
* */


import java.io.*;
import java.util.Scanner;

public class FeedbackBox {

    public static void main(String args[]) throws IOException{
        File file = new File("/Users/sunny/IdeaProjects/SunnyTemplate/CarRental/src/com/TextFIle/FeedbackForm.txt");

        FeedbackBox feedbackBox = new FeedbackBox();
        feedbackBox.FileWriter(file);

        feedbackBox.FileShow(file);
    }
    public void FileWriter(File file) throws IOException{

        Reader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String checkString = null;
        System.out.println("Write \"ok1\" to exit from file...");
        PrintWriter printWriter = new PrintWriter(file);
        while( (checkString = bufferedReader.readLine()) != null){
            printWriter.write(checkString, 0,checkString.length());
            if(checkString.trim().equalsIgnoreCase("ok1"))
            {
                System.out.println("Exiting...");
                System.exit(0);
            }
            printWriter.close();
        }
    }

       /* Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        System.out.println("Write \"ok\" to exit from file...");
        PrintWriter fileWriter = new PrintWriter(file);
        String line = null;
        while ( (line = scanner.nextLine()) != null){
         if(line.trim().equalsIgnoreCase("ok")){
             System.out.println("Exiting...");
             System.exit(0);
         }
        }
        fileWriter.print(line);
        scanner.close();
        fileWriter.close();
        }*/
        public void FileShow(File file) throws IOException{
            FileReader fileReader = new FileReader(file);
            Scanner scan = new Scanner(fileReader);
            System.out.println(scan);
        }
}