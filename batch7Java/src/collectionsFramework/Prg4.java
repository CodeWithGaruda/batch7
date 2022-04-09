package collectionsFramework;

import java.util.ArrayDeque;

public class Prg4 {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(11);
        arrayDeque.add(12);
        arrayDeque.add(13);
        arrayDeque.add(14);
        System.out.println(arrayDeque);
        arrayDeque.addFirst(10);
        arrayDeque.addLast(20);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());
        System.out.println(arrayDeque.removeFirst());
        System.out.println(arrayDeque.removeLast());
        System.out.println(arrayDeque);
    }
}
