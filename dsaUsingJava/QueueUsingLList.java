package dsaUsingJava;

import java.util.Scanner;

public class QueueUsingLList {

    static Scanner scn = new Scanner(System.in);

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;
    public static int counter = 0;
    public static int nodeNumber = 0;

    public void enqueue() {
        if (counter == nodeNumber && nodeNumber != 0) {
            System.out.println("Overflow");
        } else {
            System.out.print("Enter element ");
            int NodeData = scn.nextInt();
            Node newNode = new Node(NodeData);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            counter++;
        }
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("Underflow");
        } else {
            System.out.println("Dequeued element is " + head.data);
            head = head.next;
            counter--;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLList queue = new QueueUsingLList();
        System.out.println("Enter number of nodes you want to insert.");
        nodeNumber = scn.nextInt();

        while (true) {
            System.out.println(
                    "Enter 1 to enqueue an element onto the queue. Enter 2 to dequeue an element from the queue. Enter 3 to display the queue. Enter 4 to exit.");
            try (Scanner scn = new Scanner(System.in)) {
                int i = scn.nextInt();
                switch (i) {
                    case 1:
                        queue.enqueue();
                        break;
                    case 2:
                        queue.dequeue();
                        break;
                    case 3:
                        queue.display();
                        break;
                    case 4:
                        System.exit(1);
                    default:
                        System.out.println("Invalid input");
                        break;
                }
            }
        }
    }

}
