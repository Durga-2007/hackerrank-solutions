// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-crunching/challenges/basic-level-1-number-crunching-10/problem?isFullScreen=true
// Problem     Basic_Level_1_Number_Crunching_10
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-10, 08:19 p.m.
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
        int org = n;
        int rev = 0;
        while(n>0){
            int v = n %10;
            rev = v+ (rev * 10);
            n = n/10;
        }
        
        if(org == rev){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
