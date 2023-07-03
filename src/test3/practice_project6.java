package test3;

class curcularNode {
    int data;
    curcularNode next;

    curcularNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
	curcularNode head;

    CircularLinkedList() {
        head = null;
    }

    void insert(int data) {
    	curcularNode newNode = new curcularNode(data);

        if (head == null) {
            head = newNode;
            head.next = head; // Point to itself to form a circular list
        } else if (data <= head.data) {
            newNode.next = head;
            head = newNode;
        } else {
        	curcularNode current = head;
            while (current.next != head && data > current.next.data) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }

        System.out.println(data + " inserted successfully.");
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        curcularNode current = head;
        System.out.print("Circular Linked List: ");

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}

public class practice_project6 {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(20);

        list.display();
    }
}
