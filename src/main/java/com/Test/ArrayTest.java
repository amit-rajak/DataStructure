package com.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//create imuatable thred safe singlton class;
public class ArrayTest {

    public static void main(String[] args) {


        //



        List<Integer> list= Arrays.asList(10,15,8,49,25,98,32);

        list.stream()
                .map(a-> a+ "")
                .filter(a->a.startsWith("1"))
                .forEach(System.out::println);


        System.out.println("New Print");




        char check= '1';
        int arr[]={13,17,18,10,20,20};

        for(int i=0;i<arr.length;i++)
        {
            String str=  String.valueOf(arr[i]);

            char index=str.charAt(0);

            if(str.charAt(0)==check)
            {
                System.out.println(arr[i]);
            }
        }
    }



    public static  String convert(int data)
    {
        String str= String.valueOf(data);
        return str;
    }

}


