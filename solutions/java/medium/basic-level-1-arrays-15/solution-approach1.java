// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-1-arrays-15/problem?isFullScreen=true
// Problem     Basic_Level_1_Arrays_15
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-27, 05:54 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] arr1 = new long[n];
        long[] arr2 = new long[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextLong();
        }

        int i = 0;
        int j = 0;
        int count = 0;

        while (i < n && j < n) {

            if (arr1[i] > arr2[j]) {
                count++;
                i++;
                j++;
            } else {
                i++;
            }
        }

        System.out.print(count);
    }
}
