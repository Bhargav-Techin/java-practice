package dsaUsingJava;

import java.util.*;

public class QueueUsingArray {
    static int rare = -1;
    static int front = 0;

    public static void push(int arr[], int element) {
        rare++;
        arr[rare] = element;
    }

    public static void remove(int arr[]) {
        front++;
    }

    public static void display(int arr[]) {
        for (int i = front; i <= rare; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int arr[] = new int[3];
        while (true) {
            System.out.println(
                    "Enter 1 to add element in array. Enter 2 to remove element. Enter 3 to display the array. Enter 4 to exit.");
            try (Scanner scn = new Scanner(System.in)) {
                int i = scn.nextInt();
                switch (i) {
                    case 1:

                        if (rare != arr.length - 1) {
                            System.out.print("Enter element ");
                            int val = scn.nextInt();
                            push(arr, val);
                        } else {
                            System.out.println("No more space / Overflow");
                        }

                        break;
                    case 2:
                        if (front <= rare) {
                            remove(arr);
                        } else {
                            System.out.println("No more elements / Underflow");
                        }

                        break;
                    case 3:
                        display(arr);
                        break;
                    case 4:
                        System.exit(1);

                    default:
                        break;
                }
            }
        }
    }
}
