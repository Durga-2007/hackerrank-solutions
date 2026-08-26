// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-1-arrays-7/problem?isFullScreen=true
// Problem     Basic_Level_1_Arrays_7
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-26, 11:42 a.m.
// ──────────────────────────────────────────────────

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long k = sc.nextLong();
        
        Arrays.sort(arr);
        long count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (long num = arr[i] + 1; num < arr[i + 1]; num++) {
                count++;

                if (count == k) {
                    System.out.print(num);
                    return;
                }
            }
        }
        System.out.print(-1);
    }
}
