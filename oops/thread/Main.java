package oops.thread;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static synchronized void writeOn(String mssg) {
        try {
            FileWriter writer = new FileWriter("D:/java practice/oops/thread/File.txt", true);
            writer.append(mssg);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        WriteOnFile writeOnFile = new WriteOnFile();
        Thread t1 = new Thread(writeOnFile);
        t1.start();
        UserInput userInput = new UserInput();
        Thread t2 = new Thread(userInput);
        t2.start();
    }
}
