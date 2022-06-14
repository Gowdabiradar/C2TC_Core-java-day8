package com.acharya.day08;

public class Static_temp1
{         
	int rollno;
	String name;
	static String college="AIT";
    
	Static_temp1(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args)
	{
		Static_temp1 s1=new Static_temp1(111,"kiran");
		Static_temp1 s2=new Static_temp1(222,"vishwa");
		s1.display();
		s2.display();
	}

}
