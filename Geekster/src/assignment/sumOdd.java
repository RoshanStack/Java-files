package assignment;
class sumOdd
{
	public static void main(String args[])
	{
		int n=10,i=1,sum=0;
		while(i<=n)
		{
			if(i%2!=0)
			{
				System.out.println("Odd Numbers="+i);
				sum=i+sum;
			}
			i++;
		}
		System.out.println("Sum of Odd Numbers="+sum);
		
	}
	
}