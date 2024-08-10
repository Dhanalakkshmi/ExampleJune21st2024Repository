package com.sgtest.StringDemos;

public class StringDemo3 {
    public static void main(String[] args) {
        getPalindrome("frog");
    }
    static void getPalindrome(String s)
    {
        String str=s.toLowerCase();
        StringBuffer s1=new StringBuffer(str);
        s1.reverse();
        if(s.equals(s1))
        {
            System.out.println("It is Palindrome");
        }else {
            System.out.println("It is not a Palindrome");
        }
    }
}
