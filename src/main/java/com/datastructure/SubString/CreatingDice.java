package com.datastructure.SubString;

import java.util.ArrayList;
import java.util.List;

public class CreatingDice {
    public static void main(String[] args) {
        Dice("",4);

        System.out.println("Using  Array List");
        List<String> list= new ArrayList<>();
        list=DiceList("",4,new ArrayList<>());
    }

    public static void Dice(String p,int target)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++)
        {
            Dice(p+i,target-i);
        }
    }

    public static List<String> DiceList(String p, int target , ArrayList<String> list)
    {
        if(target==0)
        {
           list.add(p);
        }
        for(int i=1;i<=6 && i<=target;i++)
        {
            Dice(p+i,target-i);
        }
        return list;
    }
}
