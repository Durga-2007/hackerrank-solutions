// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-crunching/challenges/basic-level-2-number-crunching-4/problem?isFullScreen=true
// Problem     Basic_Level_2_Number_Crunching_4
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-11, 06:27 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String a =sc.next();
        String b =sc.next();
        
        StringBuilder result = new StringBuilder(n);
        
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) == a.charAt(0)){
                result.setCharAt(i ,b.charAt(0));
            }
        }
        System.out.print(result);
    }
}
