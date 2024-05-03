package dsaUsingJava;

import java.util.Scanner;

public class ShortName {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String name =  scn.nextLine();
        String shortname = "";
        shortname = name.substring(0,1)+ " ";
        int lastSpace = name.lastIndexOf(' ');
        for (int i = 0; i < lastSpace; i++) {
            char ch = name.charAt(i);
            if (ch == ' ') {
                shortname = shortname + name.charAt(i + 1) + " ";
            }
        }
        shortname = shortname + name.substring( lastSpace+1 , name.length());
        System.err.println(shortname);
    }
    
}
