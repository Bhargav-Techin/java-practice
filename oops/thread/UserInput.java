package oops.thread;

import java.util.Scanner;

public class UserInput implements Runnable{
    String mssg;

    public void run (){

        takeInput();
       Main.writeOn(mssg + "\n");
       WriteOnFile.takenInput = true;
    }
    void takeInput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Something : ");
        mssg = sc.nextLine();

    }


}
