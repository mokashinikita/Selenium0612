package Selenium;

public class ArrayCommon {

	public static void main(String[] args) 
	{
		int a[]= {1,2,4,5,6};
		int b[]= {1,7,8,9,4};
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
			}
		}
	}
		
		
	}

}
