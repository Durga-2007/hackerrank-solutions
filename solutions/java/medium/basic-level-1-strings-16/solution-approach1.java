// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-strings/challenges/basic-level-1-strings-16/problem?isFullScreen=true
// Problem     Basic_level_1_Strings_16
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-29, 09:28 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        for(int i=0;i<str.length();i+=2){
            char ch = str.charAt(i);
            int count = str.charAt(i+1) - '0';
            for(int j=0;j<count;j++){
                System.out.print(ch);
            }
        }
        
        
    }
}
