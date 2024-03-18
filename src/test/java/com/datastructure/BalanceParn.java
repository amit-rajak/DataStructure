package com.datastructure;

import java.util.Stack;

public class BalanceParn {

    public static void main(String[] args) {

        String str= "{[()]{}{[()()]()}}{}";
        System.out.println(Check(str));
    }


    public  static boolean Check (String str)
    {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(IsOpening(c))
            {
                stack.push(c);  // [(
            }
            else
            {
                  if(stack.isEmpty())
                  {
                      return false;
                  }
                  else if(IsMatching(stack.peek(),c))
                  {
                      stack.pop();
                  }
                 /* else
                  {
                      stack.pop();
                  }*/

            }


        }


        return stack.isEmpty();
    }

    public static boolean IsOpening(char c)
    {
        if( c=='[' || c=='(' || c=='{')
        {
            return true;
        }

        return false;
    }

    public static boolean IsMatching(char opening,char closing)
    {
        if( (opening=='[' && closing==']')
                || (opening=='(' && closing==')')
                || (opening=='{' && closing=='}'))
        {
            return true;
        }

        return false;
    }

}
