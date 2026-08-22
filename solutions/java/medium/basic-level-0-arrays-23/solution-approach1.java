// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-23/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_23
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-22, 05:43 p.m.
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
        for(int i=0;i<n ;i++){
            arr[i]=sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<n - 1;i++){
            if(arr[i]>arr[i + 1]){
                 count++;
            }
        }
        if(count == 1 && arr[n - 1]<arr[0]){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
