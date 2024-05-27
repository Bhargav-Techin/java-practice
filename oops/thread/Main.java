package oops.thread;

import java.util.Scanner;

public class Main {

    public static boolean stop = false;

    public static void main(String[] args) {
        WriteOnFile newFile = new WriteOnFile("Thread is writting", "D:\\java practice\\oops\\thread\\File.txt");

        newFile.start();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Something:  ");
        String inText = sc.nextLine();
        newFile.writeInput(inText);
        Main.stop= true;
    }
    
    
}
