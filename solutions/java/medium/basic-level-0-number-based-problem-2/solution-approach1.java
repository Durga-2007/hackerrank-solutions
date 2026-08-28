// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-2/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_2
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-28, 05:42 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Main {

    public static boolean isArmstrong(int num) {
        int original = num;
        int digits = String.valueOf(num).length();
        long sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
