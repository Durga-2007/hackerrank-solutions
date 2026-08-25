// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-1-arrays-20/problem?isFullScreen=true
// Problem     Basic_Level_1_Arrays_20
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-25, 06:40 p.m.
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
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int sum = sc.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    found = true;
                    break;
                }
            }
        }
        if(found){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
