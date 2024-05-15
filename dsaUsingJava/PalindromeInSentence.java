package dsaUsingJava;

import java.util.*;

public class PalindromeInSentence {

    static void myFun() {
        String str = "Anna, did Bob refer to the civic duty to kayak in the noon?";
        String regex = "[!@?%$#&*_-]+";
        String[] words = str.split(regex);
        System.out.println(Arrays.toString(words));

        // for (String word : words) {
        // System.out.println(word);
        // StringBuffer buffer = new StringBuffer(word);
        // String reverseWord = buffer.reverse().toString();
        // if (word.toLowerCase().compareTo(reverseWord.toLowerCase()) == 0) {
        // System.out.println(word + " palindrome");
        // }
        // }

    }

    static void myfun2() {
        String str = "Anna, did Bob refer to the civic duty to kayak in the noon?";
        int l = str.length();
        str = str.toLowerCase();
        String s = "";
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            int asc = (int) ch;
            if ((asc >= 65 && asc <= 90) || (asc >= 97 && asc <= 122) || asc == 32) {
                s = s + ch;
            }
        }
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            StringBuffer buffer = new StringBuffer(word);
            String reverseWord = buffer.reverse().toString();
            if (word.compareTo(reverseWord) == 0) {
                System.out.println(word + " is a palindrome");
            }
        }
    }

    public static void main(String[] args) {
        myFun();
        // myfun2();
    }
}
