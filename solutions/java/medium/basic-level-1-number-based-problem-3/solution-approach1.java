// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-1-number-based-problem-3/problem?isFullScreen=true
// Problem     Basic_Level_1_Number_Based_Problem_3
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-08, 07:23 p.m.
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
        String org = String.valueOf(n);
        for(int i = 0;i<org.length() - 1;i++){
            for(int j = i+1;j<org.length() ;j++){
                if(org.charAt(i) == org.charAt(j)){
                    System.out.print("NO");
                    return;
                }
            } 
        }
        System.out.print("YES");
        
    }
}
