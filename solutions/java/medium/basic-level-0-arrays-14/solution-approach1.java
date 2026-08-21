// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-14/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_14
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 09:52 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int val[] = new int[n];

        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (val[i] == val[i + 1]) {
                System.out.print(val[i] + " ");

                while (i < n - 1 && val[i] == val[i + 1]) {
                    i++;
                }
            }
        }
    }
}
