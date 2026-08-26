// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-1-arrays-8/problem?isFullScreen=true
// Problem     Basic_Level_1_Arrays_8
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-26, 05:08 p.m.
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
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<n - 1;i++){
            sum = arr[i]+arr[i+1];
            arr[i+1] = sum;
        }
        int max = 0;
        
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j == 0){
                    count++;
                }
            }if(count == 2){
                max++;
            }
        }
        System.out.print(max);
    }
}
