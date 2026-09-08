// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-crunching/challenges/basic-level-0-number-crunching-1/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Crunching_1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-08, 07:27 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String str = String.valueOf(n);
        int count = 0;
        for(int i=0;i<str.length();i++){
            count++;
        }   
        System.out.print(count);
    }
}
