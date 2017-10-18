package org.example;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Josephus problem is a theoretical problem related to a certain counting-out game.
 * People are standing in a circle waiting to be executed. Counting begins at a specified point in the circle and proceeds around the circle in a specified direction.
 * After a specified number of people are skipped, the next person is executed. The procedure is repeated with the remaining people, starting with the next person,
 * going in the same direction and skipping the same number of people, until only one person remains, and is freed.
 * <p>
 * Created by mordor on 10/16/17.
 */
public class JosephusProblem {
    /**
     * Josephus problem solution using a queue
     * @param n
     * @param k
     * @return
     */
    public static int josephus(int n, int k) {
        if (n < 1) throw new IllegalArgumentException("n is out of range!");
        if (k < 1 || k > n) throw new IllegalArgumentException("k is out of range!");

        Queue<Integer> people = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            people.add(i);
        }

        while (people.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                people.add(people.remove());
            }
            people.remove();
        }
        return people.remove();
    }
}
