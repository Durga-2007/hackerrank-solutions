// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-1-arrays-4/problem?isFullScreen=true
// Problem     Basic_Level_1_Arrays_4
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 08:00 p.m.
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
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=i + 1;j<n;j++){
                if(arr[i]>arr[j]){
                    System.out.println(arr[i] + " " + arr[j]);
                    count++;
                }
            }
        }
        System.out.println(count); 
    }
}
