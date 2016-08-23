package test;

public class ReverseString {

	public static void main(String[] args)
	{
		String given = "TESTLEAF";
		for(int i=(given.length()-1);i>=0;i--)
		{
			System.out.print(given.charAt(i));
		}
	}
}
 