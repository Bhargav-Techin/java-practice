package oops.thread;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteOnFile extends Thread{

    private String  mssg , fileName ;

//    private String readFile(){
//        String currText = "";
//        try {
//            File myFile = new File(this.fileName);
//            Scanner myReader = new Scanner(myFile);
//            while (myReader.hasNextLine()){
//                currText = myReader.nextLine();
//                currText += "\n";
//            }
//        } catch (Exception e) {
//            // TODO: handle exception
//        }
//        return currText;
//    }

    private void write(){
        while (Main.stop == false) {
            try {
//                String currText = readFile();
                FileWriter myWriter = new FileWriter(fileName, true);
//                myWriter.write(currText + this.mssg);
                myWriter.write(this.mssg + "\n");
                myWriter.close();

                Thread.sleep(2500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public void writeInput(String text) {
            try {
//                String currText = readFile();
                FileWriter myWriter = new FileWriter(fileName, true);
//                myWriter.write(currText + text + "\n");
                myWriter.write(text + "\n");
                myWriter.close();
            } catch (Exception e) {
            }
    }

    public WriteOnFile(String mssg, String fileName){
        this.mssg = mssg;
        this.fileName = fileName;
    }

    public void run(){
        this.write();
    }
    
}
