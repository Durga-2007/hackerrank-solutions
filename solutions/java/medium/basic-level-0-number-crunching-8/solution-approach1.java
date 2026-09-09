// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-crunching/challenges/basic-level-0-number-crunching-8/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Crunching_8
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-09, 09:36 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            sum = sum + factorial(digit);

            n = n / 10;
        }

        System.out.print(sum);
    }
}
