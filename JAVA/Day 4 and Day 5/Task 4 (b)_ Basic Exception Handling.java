//Task 4: Basic Exception Handling

//2) Develop a CustomQueue class with methods for Enqueue, Dequeue, Peek, and IsEmpty. Show how your queue can handle different data types by enqueuing strings and integers, then dequeuing and displaying them to confirm FIFO order.

import java.util.LinkedList;

public class CustomQueue<T> {
    private LinkedList<T> queue;

    public CustomQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.addLast(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }
        return queue.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot peek.");
        }
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        CustomQueue<Integer> intQueue = new CustomQueue<>();
        intQueue.enqueue(1);
        intQueue.enqueue(2);
        intQueue.enqueue(3);

        System.out.println("Dequeued integers:");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.dequeue());
        }

        CustomQueue<String> stringQueue = new CustomQueue<>();
        stringQueue.enqueue("One");
        stringQueue.enqueue("Two");
        stringQueue.enqueue("Three");

        System.out.println("Dequeued strings:");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.dequeue());
        }
    }
}
