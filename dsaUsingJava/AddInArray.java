/*
**Question:**

You are given an array of integers, where each element is a digit from **1 to 9** (inclusive). Additionally, you'll take a **single-digit number** as input from the user (also in the range of 1 to 9). Let's call this user-input number `N`.

Starting from the **last index** of the array, perform the following steps:

1. **Add `N` to the last element** of the array.
2. If the result of the addition is **10 or greater**, set the last element to the **rightmost digit** of the sum (i.e., the remainder after dividing by 10).
3. **Carry over** the remaining part of the sum (i.e., the value obtained by dividing the sum by 10) to the **second-to-last element**.
4. Repeat steps 1-3 for the second-to-last element, and continue this process towards the beginning of the array.

The modified array will have the updated values after considering the carry-over. Return this modified array.

For example, given the input array `[9, 9, 9]` and `N = 3`, the process proceeds as follows:

1. Add `3` to the last element: `9 + 3 = 12`. Set the last element to 2 and carry over 1.
2. Add the carry-over (1) to the second-to-last element: `9 + 1 = 10`. Set the second-to-last element to 0 and carry over 1 again.
3. Add the carry-over (1) to the first element: `9 + 1 = 10`. Set the first element to 0 and carry over 1 once more.

The final modified array is `[1, 0, 0, 2]`.

Write a function that takes an array and the user-input number `N` as input and returns the modified array after performing the described process.

 */
package dsaUsingJava;
import java.util.*;

public class AddInArray{

    public static void addIntegerToArray(ArrayList<Integer> arr , int number){
        int carry = 0;
        for(int i = arr.size()-1; i >=0 ; i--){
            int sum = arr.get(i) + number + carry;
            if(sum > 9){
                arr.set(i, sum%10);
                number = 0;
                carry = 1;
            }
            else{
                arr.set(i, sum);
                break;
            }
        }
        
        if (carry != 0 ) {
            arr.add(0,1);
            System.out.println(arr);
        }
        else
        {
            System.out.println(arr);
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList();
        Collections.addAll(arr, 9, 9, 9);
        System.out.println(arr);
        addIntegerToArray(arr, 3);
    }
 }