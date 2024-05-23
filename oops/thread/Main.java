package oops.thread;

import java.util.Scanner;

public class Main {

    public static boolean stop = false;

    public static void main(String[] args) {
        WriteOnFile newFile = new WriteOnFile("writer is writting", "File.txt");

        newFile.start();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Something:  ");
        sc.nextLine();
        Main.stop= true;
        return;
    }
    
    
}
