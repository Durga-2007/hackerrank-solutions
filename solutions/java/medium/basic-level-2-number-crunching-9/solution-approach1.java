// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-crunching/challenges/basic-level-2-number-crunching-9/problem?isFullScreen=true
// Problem     Basic_Level_2_Number_Crunching_9
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-11, 11:10 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int base = sc.nextInt();
        
        int result = 0;
        int power = 1;
        
        while(number > 0){
            int digit = number % 10;
            result = result + digit * power;
            power = power * base;
            number = number / 10;
        }
        System.out.print(result);
    }
}
