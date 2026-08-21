// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-16/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_16
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 10:09 a.m.
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
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        System.out.print(arr[0]+" ");
        System.out.print(arr[n - 1]);
    }
}
