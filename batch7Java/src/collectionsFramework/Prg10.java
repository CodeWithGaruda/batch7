package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prg10 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(3);
        System.out.println(arrayList);
        // Collections class
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println(Collections.binarySearch(arrayList, 4));
        System.out.println(Collections.min(arrayList));
        System.out.println(Collections.max(arrayList));
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        // arrayList.add(5);
        System.out.println(arrayList);
        System.out.println(Collections.frequency(arrayList, 5));
        Collections.rotate(arrayList, 2);
        System.out.println(arrayList);

        // 2nd max number
        Collections.sort(arrayList);
        // Collections.rotate(arrayList, 1);
        System.out.println(arrayList.get(arrayList.size() - 2));

        Integer[] array = new Integer[] { 3, 6, 4, 2, 8, 1 };
        List<Integer> list = Arrays.asList(array);
        Collections.sort(list);
        System.out.println(list);
    }
}
