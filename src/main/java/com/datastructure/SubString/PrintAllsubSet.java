package com.datastructure.SubString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllsubSet {
    public static void main(String[] args) {
     String up="abc";
     SubString("",up);

     System.out.println("NEW METHOD For SubStringArrayList");
     System.out.println((SubStringArrayList("",up,new ArrayList<String>())));

        System.out.println("Don't Pass ArrayList In Argument");
        System.out.println((SubStringArrayListM2("",up)));

    }

    public static void SubString (String p,String up)
    {
        if(!p.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(!p.isEmpty())
        {
            SubString(p+ch,up.substring(1));
            SubString(p,up.substring(1));
        }

    }


    //use Array List to return Method One;

    public static ArrayList<String> SubStringArrayList (String p, String up,ArrayList<String> list)
    {
        if(up.isEmpty())
        {
            //System.out.println(p);
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        //Add String in UnProcessed
        SubStringArrayList(p+ch,up.substring(1),list);
        //Return Processed/
        SubStringArrayList(p,up.substring(1),list);
        return list;
    }

    //dont Pass in Argument
    public static ArrayList<String> SubStringArrayListM2 (String p, String up)
    {
        ArrayList<String> list= new ArrayList<>();
        if(up.isEmpty())
        {
            //System.out.println(p);
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
     ArrayList<String> left=   SubStringArrayListM2(p+ch,up.substring(1));
        ArrayList<String> right=  SubStringArrayListM2(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
