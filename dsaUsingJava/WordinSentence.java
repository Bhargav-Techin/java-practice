package dsaUsingJava;

import java.util.Scanner;

public class WordinSentence {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        String sen = scn.nextLine();
        int len = sen.length();
        System.out.println("len: " + len);
        int count = 0;

        for(int i = 0; i < len; i++) {
            char ch = sen.charAt(i);
            if(ch == ' ') {
                count++;
            }
        }
        System.out.println("No. of Word: " + (count+1));
    }
    
}
