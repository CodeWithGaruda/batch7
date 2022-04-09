package collectionsFramework;

import java.util.TreeSet;

public class Prg6 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(100);
        treeSet.add(50);
        treeSet.add(150);
        treeSet.add(25);
        treeSet.add(75);
        treeSet.add(125);
        treeSet.add(175);
        System.out.println(treeSet);
        System.out.println(treeSet.ceiling(65));
        System.out.println(treeSet.higher(65));
        System.out.println(treeSet.ceiling(75));// 75
        System.out.println(treeSet.higher(75));// 100
        System.out.println(treeSet.floor(65));
        System.out.println(treeSet.lower(65));
        System.out.println(treeSet.floor(75));
        System.out.println(treeSet.lower(75));// 50
    }
}
