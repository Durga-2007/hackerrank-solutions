// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-21/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_21
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-22, 11:35 a.m.
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
        long arr[] = new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long key = sc.nextLong();
        for(int i=0;i<n;i++){
            if(arr[i]!=key){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
