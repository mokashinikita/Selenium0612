package Selenium;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		if(str.length()==0)
		{
			System.out.println("Enter valid");
		}
		else
		{
			findsmalllarge(str);
		}
		
		
	}
	
	public static void findsmalllarge(String str) 
	{
		String large=" ",small=" ";
		String all[]=str.split(" ");
		
		for(int i=0;i<all.length;i++)
		{
			if(i==0)
			{
				large=small=all[i];
			}
			else if(all[i].length()<small.length())
			{
				small=all[i];
			}
			else if(all[i].length()>large.length())
			{
				large=all[i];
			}
		}
		
		System.out.println("large::"+large);
		System.out.println("small::"+small);
	
	}
	
	
}
