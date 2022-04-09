package collectionsFramework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Prg8 {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(10);
        arrayDeque.add(20);
        arrayDeque.add(30);
        arrayDeque.add(40);
        arrayDeque.add(50);
        System.out.println(arrayDeque);

        for (Integer integer : arrayDeque) {
            System.out.println(integer);
        }

        Iterator<Integer> iterator = arrayDeque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println(arrayList);
        ListIterator<Integer> listIterator = arrayList.listIterator(2);
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());
        }
        System.out.println();
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous());
        }
    }
}
