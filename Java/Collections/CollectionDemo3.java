
package week10;

import java.util.*;

/**
 *
 * @author Prashanth
 * Title: Abstract Map, Hash Map, Tree Map
 * Classes: class MapDemo, public class CollectionDemo3
   Methods: void treeMap(),  void hashMap()
 */
class MapDemo {

    void hashMap() {
        System.out.println("Hash Map Demo");

        //HashMap inherits from Abstract Map class
        AbstractMap<Integer, String> hm = new HashMap<>();

        hm.put(100, "Alpha");
        hm.put(101, "Beta");
        hm.put(102, "Gamma");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("\n");

    }

    void treeMap() {
        System.out.println("Tree Map Demo");
        TreeMap<Integer, String> hm = new TreeMap<>();
        hm.put(100, "Alpha");
        hm.put(102, "Gamma");
        hm.put(101, "Beta");
        //Functional Operation
        hm.entrySet().forEach((m) -> {
            System.out.println(m.getKey() + " " + m.getValue());
        });
        System.out.println("\n");

    }
}

public class CollectionDemo3 {

    public static void main(String[] args) {

        MapDemo md = new MapDemo();
        md.hashMap();
        md.treeMap();

    }

}
