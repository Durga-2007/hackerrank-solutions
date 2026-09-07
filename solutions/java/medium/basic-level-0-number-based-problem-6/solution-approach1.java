// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-6/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_6
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-07, 05:57 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static boolean isUgly(long n){
        while(n % 2 == 0){
            n = n/2;
        }
        while(n % 3 == 0){
            n = n/3;
        }
        while(n % 5 == 0){
            n = n/5;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(isUgly(n)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
