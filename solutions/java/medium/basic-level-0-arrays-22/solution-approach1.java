// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-22/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_22
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-22, 01:25 p.m.
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
        long arr1[]=new long[n];
        long arr2[]=new long[n];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextLong();
        }
        for(int i=0;i<n;i++){
            arr2[i] = sc.nextLong();
        }
        long val[] = new long[2 * n];
        
        //Arrays.sort(arr2);
        for(int i=0;i<n;i++){
            val[i]= arr1[i];
            
        }
        for(int i=0;i<n;i++){
            val[i + n ]= arr2[i];
        }
        Arrays.sort(val);
        long sum = val[n - 1] + val[n];

        if (sum % 2 == 0) {
            System.out.print(sum / 2);
        } else {
            System.out.print(sum / 2.0);
        }
    }
}
