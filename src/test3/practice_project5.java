package test3;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    void insert(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        
        System.out.println(data + " inserted successfully.");
    }
    
    void delete(int key) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        
        if (head.data == key) {
            head = head.next;
            System.out.println("First occurrence of " + key + " deleted successfully.");
            return;
        }
        
        Node current = head;
        Node prev = null;
        
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Key not found in the list.");
        } else {
            prev.next = current.next;
            System.out.println("First occurrence of " + key + " deleted successfully.");
        }
    }
    
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        
        Node current = head;
        System.out.print("Linked List: ");
        
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        
        System.out.println();
    }
}

public class practice_project5 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        list.insert(25);
        
        list.display();
        
        list.delete(15);
        
        list.display();
        
        list.delete(5);
        
        list.display();
        
        list.delete(30);
        
        list.display();
    }
}
