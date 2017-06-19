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
 * Title: To demonstrate collection interfaces: Set, List and Queue 
 * Class: class SetListQueue, public class CollectionDemo1 
 * Methods: void setDemo(),void listDemo(),void queueDemo()
 *
 */
class SetListQueue {

    void setDemo() {
        System.out.println("Set Interface Demo");
        //Creating HashSet and adding elements  
        Set<String> set = new HashSet<>();
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

    void listDemo() {
        System.out.println("List Interface Demo");
        List<String> list = new ArrayList<>();//Creating arraylist  
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

    void queueDemo() {
        System.out.println("Queue Interface Demo");
        //Creating Deque and adding elements  
        Queue<String> deque = new ArrayDeque<>();
        deque.add("Queue1");
        deque.add("Queue2");
        deque.add("Queue3");
        //Traversing elements  
        for (String str : deque) {
            System.out.println(str);
        }
        System.out.println("\n");
    }

}

public class CollectionDemo1 {

    public static void main(String[] args) {
        SetListQueue slq = new SetListQueue();
        slq.listDemo();
        slq.setDemo();
        slq.queueDemo();

    }
}
