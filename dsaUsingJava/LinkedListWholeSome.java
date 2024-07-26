package dsaUsingJava;


public class LinkedListWholeSome {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insetAtBegin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insetAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insetAtMiddle(int data){
        Node currentNode = head;
        int nodeCount = 0;
        while(currentNode != null){
            nodeCount++;
            currentNode = currentNode.next;
        }
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            currentNode = head;
            for (int i = 1 ; i < nodeCount/2 ; i++){
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;

        }
    }

    public void deleteAtBegin(){
        if(head == null){
            System.out.println("List is empty!!");
        }
        else {
            Node currentNode = head;
            currentNode = currentNode.next;
            head.next = null;
            head = currentNode;
        }
    }

    public void deleteAtEnd(){
        if(head == null){
            System.out.println("List is empty!!");
        }
        else{
            Node currentNode = head;
            while (currentNode.next != tail){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            tail = currentNode;
        }
    }

    public void deleteAtMiddle(){

        if(head == null){
            System.out.println("List is empty!!");
        }
        else {
            Node currentNode = head;
            int nodeCount = 0;
            while (currentNode != null) {
                nodeCount++;
                currentNode = currentNode.next;
            }

            currentNode = head.next;
            Node prevNode = head;

            for (int i = 1; i < Math.ceil(nodeCount / 2); i++) {
                currentNode = currentNode.next;
                prevNode = prevNode.next;
            }

            prevNode.next = currentNode.next;
            currentNode.next = null;

        }
    }



    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty nothing to display!!");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }




    public static void main(String[] args) {
        LinkedListWholeSome list = new LinkedListWholeSome();
        list.insetAtBegin(20);
        list.insetAtBegin(30);

        list.insetAtEnd(15);
        list.insetAtEnd(5);
        list.insetAtEnd(0);

        list.insetAtMiddle(10);

        list.deleteAtBegin();
        list.deleteAtEnd();
        list.deleteAtMiddle();



        list.display();
    }
}
