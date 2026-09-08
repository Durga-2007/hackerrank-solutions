// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-1-number-based-problem-4/problem?isFullScreen=true
// Problem     Basic_Level_1_Number_Based_Problem_4
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-08, 06:50 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    static boolean containsDigit(int n, int d) {
        while (n > 0) {
            if (n % 10 == d) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    static boolean isGood(int n) {
        int sum = 0;
        boolean first = true;

        while (n > 0) {
            int digit = n % 10;

            if (!first && digit <= sum) {
                return false;
            }

            sum = sum + digit;
            n = n / 10;
            first = false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int d = sc.nextInt();

        for (int i = n1; i <= n2; i++) {

            if (!containsDigit(i, d) && isGood(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
