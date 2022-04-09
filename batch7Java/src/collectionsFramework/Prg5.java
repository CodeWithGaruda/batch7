package collectionsFramework;

import java.util.PriorityQueue;

public class Prg5 {
    public static void main(String[] args) {
        // min heap DS
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(100);
        priorityQueue.add(50);
        priorityQueue.add(150);
        priorityQueue.add(25);
        priorityQueue.add(75);
        priorityQueue.add(125);
        priorityQueue.add(175);
        System.out.println(priorityQueue);
    }
}
