package Selenium;

public class Palindrome {

	public static void main(String[] args)
	{
		int no=145,rev=0,r;
		int temp=no;
		while(no!=0)
		{
			r=no%10;
			no=no/10;
			rev=rev*10+r;
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not");
		}
	}

}
