package com.sgtest.StringDemos;

public class StringDemo4 {
    public static void main(String[] args) {
        getPattern();
    }
    static void getPattern()
    {
        String s="PROGRAM";
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
