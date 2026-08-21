// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-19/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_19
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 09:17 p.m.
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
            arr[i] =sc.nextLong();
        }
        long a = sc.nextLong();
        long b = sc.nextLong();
        long val[] = new long[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(i == 0){
                val[index] = a;
                index++;
            }
            else if(i == n - 1){
                val[index] = b;
            }
            else{
                val[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(val[i]+" ");
        }
        
    }
}
