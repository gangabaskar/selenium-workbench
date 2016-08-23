package test;

public class ReverseNumber {
	public static void main(String[] args)
	{
		int n = 123;
		int r;
		int s = 0;
		System.out.print("Given number is :" + " " + n
				);
		while(n>0)
		{
			r = n % 10;
			n = n / 10;
			s =(s*10)+r;
		}
		
		System.out.print("Reversed number is :" + " " + s);
	}

}
