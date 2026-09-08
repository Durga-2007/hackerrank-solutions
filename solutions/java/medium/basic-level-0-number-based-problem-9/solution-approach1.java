// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-9/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_9
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-08, 07:05 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    static long reverse(long n) {
        long rev = 0;

        while (n > 0) {
            long digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return rev;
    }

    static boolean isPalindrome(long n) {
        long original = n;
        long rev = reverse(n);

        return original == rev;
    }

    static boolean isLychrel(long n, int maxIterations) {

        for (int i = 1; i <= maxIterations; i++) {

            long rev = reverse(n);

            n = n + rev;

            if (isPalindrome(n)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int maxIterations = sc.nextInt();

        if (isLychrel(n, maxIterations)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
