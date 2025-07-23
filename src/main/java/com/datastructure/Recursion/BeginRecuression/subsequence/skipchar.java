package com.datastructure.Recursion.BeginRecuression.subsequence;

public class skipchar {

    public static void main(String[] args) {

        String str ="abcdefhijklm";

        skip("",str);
        System.out.println(skip2(new StringBuilder(),str,0));

    }

    private static void skip(String p, String up) {

        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch=='a')
        {
            skip(p,up.substring(1));
        }
        else{

            skip(p+ch,up.substring(1));
        }




    }

    private static StringBuilder skip2(StringBuilder result, String up,int index){

        if(index==up.length())
        {
            return result;
        }
         char ch = up.charAt(index);
        if(ch!='a'){
            result.append(ch);
        }
        return skip2(result, up, index+1);
    }

}
