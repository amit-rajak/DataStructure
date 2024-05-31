package com.datastructure.wipro;


public class weekCal {
    // You can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


        public String solution(String S, int K) {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int startIndex = getIndex(S, days);
        int endIndex = (startIndex + K) % 7;
        return days[(endIndex + 7) % 7]; // Corrected to handle negative indices
    }

    private int getIndex(String day, String[] days) {
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(day)) {
                return i;
            }
        }
        return -1; // Handle invalid input
    }

    public static void main(String[] args) {
        weekCal solution = new weekCal();
        System.out.println(solution.solution("Wed", 2));  // Output: "Fri"
        System.out.println(solution.solution("Sat", 23)); // Output: "Mon"
    }
}