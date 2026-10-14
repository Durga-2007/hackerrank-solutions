// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true
// Problem     Java Date and Time
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-10-14, 06:27 p.m.
// ──────────────────────────────────────────────────



class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
    c.set(year, month - 1, day);

    String[] days = {
        "SUNDAY", "MONDAY", "TUESDAY",
        "WEDNESDAY", "THURSDAY", "FRIDAY",
        "SATURDAY"
    };

    return days[c.get(Calendar.DAY_OF_WEEK) - 1];

    }

}

