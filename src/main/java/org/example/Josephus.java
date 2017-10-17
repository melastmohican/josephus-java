package org.example;

/**
 * g(n,k)=(g(n-1,k)+k){\bmod  n},{\text{ with }}g(1,k)=0
 * Created by mordor on 10/15/17.
 */
public class Josephus {
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
