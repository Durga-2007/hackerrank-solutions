// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-strings/challenges/basic-level-1-strings-17/problem?isFullScreen=true
// Problem     Basic_level_1_Strings_17
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-05, 08:56 p.m.
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
        for(int i = 0; i < word.length; i++) {
            if(word[i].length() % 2 != 0) {
                for(int j = word[i].length() - 1; j >= 0; j--) {
                    System.out.print(word[i].charAt(j));
                }
            } else {
                System.out.print(word[i]);
            }
            if(i != word.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
