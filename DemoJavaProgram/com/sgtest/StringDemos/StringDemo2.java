package com.sgtest.StringDemos;

public class StringDemo2 {
    public static void main(String[] args) {
        replace();
    }
    static void replace()
    {
        String str ="Bangalore and Mysore";
        String s[]=str.split(" ");
        String str1=" ";
            for(int i=s.length-1;i>=0;i--)
            {
                str1=str1+s[i];
                if(i>0)
                {
                    str1=str1+" ";
                }
            }
          int count=s.length;
            System.out.println(str1);
            System.out.println("Number of Words:"+count);
    }
}
