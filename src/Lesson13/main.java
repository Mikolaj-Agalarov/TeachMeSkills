package Lesson12;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {

        CustomArrayList newList = new CustomArrayList<>();

        newList.addToTheEnd(1);
        newList.addToTheEnd("good");
        newList.addToTheEnd(1.1);

        System.out.println(newList.toString());

        newList.addWithIndex(400, "ajshdfui");




        System.out.println(newList.toString());

        newList.removeWithIndex(0);

        System.out.println(newList.toString());














//        Scanner scannerPath = new Scanner(System.in);
//        System.out.println("Provide full path to file: ");
//        String path = scannerPath.nextLine();


//       String goodPath = "D:\\TMS\\untitled\\src\\Lesson12\\ID.txt";
//       FileReader file = new FileReader(goodPath);
//       file.checkFile();



//        try
//        {
//            Scanner sc=new Scanner(System.in);         //object of Scanner class
//            System.out.print("Enter the file name: ");
//            String name=sc.nextLine();              //variable name to store the file name
//            FileOutputStream fos=new FileOutputStream(name, true);  // true for append mode
//            System.out.print("Enter file content: ");
//            String str=sc.nextLine()+"\n";      //str stores the string which we have entered
//            byte[] b= str.getBytes();       //converts string into bytes
//            fos.write(b);           //writes bytes into file
//            fos.close();            //close the file
//            System.out.println("file saved.");
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
    }
}


