// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-strings/challenges/basic-level-1-strings-19/problem?isFullScreen=true
// Problem     Basic_level_1_Strings_19
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-29, 09:46 a.m.
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
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'
                    && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                System.out.print(ch);
            }
        }
    }
}
