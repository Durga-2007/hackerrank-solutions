// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
// Problem     Java Output Formatting
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-07, 07:00 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {

            String s = sc.next();
            int n = sc.nextInt();

            System.out.printf("%-15s%03d%n", s, n);
        }

        System.out.println("================================");
    }
}
