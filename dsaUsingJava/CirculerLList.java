package dsaUsingJava;



public class CirculerLList {

    class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    public void createList(){
        Node initialNode = new Node(Integer.MAX_VALUE);
        if(head == null){
            head = initialNode;
            initialNode.next = head;
        }
    }

    public void addNode(int data){
        Node newNode = new Node(data);
           newNode.next = head.next;
           head.next = newNode;
    }

    public void display(){
        Node currentNode = head.next;
        while(currentNode != head){
            if(currentNode.data != Integer.MAX_VALUE) {
                System.out.println(currentNode.data);
            }
            currentNode = currentNode.next;
        }


    }

    public static void main(String[] args) {

        CirculerLList cl = new CirculerLList();
        cl.createList();
        cl.addNode(10);
        cl.addNode(40);
        cl.addNode(60);
        cl.addNode(70);
        cl.addNode(30);
        cl.addNode(20);

        cl.display();
    }
}
