package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAlgorithm {
    public static void main(String[] args) {
        //we can use linked list as priority queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(5);
        queue.add(15);

        //remove will follow FiFO rule and remove the first entered item from the queue

        int removedItem = queue.remove();
        System.out.println(removedItem);
        System.out.println(queue.remove());
        //Peek checks the top item of the queue
        System.out.println(queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
            
        }

    }
}
