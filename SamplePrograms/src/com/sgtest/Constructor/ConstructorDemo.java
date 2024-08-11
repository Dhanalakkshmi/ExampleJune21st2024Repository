package com.sgtest.Constructor;
class Newspaper
{
    String name;
    String lang;
    int price;
    Newspaper(String name,String lang,int price)
    {
        this.name=name;
        this.lang=lang;
        this.price=price;
        System.out.println("Newspaper Name:"+name);
        System.out.println("Language:"+lang);
        System.out.println("Price:"+price);
        System.out.println();
    }
}
class Magazine
{
    String mname;
    String type;
    int price;
    Magazine(String mname,String type,int price)
    {
        this.mname=mname;
        this.type=type;
        this.price=price;
        System.out.println("Newspaper Name:"+mname);
        System.out.println("Language:"+type);
        System.out.println("Price:"+price);
        System.out.println();
    }
}
class Comics
{
    String type;
    String aval;
    int price;
    Comics(String type,String aval,int price)
    {
        this.type=type;
        this.aval=aval;
        this.price=price;
        System.out.println("Comics Type:"+type);
        System.out.println("Available on:"+aval);
        System.out.println("Price:"+price);
        System.out.println();
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Newspaper n1=new Newspaper("Thinamalar","Tamil",25);
        Magazine m1=new Magazine("Vikatan","Entertainment",50);
        Comics c1=new Comics("For Children","Friday",90);
    }
}
