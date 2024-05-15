package dsaUsingJava;
import java.util.*;

public class MyStringTokenizer {

    public static void main(String[] args) {
        String str = "Hello, I am a String, My word length is 9.";
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken(","));
        }
        StringTokenizer st1 = new StringTokenizer(str);
        int wordLength = st1.countTokens();
        System.out.println(wordLength);
        while(st1.hasMoreElements()){
            System.out.println(st1.nextToken());
        }
    }
    
}
