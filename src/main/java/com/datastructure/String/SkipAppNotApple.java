package com.datastructure.String;

public class SkipAppNotApple {
        public static void main(String[] args) {
            System.out.println(skipWord1("bacappleapplecadapp"));
        }

        public static String skipWord1(String OriginalString)
        {
            if(OriginalString.isEmpty())
            {
                return "";
            }


            if(OriginalString.startsWith("app") && !OriginalString.startsWith("apple"))
            {
                return skipWord1(OriginalString.substring(3));
            }
            else {
                return OriginalString.charAt(0)+skipWord1(OriginalString.substring(1));
            }
        }
    }