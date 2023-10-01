package com.datastructure.SubString;

public class Permaution {

    public static void main(String[] args) {
     PermautionPrint("","abcd");
    }
    public static void PermautionPrint(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);

        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());

            PermautionPrint(f+ch+s,up.substring(1));
        }
    }
}
