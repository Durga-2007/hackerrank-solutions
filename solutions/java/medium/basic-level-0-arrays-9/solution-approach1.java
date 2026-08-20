// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-9/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_9
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-20, 07:09 p.m.
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
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = sc.nextInt();
        }

        int min = result[0];

        for(int i = 0; i < n; i++) {
            if(result[i] < min) {
                min = result[i];
            }
        }

        System.out.print(min);
    }
}
