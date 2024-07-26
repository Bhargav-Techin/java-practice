package oops;

import java.io.*;
import java.util.StringTokenizer;

public class ReverseLastLine {

    static String readLastLine(File file){

        String lastLine = " " , line;

        try {

            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null){
                lastLine = line;
            }


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        return lastLine ;
    }

    static String reverseContent(String str){

        StringTokenizer stnzr = new StringTokenizer(str);
        String revstr = " " ;

        while (stnzr.hasMoreTokens()){
            revstr = stnzr.nextToken().toString() + " " + revstr;
        }

        return revstr;
    }

    static void writeOnFile(String s){
        try {
            FileWriter writer = new FileWriter("D:/java practice/oops/thread/File.txt", true);
            writer.append("\n" + s);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String orgline = readLastLine(new File("D:/java practice/oops/thread/File.txt"));
        String revline = reverseContent(orgline);
        writeOnFile(revline);

    }
}
