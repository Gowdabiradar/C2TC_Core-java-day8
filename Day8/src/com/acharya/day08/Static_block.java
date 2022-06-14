package com.acharya.day08;

public class Static_block
{
     int rollno;
     String name;
     static String college="NGB";
     Static_block(int r,String n)
     {
    	 rollno=r;
    	  name=n;
     }
     static
     {
    	college="SINDHNUR";
     }
     void display()
     {
    	 System.out.println(rollno+" "+name+" "+college);
     }
	public static void main(String[] args)
	{
		Static_block s1=new Static_block(111,"NIRU");
		Static_block s2=new Static_block(222,"SHIVU");
		s1.display();
		s2.display();

	}

}
