// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-10/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_10
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-20, 07:13 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum += result[i];
        }
        int avg = sum/n;
        System.out.print(avg);
    }
}
