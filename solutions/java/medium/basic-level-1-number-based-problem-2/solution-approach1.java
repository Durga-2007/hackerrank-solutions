// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-1-number-based-problem-2/problem?isFullScreen=true
// Problem     Basic_Level_1_Number_Based_Problem_2
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-07, 07:04 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    static boolean isPrime(long n) {

        if (n < 2) {
            return false;
        }

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isCircularPrime(long n) {

        long original = n;
        int digits = String.valueOf(n).length();

        long power = 1;

        for (int i = 1; i < digits; i++) {
            power = power * 10;
        }

        for (int i = 0; i < digits; i++) {
            if (!isPrime(n)) {
                return false;
            }

            long last = n % 10;

            n = n / 10;

            n = last * power + n;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long start = sc.nextLong();
        long end = sc.nextLong();

        for (long i = start; i <= end; i++) {

            if (isCircularPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
