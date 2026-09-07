// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-1-number-based-problem-9/problem?isFullScreen=true
// Problem     Basic_Level_1_Number_Based_Problem_9
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-07, 08:25 p.m.
// ──────────────────────────────────────────────────


import java.util.*;

public class Solution {

    static boolean isKeith(long n) {

        long org = n;

        int digits = String.valueOf(n).length();

        long temp = n;
        long[] arr = new long[digits];

        for (int i = digits - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp = temp / 10;
        }

        long sum;
        while (true) {
            sum = 0;
            for (int i = 0; i < digits; i++) {
                sum = sum + arr[i];
            }

            if (sum == org) {
                return true;
            }

            if (sum > org) {
                return false;
            }

            for (int i = 0; i < digits - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[digits - 1] = sum;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (isKeith(n)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
