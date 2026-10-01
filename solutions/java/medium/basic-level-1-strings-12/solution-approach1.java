// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-strings/challenges/basic-level-1-strings-12/problem?isFullScreen=true
// Problem     Basic_level_1_Strings_12
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-01, 06:58 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.length() == str2.length() &&
            (str1 + str1).contains(str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
