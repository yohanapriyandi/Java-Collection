package ardhastudio.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Yohan");
        stack.offerLast("Apriyandi");
        stack.offerLast("Fathar");
        stack.offerLast("Dhabit");
        stack.offerLast("Adz-dzaky");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> deque = new LinkedList<>();
        deque.add("fathar");
        deque.add("dhabit");
        deque.add("adz-dzaky");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
    }
}
