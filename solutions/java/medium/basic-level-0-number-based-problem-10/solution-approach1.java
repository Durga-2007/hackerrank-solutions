// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-10/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_10
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-07, 06:40 p.m.
// ──────────────────────────────────────────────────


import java.util.*;

public class Solution {

    static boolean isCircular(long n1, long n2) {

        long original = n1;
        int digits = String.valueOf(n1).length();

        long power = 1;

        for (int i = 1; i < digits; i++) {
            power = power * 10;
        }

        for (int i = 0; i < digits; i++) {
            if (n1 == n2) {
                return true;
            }

            long last = n1 % 10;

            n1 = n1 / 10;

            n1 = last * power + n1;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n1 = sc.nextLong();
        long n2 = sc.nextLong();

        if (isCircular(n1, n2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
