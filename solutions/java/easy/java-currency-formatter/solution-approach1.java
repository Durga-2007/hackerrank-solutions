// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
// Problem     Java Currency Formatter
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-14, 06:42 p.m.
// ──────────────────────────────────────────────────

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        

Locale usLocale = Locale.US;
Locale indiaLocale = new Locale("en", "IN");
Locale chinaLocale = Locale.CHINA;
Locale franceLocale = Locale.FRANCE;

String us = NumberFormat.getCurrencyInstance(usLocale).format(payment);
String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);
String china = NumberFormat.getCurrencyInstance(chinaLocale).format(payment);
String france = NumberFormat.getCurrencyInstance(franceLocale).format(payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
