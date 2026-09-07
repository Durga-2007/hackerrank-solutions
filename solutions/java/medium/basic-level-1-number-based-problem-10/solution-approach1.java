// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-1-number-based-problem-10/problem?isFullScreen=true
// Problem     Basic_Level_1_Number_Based_Problem_10
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-07, 07:22 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static boolean isAbundent(int n){
        int sum =0;
        for(int i=1;i<n;i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum>n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i=start;i<=end;i++){
            if(isAbundent(i)){
                System.out.print(i+" ");
            }
        }
    }
}
