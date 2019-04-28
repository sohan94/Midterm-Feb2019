package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList list = new ArrayList();

        //add to the ArrayList
        list.add("daljeet");
        list.add("Jannat");
        list.add("Sohan");
        list.add(1);
        list.add(2);
        list.add(3);
        //Print ArrayList
        System.out.println(list);
        //peek at ArrayList
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(0));
        //remove from list and then print
        list.remove(0);
        System.out.println(list);

        //Using 'forEach' loop
        System.out.println("Use of for each loop: ");
        for (Object st : list) {
            System.out.println(st);
        }

        //using iterator
        System.out.println("Use of iterator using while loop: ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
