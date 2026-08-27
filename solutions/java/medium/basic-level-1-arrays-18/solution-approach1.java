// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-1-arrays-18/problem?isFullScreen=true
// Problem     Basic_Level_1_Arrays_18
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-27, 05:59 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        // Input arr1
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input arr2
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < n1; i++){
    
    boolean found = false;
    
    for(int j = 0; j < n2; j++){
        if(arr1[i] == arr2[j]){
            found = true;
            break;
        }
    }
    
    if(!found){
        System.out.print(arr1[i] + " ");
    }
}
    }
}
