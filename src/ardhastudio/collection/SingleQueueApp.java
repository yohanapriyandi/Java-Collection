package ardhastudio.collection;

import ardhastudio.collection.collection.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());

        System.out.println(queue.offer("Fathar"));
        System.out.println(queue.offer("Dhabit"));
        System.out.println(queue.offer("Adz-dzaky"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
