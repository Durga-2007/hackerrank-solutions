// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-20/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_20
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-22, 11:31 a.m.
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
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        int div = sc.nextInt();
        for(int i=0;i<n;i++){
            long val = arr[i]%div;
            System.out.print(val+" ");
        }
    }
}
