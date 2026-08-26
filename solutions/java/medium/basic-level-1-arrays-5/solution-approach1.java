// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-arrays/challenges/basic-level-1-arrays-5/problem?isFullScreen=true
// Problem     Basic_Level_1_Arrays_5
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-26, 10:58 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num =1;
        while(true){
            boolean found = false;
            for(int i=0;i<n;i++){
                if(arr[i]==num){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.print(num);
                break;
            }
            num++;
        }
        
    }
}
