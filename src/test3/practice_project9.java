package test3;

import java.util.LinkedList;
import java.util.Queue;

public class practice_project9 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Inserting elements into the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("Queue: " + queue);

        // Removing elements from the queue
        int removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Queue after poll operation: " + queue);

        int frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue Empty? " + isEmpty);

        int queueSize = queue.size();
        System.out.println("Queue Size: " + queueSize);
    }
}
