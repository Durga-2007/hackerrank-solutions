// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-1-arrays-9/problem?isFullScreen=true
// Problem     Basic_Level_1_Arrays_9
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-26, 05:33 p.m.
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
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        for(int i=0;i<n - 1;i++){
            if(arr[i+1] != arr[i] + 1){
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}
