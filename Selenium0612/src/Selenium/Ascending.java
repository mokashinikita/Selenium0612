package Selenium;

public class Ascending {

	public static void main(String[] args) 
	{
		int a[]= {2,4,5,6,7,1,9,4};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	

	}

}
