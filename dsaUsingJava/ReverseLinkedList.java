package dsaUsingJava;

public class ReverseLinkedList extends SinglyLinkedList {

    public void reverseList(){
        SinglyLinkedList.Node prevNode = head.next;
        SinglyLinkedList.Node nextNode = prevNode.next;

        head.next = null;

        while(head != tail){
            if(nextNode == null){
                prevNode.next = head;
                head = prevNode;
            }else {
                prevNode.next = head;
                head = prevNode;
                prevNode = nextNode;
                nextNode = nextNode.next;
            }
        }
        nextNode = head;
        while(nextNode.next != null){
            nextNode = nextNode.next;
        }
        tail = nextNode;
    }

    public static void main(String[] args) {
        ReverseLinkedList revL = new ReverseLinkedList();

        revL.addNode(60);
        revL.addNode(70);
        revL.addNode(80);
        revL.addNode(90);

        revL.reverseList();

        revL.display();
    }

}
