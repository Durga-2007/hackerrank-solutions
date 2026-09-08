// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-1-number-based-problem-7/problem?isFullScreen=true
// Problem     Basic_Level_1_Number_Based_Problem_7
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-08, 06:41 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String str = String.valueOf(n);

        int count = 0;

        for (int i = 1; i < str.length() - 1; i++) {

            int current = str.charAt(i) - '0';
            int left = str.charAt(i - 1) - '0';
            int right = str.charAt(i + 1) - '0';

            if (current > left && current > right) {
                count++;
            }
        }
        System.out.print(count);
    }
}
