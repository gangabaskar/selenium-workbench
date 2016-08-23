package test;

public class PrintDuplicateCharacterInString {
	public static void main(String[] args)
	{
	String given = new String("Java");
	String cloneS= given.toString();
	int j = 0;
	int length = given.length();
	if(given.isEmpty())
	{
		System.out.println("Empty String. Hence cannot proceed further to find duplicate");
	}
	else
	{
		for(int i=0;i<=length-1;i++)
		{
			/*if(i!=0)
			{*/
				System.out.println("Value of i"+" " + i);
				/*j=i+1;
				System.out.println("Value of j"+" " + j);*/
				if(given.charAt(i)==cloneS.charAt(i))
				{
					System.out.println(given.charAt(i));
				}
			//}
				
		}
			
			
	}
	
	
	
	}

}

