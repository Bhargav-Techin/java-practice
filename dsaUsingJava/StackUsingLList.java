package dsaUsingJava;

import java.util.*;

public class StackUsingLList {
    static Scanner scn = new Scanner(System.in);

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node top = null;
    public Node tail = null;
    public static int counter = 0;
    public static int nodeNumber = 0;

    public void push() {

        if (counter == nodeNumber && nodeNumber != 0) {
            System.out.println("Overflow");
        } else {
            System.out.print("Enter element ");
            int paraData = scn.nextInt();
            Node newNode = new Node(paraData);
            if (top == null) {
                top = newNode;
                tail = newNode;
            } else {
                top.next = newNode;
                top = top.next;
            }
            counter++;
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Underflow");
        } else {
            Node current = tail;
            if (current.next == null) {
                top = null;
                tail = null;
            } else {
                while (current.next != top) {
                    current = current.next;
                }
                current.next = null;
                top = current;
            }
            counter--;
        }
    }

    public void display() {
        Node current = tail;
        ArrayList<Integer> stackArray = new ArrayList<Integer>();
        System.out.println("Nodes of stack: ");
        while (current != null) {
            stackArray.add(current.data);
            current = current.next;
        }
        Collections.reverse(stackArray);
        System.out.println(stackArray);
    }

    public static void main(String[] args) {
        StackUsingLList stack = new StackUsingLList();
        System.out.println("Enter number of nodes you want to insert.");
        nodeNumber = scn.nextInt();

        while (true) {
            System.out.println(
                    "Enter 1 to push an element onto the stack. Enter 2 to pop an element from the stack. Enter 3 to display the stack. Enter 4 to exit.");
            int i = scn.nextInt();
            switch (i) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.exit(1);

                default:
                    break;
            }

        }
    }

}
