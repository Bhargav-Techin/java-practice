package dsaUsingJava;

import java.util.StringTokenizer;

public class DoubleCharFind {

    public static void main(String[] args) {
        String str = "The butterfly fluttered above the apple tree in the moonlight, casting a shadow on the grass below";
        System.out.println("The string is: " + str);
        System.out.println("The string with double characters is: ");
        StringTokenizer sTokenizer = new StringTokenizer(str);
        while (sTokenizer.hasMoreTokens()) {
            String word = sTokenizer.nextToken();
            int i = 0, j = 1;
            while (j < word.length()) {
                if (word.charAt(i) == word.charAt(j)) {
                    System.out.println(word);
                    break;
                }
                i++;
                j++;
            }
        }
    }
}
