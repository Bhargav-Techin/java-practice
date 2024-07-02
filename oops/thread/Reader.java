package oops.thread;

import java.io.File;
import java.util.Scanner;

public class Reader implements  Runnable {

    static int reader = 0;
    static File file;
    static Object fileLock = new Object();

    Reader(File file ){
        this.file = file;
    }

    static void readerIn(){
        reader++;
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                reader.useDelimiter("\n");
                reader.nextLine();
                System.out.println("reading " + reader);
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    static void readerOut(){
        reader--;
    }

    @Override
    public void run() {
       try {

           synchronized (fileLock) {
               for (int i = 0 ; i <= 3; i++) {
                   Thread.sleep(1000);
                   readerIn();
                   Thread.sleep(2000);
                   readerOut();
               }
           }
       } catch (InterruptedException e){
           e.printStackTrace();
       }
    }
}
