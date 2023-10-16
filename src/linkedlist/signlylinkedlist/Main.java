package linkedlist.signlylinkedlist;

public class Main {
    static Node head = null;

    public static void main(String[] args) {
        insertAtHead(2);
        insertAtEnd(4);
        insertAfter(2, 3);
        printLinkedList();
    }

    private static void insertAfter(int after, int data) {
        Node temp = head;
        while(temp.data != after) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    private static void printLinkedList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static void insertAtEnd(int data) {
        if(head == null)
            head = new Node(data);
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }

    }

    private static void insertAtHead(int data) {
        if(head == null)
            head = new Node(data);
        else {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }
}
