// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-7/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_7
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-07, 06:18 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static boolean isVal(long n){
        long org = n;
        long mul = org * n;
        int digits = String.valueOf(org).length();
        
        long divisor = 1;
        for(int i=0;i<digits;i++){
            divisor = divisor*10;
        }
        long right = mul % divisor;
        long left = mul / divisor;
         return right+left == org;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(isVal(n)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        
    }
}
