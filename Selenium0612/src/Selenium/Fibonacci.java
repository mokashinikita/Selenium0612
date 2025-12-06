package Selenium;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int prev=0,next=1,sum;
		System.out.print(prev+" "+next+" ");
		
		for(int i=2;i<=10;i++)
		{
			sum=prev+next;
			System.out.print(sum+" ");
			prev=next;
			next=sum;
		}
		
		
	}

}
