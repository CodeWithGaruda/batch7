package collectionsFramework;

import java.util.ArrayList;

public class Prg1 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        arrayList.add(11);
        arrayList.add("bhavith");
        arrayList.add('s');
        arrayList.add(5.5);
        System.out.println(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(21);
        arrayList2.add("swathi");
        arrayList2.add('s');
        arrayList2.add(6.1);
        System.out.println(arrayList2);
        arrayList.add(arrayList2);
        // arrayList.addAll(arrayList2);
        System.out.println(arrayList);
        arrayList.remove(arrayList2);
        // arrayList.removeAll(arrayList2);
        System.out.println(arrayList);
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);
        arrayList.retainAll(arrayList2);
        System.out.println(arrayList);
    }
}
