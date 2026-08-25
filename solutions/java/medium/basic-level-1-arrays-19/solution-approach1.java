// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-1-arrays-19/problem?isFullScreen=true
// Problem     Basic_Level_1_Arrays_19
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-25, 06:26 p.m.
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
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max =0;
        int count =0;
        for(int i=0;i<n;i++){
            
            if(arr[i]>0){
                count++;
                if(count > max){
                    max =count;
            }
            }
            
            else{
                count =0;
            }
        }
        System.out.print(max);
    }
}
