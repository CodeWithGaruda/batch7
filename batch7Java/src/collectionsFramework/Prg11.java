package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Crickter implements Comparable {
    String name;
    int runs;
    double avg;

    public Crickter(String name, int runs, double avg) {
        this.name = name;
        this.runs = runs;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Crickter [avg=" + avg + ", name=" + name + ", runs=" + runs + "]";
    }

    @Override
    public int compareTo(Object o) {
        if (this.runs > ((Crickter) o).runs)
            return 1;
        else
            return -1;
    }
}

public class Prg11 {
    public static void main(String[] args) {
        Crickter bhavith = new Crickter("bhavith", 100000, 90.5);
        Crickter swathi = new Crickter("swathi", 10000000, 89.5);
        Crickter spectsUncle = new Crickter("uncle", 5000, 50.7);

        List<Crickter> list = new ArrayList<>();

        list.add(bhavith);
        list.add(swathi);
        list.add(spectsUncle);

        Collections.sort(list);
        for (Crickter crickter : list) {
            System.out.println(crickter);
        }
    }
}
