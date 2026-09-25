// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-strings/challenges/basic-level-1-strings-5/problem?isFullScreen=true
// Problem     Basic_level_1_Strings_5
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-25, 06:08 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        int count =1;
        for(int i=0;i<str.length();i++){
            if(Character.isWhitespace(str.charAt(i))){
                count++;
            }
        }
        System.out.print(count);
    }
}
