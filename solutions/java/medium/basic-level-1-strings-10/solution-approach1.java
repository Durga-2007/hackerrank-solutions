// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-strings/challenges/basic-level-1-strings-10/problem?isFullScreen=true
// Problem     Basic_level_1_Strings_10
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-27, 11:04 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String printed = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (ch == Character.toLowerCase(s.charAt(j))) {
                    count++;
                }
            }

            if (ch != ' ' && count > 1 && printed.indexOf(ch) == -1) {
                System.out.print(ch + " ");
                printed += ch;
            }
        }
    }
}
