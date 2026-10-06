// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
// Problem     Java Stdin and Stdout II
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-06, 07:18 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine(); // consume the leftover newline
        String s = sc.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
