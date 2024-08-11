package com.sgtest.Constructor;
class University
{
    String universityname;
    String uniloc;
    int pincode;
    int noofcollege;
    University(String uname,String uniloc,int pin,int noofcoll )
    {
        this.universityname=uname;
        this.uniloc=uniloc;
        this.pincode=pin;
        this.noofcollege=noofcoll;
        System.out.println("Name of University:"+universityname);
        System.out.println("Location of University:"+uniloc);
        System.out.println("Pincode:"+pincode);
        System.out.println("Number of college:"+noofcollege);
        System.out.println();
    }
}
class College
{
    String collegename;
    String collgloc;
    int noofdept;
    College(String cname,String collgloc,int noofDept)
    {
        this.collegename=cname;
        this.collgloc=collgloc;
        this.noofdept=noofDept;
        System.out.println("Name of College:"+collegename);
        System.out.println("Location of College:"+collgloc);
        System.out.println("Number of Department :"+noofdept);
        System.out.println();

    }
}
class Student
{
    String studentname;
    String deptname;
    int sid;
    int pno;
    Student(String sname,String dept,int id,int pno)
    {
        this.studentname=sname;
        this.deptname=dept;
        this.sid=id;
        this.pno=pno;
        System.out.println("Student Name:"+studentname);
        System.out.println("Department Name:"+deptname);
        System.out.println("Student ID:"+sid);
        System.out.println("Contact Number:"+pno);
        System.out.println();
    }
}

public class ConstructorDemo1 {
    public static void main(String[] args) {
        University obj1=new University("Anna Unviversity","Chennai",634567,35);
        College c1=new College("Sona","Salem",7);
        Student s1=new Student("Aravind","Mech",5,987563471);


    }
}

