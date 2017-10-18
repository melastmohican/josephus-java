package org.example;

/**
 * Josephus problem is a theoretical problem related to a certain counting-out game.
 * People are standing in a circle waiting to be executed. Counting begins at a specified point in the circle and proceeds around the circle in a specified direction.
 * After a specified number of people are skipped, the next person is executed. The procedure is repeated with the remaining people, starting with the next person,
 * going in the same direction and skipping the same number of people, until only one person remains, and is freed.
 * <p>
 * g(n,k)=(g(n-1,k)+k){\bmod  n},{\text{ with }}g(1,k)=0
 * Created by mordor on 10/15/17.
 */
public class Josephus {
    /**
     * Josephus problem - recursive solution
     * @param n
     * @param k
     * @return
     */
    public static int josephus(int n, int k) {
        if (n < 1) throw new IllegalArgumentException("n is out of range!");
        if (k < 1 || k > n) throw new IllegalArgumentException("k is out of range!");
        if (n == 1) return 0;

        return josephusRecursive(n, k);
    }

    private static int josephusRecursive(int n, int k) {
        if (n == 1) return 0;

        return (josephusRecursive(n - 1, k) + k) % n;
    }
}
