package ardhastudio.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        // Queue<String> queue = new ArrayDeque<>(10);
        Queue<String> queue = new PriorityQueue<>();// gunakan priority queue apabila data yang ngin ditampilkan secara berurut

        // for (int i = 0 ; i < 10; i++){
        //    queue.add(String.valueOf(i));
        // }

        queue.add("fathar");
        queue.add("dhabit");
        queue.add("adz-dzaky");

        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
