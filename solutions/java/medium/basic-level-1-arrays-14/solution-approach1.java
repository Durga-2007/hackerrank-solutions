// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-1-arrays-14/problem?isFullScreen=true
// Problem     Basic_Level_1_Arrays_14
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-27, 06:06 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static boolean isFibonacci(int num) {

        if (num == 1 || num == 2) {
            return true;
        }

        int a = 1;
        int b = 2;

        while (b < num) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (isFibonacci(arr[i])) {

                if (arr[i] < min) {
                    min = arr[i];
                }

                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }

        System.out.println(min + " " + max);
    }
}
