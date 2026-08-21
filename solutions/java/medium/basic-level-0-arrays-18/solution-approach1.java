// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-18/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_18
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-21, 07:10 p.m.
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
        boolean found = false;
        for(int i=n - 1;i>=0;i--){
            if(arr[i]==key){
                System.out.print(n - 1 -i);
                found = true;
                break;
            }  
        }
        if(!found){
            System.out.print("-1");
        }
    }
}
