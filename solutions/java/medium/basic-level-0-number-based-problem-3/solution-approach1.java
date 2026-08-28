// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-3/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_3
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-28, 09:21 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int org = n;
        int sum = 0;
        while(n>0){
            int val = n % 10;
            int fact =1 ;
            for(int i=1;i<=val;i++){
                fact *= i ;
            }
            sum += fact;
            n = n/10;
        }
        if(org == sum){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
