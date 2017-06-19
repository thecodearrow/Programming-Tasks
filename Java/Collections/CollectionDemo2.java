/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.*;

/**
 *
 * @author Prashanth
 * Title: To demonstrate collection classes: HashSet, ArrayList and TreeSet 
 * Class: class SetListDemo, public class CollectionDemo2
 * Methods: void hashSetDemo(),void arrayListDemo(),void treeSetDemo()
 *
 */
class SetListDemo {

    void hashSetDemo() {
        System.out.println("Hash Set Demo");
        //Creating HashSet and adding elements  
        HashSet<String> set = new HashSet<>();
        set.add("Set1");
        set.add("Set1");
        set.add("Set1");
        //Traversing elements  
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\n");
    }

    void arrayListDemo() {
        System.out.println("Array List Demo");
        ArrayList<String> list = new ArrayList<>();//Creating arraylist  
        list.add("List1");//Adding object in arraylist  
        list.add("List2");
        list.add("List3");

        //Traversing list through Iterator  
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\n");
    }

    void treeSetDemo() {
        System.out.println("Tree Set Demo");
        //Creating TreeSet and adding elements  
        TreeSet<String> set = new TreeSet<>();
        set.add("Set3");
        set.add("Set2");
        set.add("Set1");
        //Traversing elements  
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\n");
    }

}

public class CollectionDemo2 {

    public static void main(String[] args) {
        SetListDemo sl = new SetListDemo();
        sl.arrayListDemo();
        sl.hashSetDemo();
        sl.treeSetDemo();

    }
}
