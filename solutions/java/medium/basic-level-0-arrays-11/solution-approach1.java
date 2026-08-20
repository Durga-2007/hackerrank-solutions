// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-11/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_11
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-20, 07:19 p.m.
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
        int val[] = new int[n];
        for(int i=0;i<n;i++){
            val[i] = sc.nextInt();
        }
        int v1 =0;
        int v2 = 0;
        for(int i=0;i<n;i++){
            if(val[i] == 0){
                v1++;
            }else{
                v2++;
            }
        }
        System.out.println("0:"+v1);
        System.out.print("1:"+v2);
    }
}
