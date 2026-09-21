// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-strings/challenges/basic-level-0-strings-6/problem?isFullScreen=true
// Problem     Basic_level_0_Strings_6
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-21, 06:41 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        for(int i=0;i<str1.length();i++){
            
                if(str1.charAt(i) != str2.charAt(i)){
                    System.out.print("Not the same");
                    return;
                }
        }
        System.out.print("Same");
    }
}
