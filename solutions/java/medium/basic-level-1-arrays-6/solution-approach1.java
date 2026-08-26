// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-1-arrays-6/problem?isFullScreen=true
// Problem     Basic_Level_1_Arrays_6
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-26, 05:23 p.m.
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
       boolean visited[] = new boolean[n];
       for(int i =0;i<n;i++){
        if(visited[i]){
            continue;
        }
        int count = 1;
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
                visited[j]=true;
            }
        }
        System.out.println(arr[i]+":"+count);
       }
    }
}
