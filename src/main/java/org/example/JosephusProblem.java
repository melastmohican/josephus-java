package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by mordor on 10/16/17.
 */
public class JosephusProblem {

    public static int josephus(int n, int k) {
        if (n < 1) throw new IllegalArgumentException("n is out of range!");
        if (k < 1 || k > n) throw new IllegalArgumentException("k is out of range!");

        //List<Integer> people = new ArrayList<Integer>(n);
        Queue<Integer> people = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            people.add(i);
        }


        /*for (int i=k; people.size()>1; i=(i+k)%people.size()) {
            people.remove(i);
        }
        return people.remove(0);*/

        while (people.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                people.add(people.remove()); // move the front element to the end
            }
            people.remove(); // remove the front element
        }
        return people.remove();
    }
}
