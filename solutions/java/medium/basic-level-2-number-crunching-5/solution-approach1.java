// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-crunching/challenges/basic-level-2-number-crunching-5/problem?isFullScreen=true
// Problem     Basic_Level_2_Number_Crunching_5
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-11, 11:54 a.m.
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
        String result = "";
        for(int i=0;i<n.length() - 1;i+=2){
            result = result + n.charAt(i+1);
            result = result + n.charAt(i);
        }
        if(n.length() % 2 !=0){
            result = result + n.charAt(n.length() - 1);
        }
        System.out.print(result);
    }
}
