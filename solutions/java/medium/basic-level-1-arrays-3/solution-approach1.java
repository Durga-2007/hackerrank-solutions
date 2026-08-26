// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-1-arrays-3/problem?isFullScreen=true
// Problem     Basic_Level_1_Arrays_3
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-26, 11:18 a.m.
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
     
        for(int i=0;i<n - 1;i++){
            
            if(arr[i]==arr[i+1]){
                arr[i] = arr[i]+arr[i+1];
                arr[i+1]=0;
            }
        }
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                System.out.print(arr[i] +" ");
                count++;
            }
        }
        for(int i=count;i<n;i++){
            System.out.print("0 ");
        }
        
    }
}
