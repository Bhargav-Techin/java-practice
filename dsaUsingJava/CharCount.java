package dsaUsingJava;
import java.util.Scanner;

public class CharCount {

    static Scanner scn = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Enter a string");
        String str = scn.nextLine();
        System.out.println("Enter a character");
        char ch = scn.next().charAt(0);

        int count = 0 ;
        for (int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("No. of occurence of "+ ch +" is "  + count);
    }
    
}
