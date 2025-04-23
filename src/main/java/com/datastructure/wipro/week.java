package com.datastructure.wipro;

public class week {

    public static void main(String[] args) {
        String result=getFrequency("STR");
        System.out.println(result);
    }


    private static String getFrequency(String tmxRiskRequest) {
        String freq = null;
        boolean isRec = false;

        if (isRec) {
            switch (tmxRiskRequest) {
                case "WEEKLY":
                    freq = "WEEKLY";
                    break;
                case "MONTHLY":
                    freq = "MONTHLY";
                    break;
                case "BIWEEKLY":
                    freq = "BIWEEKLY";
                    break;
                case "TWOMONTHS":
                    freq = "TWOMONTHS";
                    break;
                case "TWOWEEKS":
                    freq = "TWOWEEKS";
                    break;
                case "THREEMONTHS":
                    freq = "THREEMONTHS";
                    break;
                case "SIXMONTHS":
                    freq = "SIXMONTHS";
                    break;
                case "YEARLY":
                    freq = "YEARLY";
                    break;
                default:
                    freq = null;
            }
        }

        return freq;
    }}
