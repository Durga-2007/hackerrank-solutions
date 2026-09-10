// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-crunching/challenges/basic-level-1-number-crunching-5/problem?isFullScreen=true
// Problem     Basic_Level_1_Number_Crunching_5
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-10, 08:12 p.m.
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
        int maxCount = 0;
        while(n>0){
            int val = n %10;
            int count =0;
            for(int i = 1;i<=val ;i++){
                
                if( val % i == 0){
                    count++;
                }
            } 
            if(count == 2){
                    maxCount++;
                } 
            n = n/10;
        }
        System.out.print(maxCount);
    }
}
