// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-0-arrays-29/problem?isFullScreen=true
// Problem     Basic_Level_0_Arrays_29
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-22, 06:38 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int odd = 0;
        int even = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.print(odd+" ");
        System.out.print(even);
    }
}
