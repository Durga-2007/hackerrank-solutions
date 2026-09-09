// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-crunching/challenges/basic-level-0-number-crunching-6/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Crunching_6
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-09, 09:18 p.m.
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
        while(n>0){
            int v = n % 10;
            if(v % 2 == 0){
                System.out.print(v + " ");
            }
            n = n / 10;
        }
    }
}
