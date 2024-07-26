package oops.thread;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer implements Runnable{

    static boolean writer = false;
    static File file;
    static Object fileLock = new Object();

    Writer(File file ){
        this.file = file;
    }

    static void writerIn(){
        writer = true;
        try {
            FileWriter writting = new FileWriter( file , true);
            writting.write("writting \n");
            writting.write("writting 1A \n");
            writting.close();
            System.out.println("done writting");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    static void writerOut(){
        writer = false;
    }

    @Override
    public void run() {
        try{
            synchronized (fileLock) {
                for (int i = 0 ; i <= 5 ; i++) {
                    Thread.sleep(2000);
                    writerIn();
                    Thread.sleep(500);
                    writerOut();
                }

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
