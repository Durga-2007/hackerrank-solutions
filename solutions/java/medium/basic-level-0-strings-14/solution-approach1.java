// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-strings/challenges/basic-level-0-strings-14/problem?isFullScreen=true
// Problem     Basic_level_0_Strings_14
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-23, 06:43 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        for(int i=0;i<str.length();i++){
            char ch1 = str.charAt(i);
            if(ch == ch1){
                System.out.print("Present");
                return;
            }
            
        }
        System.out.print("Not Present");
    }
}
