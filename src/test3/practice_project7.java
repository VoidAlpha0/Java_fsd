package test3;

class DlinkedNode {
    int data;
    DlinkedNode prev;
    DlinkedNode next;

    DlinkedNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
	DlinkedNode head;

    void insert(int data) {
    	DlinkedNode newNode = new DlinkedNode(data);

        if (head == null) {
            head = newNode;
        } else {
        	DlinkedNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }

        System.out.println(data + " inserted successfully.");
    }

    void traverseForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Forward traversal: ");
        DlinkedNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void traverseBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Backward traversal: ");
        DlinkedNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class practice_project7 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.traverseForward();
        list.traverseBackward();
    }
}
