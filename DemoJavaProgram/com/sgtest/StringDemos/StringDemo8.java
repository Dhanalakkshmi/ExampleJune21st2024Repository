package com.sgtest.StringDemos;

public class StringDemo8 {
    public static void main(String[] args) {
        getreverse("Dhanu");
        getreverse1("Aruna");
    }
    static void getreverse(String s)
    {
        char c[]=s.toCharArray();
        for(int i=c.length-1;i>=0;i--)
        {
            System.out.print(c[i]);
        }
        System.out.println();
    }
    static void getreverse1(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

}
