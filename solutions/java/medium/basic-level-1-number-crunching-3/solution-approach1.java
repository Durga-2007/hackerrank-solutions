// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-crunching/challenges/basic-level-1-number-crunching-3/problem?isFullScreen=true
// Problem     Basic_Level_1_Number_Crunching_3
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-10, 07:28 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        while(n>0){
            int val = n % 10;
            if(val > max){
                max = val;
            }
            n = n / 10;
        }
        System.out.print(max);
    }
}
