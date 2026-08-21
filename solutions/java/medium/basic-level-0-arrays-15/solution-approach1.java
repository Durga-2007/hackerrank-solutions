// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-15/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_15
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 10:05 a.m.
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
        long val[] = new long[n];
        for(int i=0;i<n;i++){
            val[i]=sc.nextLong();
        }
        int index = sc.nextInt();
       System.out.print(val[index]);
       
    }
}
