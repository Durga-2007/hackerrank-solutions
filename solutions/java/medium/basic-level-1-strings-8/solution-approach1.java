// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-strings/challenges/basic-level-1-strings-8/problem?isFullScreen=true
// Problem     Basic_level_1_Strings_8
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-26, 03:58 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxCount =0;
        char ch = '\0';
        for(int i=0;i<s.length();i++){
            int count =0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;   
                }
            }
            if(count>maxCount){
                maxCount = count;
                ch = s.charAt(i);
            }
        }
        System.out.print(ch+":"+maxCount);
    }
}
