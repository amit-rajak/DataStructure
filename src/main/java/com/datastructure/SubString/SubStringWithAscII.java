package com.datastructure.SubString;

import java.util.ArrayList;

public class SubStringWithAscII {
    public static void main(String[] args) {
        String up="abc";
        System.out.println((SubStringArrayListASCII("",up,new ArrayList<String>())));

    }

    public static ArrayList<String> SubStringArrayListASCII (String p, String up, ArrayList<String> list)
    {
        if(up.isEmpty())
        {
            //System.out.println(p);
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        //Add String in UnProcessed
        SubStringArrayListASCII(p+ch,up.substring(1),list);
        //Return Processed/
        SubStringArrayListASCII(p,up.substring(1),list);
        SubStringArrayListASCII(p,up.substring(1),list);
        SubStringArrayListASCII(p+(ch+0),up.substring(1),list);

        return list;
    }
}
