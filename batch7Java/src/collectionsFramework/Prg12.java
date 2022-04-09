package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CustomSort implements Comparator<Crickter> {
    @Override
    public int compare(Crickter o1, Crickter o2) {
        if (o1.avg > o2.avg)
            return 1;
        else
            return -1;
    }
}

public class Prg12 {
    public static void main(String[] args) {
        Crickter bhavith = new Crickter("bhavith", 100000, 90.5);
        Crickter swathi = new Crickter("swathi", 10000000, 89.5);
        Crickter spectsUncle = new Crickter("uncle", 5000, 50.7);

        List<Crickter> list = new ArrayList<>();

        list.add(bhavith);
        list.add(swathi);
        list.add(spectsUncle);

        CustomSort customSort = new CustomSort();
        Collections.sort(list, customSort);

        for (Crickter crickter : list) {
            System.out.println(crickter);
        }
    }
}
