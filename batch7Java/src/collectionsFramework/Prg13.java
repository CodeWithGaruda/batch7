package collectionsFramework;

import java.util.HashMap;
import java.util.TreeMap;

public class Prg13 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // key:value
        map.put(1, "bhavith");
        map.put(2, "swathi");
        map.put(3, "uncle");
        System.out.println(map);
        System.out.println(map.get(1) + " " + map.get(2));

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("swathi", 1);
        map1.put("uncle", 2);
        map1.put("swathiuncle", 3);
        System.out.println(map1.get("swathi") * 100);

        Crickter bhavith = new Crickter("bhavith", 100000, 90.5);
        Crickter swathi = new Crickter("swathi", 10000000, 89.5);
        Crickter spectsUncle = new Crickter("uncle", 5000, 50.7);

        HashMap<String, Crickter> mapCrickter = new HashMap<>();
        mapCrickter.put("bhavith", bhavith);
        mapCrickter.put("swathi", swathi);
        mapCrickter.put("uncle", spectsUncle);

        System.out.println(mapCrickter.get("bhavith"));

        map1.put("swathiuncle", 5);
        System.out.println(map1.get("swathi" + "uncle"));
    }
}
