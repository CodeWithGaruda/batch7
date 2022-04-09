package collectionsFramework;

import java.util.LinkedList;

public class Prg3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(15);
        list.add(16);
        System.out.println(list);
        list.add(3, 14);
        System.out.println(list);
        System.out.println(list.peekLast());
        System.out.println(list.getFirst());
        System.out.println(list.poll());// removes element
        System.out.println(list);
    }
}
