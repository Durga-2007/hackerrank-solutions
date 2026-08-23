// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-28/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_28
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 06:22 p.m.
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
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;   
        
        for(int i=0;i<n;i++){
            if(arr[i]<first){
                second = first;
                first=arr[i];
            }
            else if(arr[i]<second){
                second=arr[i];
            }
        }
        System.out.print(second);
    }
}
