// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-strings/challenges/basic-level-1-strings-14/problem?isFullScreen=true
// Problem     Basic_level_1_Strings_14
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-05, 08:50 p.m.
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
        String[] word = s.split(" ");
        for(int i=word.length - 1;i>=0;i--){
            System.out.print(word[i]);
            if(i!=0){
                System.out.print(" ");
            }
        }
    }
}
