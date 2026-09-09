// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-crunching/challenges/basic-level-0-number-crunching-7/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Crunching_7
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-09, 09:27 p.m.
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
        int sum1 = 0;
        int sum2= 0;
        int pro1 = 1;
        int pro2 = 1;
        while(n > 0){
            int val = n % 10;
            if( val % 2 == 0){
                sum2 += val;
                pro2 *= val;
            }else{
                sum1 += val;
                pro1 *= val;
            }
            n = n / 10;
        }
        System.out.println("Sum of Odd:"+sum1);
        System.out.println("Sum of Even:"+sum2);
        System.out.println("Product of ODD:"+pro1);
        System.out.print("Product of Even:"+pro2);
    }
}
