package com.sgtest.StringDemos;

public class StringDemo1 {
    public static void main(String[] args) {
        getcharactercount("Ravi");
        getcharactercount("Aruna");

    }
    static void getcharactercount(String s)
    {
        int count=0;
        for(char s1:s.toCharArray())
        {
            count++;
        }
        System.out.println("Number of characters:"+count);
    }
}
