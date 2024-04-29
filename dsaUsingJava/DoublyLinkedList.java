package dsaUsingJava;

public class DoublyLinkedList {
    class Node{
        int data;
        Node next;
        Node prev;

        Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
                if(head == null){
                    head = newNode;
                    tail = newNode;
                }
                else{
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = newNode;
                }
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverseDisplay(){
        Node current = tail;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);

        dList.display();
        dList.reverseDisplay();
    }
}
