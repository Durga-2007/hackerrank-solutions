// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-strings/challenges/basic-level-0-strings-12/problem?isFullScreen=true
// Problem     Basic_level_0_Strings_12
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-23, 06:21 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(!Character.isLetter(ch) && !Character.isDigit(ch)){
                count++;
            }
        }
        System.out.print(count);
    }
}
