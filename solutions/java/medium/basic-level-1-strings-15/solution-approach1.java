// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-strings/challenges/basic-level-1-strings-15/problem?isFullScreen=true
// Problem     Basic_level_1_Strings_15
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-28, 08:31 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int count = 1;

        for (int i = 0; i < s.length(); i++) {

            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(s.charAt(i) + "" + count);
                count = 1;
            }
        }
    }
}
