package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAlgorithm {
    public static void main(String[] args) {
        // basics();// Basic Queue Operations

        printBinary(5);
        printBinary(2);
        printBinary(0);
        printBinary(1);
        printBinary(-5);
    }

    public static void basics() {
        // we can use linked list as priority queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(5);
        queue.add(15);

        // remove will follow FiFO rule and remove the first entered item from the queue

        int removedItem = queue.remove();
        System.out.println(removedItem);
        System.out.println(queue.remove());
        // Peek checks the top item of the queue
        System.out.println(queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());

        }

    }

    public static void printBinary(int n) {
        // Check if the input number is less than or equal to 0
        if (n <= 0) {
            System.out.println();
            return;// exit
        }

        // Create a queue to store binary numbers
        Queue<Integer> queue = new LinkedList<>();
        // start with one
        queue.add(1);

        // Loop to generate and print binary numbers
        for (int i = 0; i < n; i++) {
            int current = queue.remove(); // Remove the front element of the queue
            System.out.println(current); // Print the current binary number
            queue.add(current * 10); // Add the next binary number by appending '0'
            queue.add(current * 10 + 1); // Add the next binary number by appending '1'
        }
        System.out.println();

    }
}
