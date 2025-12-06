package Selenium;

public class Reverse {

	public static void main(String[] args) 
	{
		int no=412;
		int rev=0,r;
		while(no!=0)
		{
			r=no%10;
			no=no/10;
			rev=rev*10+r;
		}
		System.out.println(rev);

	}

}
