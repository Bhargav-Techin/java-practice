package oops.thread;

import java.io.File;

public class ReaderWriterProblem {
    public static void main(String args[]){
        File file = new File("D:/java practice/oops/thread/File.txt");
        Reader r = new Reader(file);
        Thread t1 = new Thread(r);
        t1.start();
        Writer w = new Writer(file);
        Thread t2 = new Thread(w);
        t2.start();
    }
}
