package test;

public class Palindrome {
	public static void main(String[] args)
	{
		int n = 123 ;
		int r;
		int s = 0;
		int temp = n; // assign vaue of n to temp for comparison purpose
		while(n>0)
		{
			r = n % 10;
			n = n / 10;
			s = (s*10) + r;
			
		}
		if ( temp == s)
		{
			System.out.print("Given number"+" " + temp + " " + "is a Palindrome");
		}else{
			System.out.print("Given number"+" " + temp + " " + "is not a Palindrome");
		}
	}

}
