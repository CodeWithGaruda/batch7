package collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class Prg2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println(arrayList);
        arrayList.add(1, 2);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList.contains(4));
        System.out.println(arrayList.contains(7));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf(5));
        System.out.println(arrayList.lastIndexOf(5));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }

        arrayList.set(0, 10);
        System.out.println("\n" + arrayList);
    }
}
