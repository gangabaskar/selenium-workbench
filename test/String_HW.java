package test;

public class String_HW{
	public static void main(String[] args)
	{
	String[] split= new String[]{};
	//Method 1 of 1
	split = "Cognizant".split("n");
	int length = split.length;
	System.out.println("****Result of Method 1 of 1*****");
	System.out.println("No.of.time n is repeated is :" + (length-1));
	
	//@Method 2 of 1
	int i =0 ;
	for (String item : split)
	{
		System.out.println(item);
		i++;
	}
	System.out.println("***Result of Method 2 of 1****");
	System.out.println(i-1);
	
	//@Method 2
	System.out.println("****Result of Method 2****");
	String obj1 =  "Cognizant";
	int k=0;
	char[]  objchar = new char[]{};
	objchar = obj1.toCharArray();
	System.out.println(objchar);
	for(int j=0;j<objchar.length;j++)
	{
		if(objchar[j]=='n'){
			k++;
		
		}
	}
	System.out.println("No. of times n is repeated in given string:"+" " + k);
	
	//@Method 3
	System.out.println("****Result of Method 3****");
	int firstindex = "Cognizant".indexOf("n");
	int lastindex = "Cognizant".lastIndexOf("n");
	System.out.println("First occurence" + firstindex);
	System.out.println("First occurence" + lastindex);
	int counter =1;
	if(firstindex!=lastindex)
	{
		counter++;
	}else{
		System.out.println("Only one occurence of specified character in the given string");
	}
	System.out.println("No.of occurence of specified character in the given string" + counter);
 
	//@Method 4
	System.out.println("****Result of Method 4****");
	int givenStringLength = "cognizant".length();
	int replacedStringLength = obj1.replaceAll("[n]", "").length();
	System.out.println("Replaced string length"+ givenStringLength);
	System.out.println("Replaced string length"+ replacedStringLength);
	System.out.println("No of n repeated is:"+" " + (givenStringLength-replacedStringLength));

	}
	
	
}


