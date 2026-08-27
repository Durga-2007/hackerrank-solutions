// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-1-arrays-17/problem?isFullScreen=true
// Problem     Basic_Level_1_Arrays_17
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-27, 05:43 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] arr3 = new int[n3];

        // Input arr1
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input arr2
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Input arr3
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n1 && !found; i++) {
            for (int j = 0; j < n2 && !found; j++) {
                for (int k = 0; k < n3; k++) {

                    if (arr1[i] + arr2[j] + arr3[k] == x) {

                        System.out.println(
                            arr1[i] + " " + arr2[j] + " " + arr3[k]
                        );

                        found = true;
                        break;
                    }
                }
            }
        }

        if (!found) {
            System.out.println("No such triplets");
        }
    }
}
