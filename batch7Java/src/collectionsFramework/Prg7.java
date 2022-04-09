package collectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Prg7 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(100);
        hashSet.add(50);
        hashSet.add(150);
        hashSet.add(25);
        hashSet.add(75);
        hashSet.add(125);
        hashSet.add(175);
        System.out.println(hashSet);
        System.out.println(hashSet.contains(25));
        // to retain insertion order
        LinkedHashSet hashSet2 = new LinkedHashSet<>();
        hashSet2.add(100);
        hashSet2.add(50);
        hashSet2.add(150);
        hashSet2.add(25);
        hashSet2.add(75);
        hashSet2.add(125);
        hashSet2.add(175);
        System.out.println(hashSet2);
        System.out.println(hashSet2.contains(25));
    }
}
