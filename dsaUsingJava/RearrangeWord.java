package dsaUsingJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class RearrangeWord {


    public static String newWord(String s){
        ArrayList arrStr = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++){
            arrStr.add(s.charAt(i));
        }
        Collections.sort(arrStr);
        
        String newStr = "";
        for(int i = 0 ; i < arrStr.size() ; i++){
            newStr += arrStr.get(i);
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "The butterfly fluttered above the apple tree in the moonlight, casting a shadow on the grass below";
        System.out.println("The string is: " + str);
        String finalString = "";
        StringTokenizer sTokenizer = new StringTokenizer(str);
        while(sTokenizer.hasMoreTokens()){
            String word =  sTokenizer.nextToken();
            finalString += newWord(word.toLowerCase()) + " ";
        }
        System.out.println(finalString.toString());
    }
    
}
