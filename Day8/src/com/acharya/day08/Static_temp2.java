package com.acharya.day08;

public class Static_temp2
{         
	int rollno;
	String name;
	static String college="AIT";
    
	Static_temp2(int r,String n)
	{
		rollno=r;
		name=n;
	}
	static void change()
	{
		college="acharya";
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args)
	{
		Static_temp2 s1=new Static_temp2(111,"ABDUL");
		Static_temp2 s2=new Static_temp2(222,"VISHWA");
		change();
		s1.display();
		s2.display();
	}

}

