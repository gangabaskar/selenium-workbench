package test;

import java.util.Arrays;

public class LearningArrays {
	public static void main(String[] args)
	{
		//Its a 5 sized array supports only String
		String[] family = new String[5];
		family[0] = "baskar";
		family[1] ="uma";
		family[2] = "thangam";
		family[3] = "";
		family[4] = "subu";
	
	/*	
		for (int i =0;i<=(family.length)-1;i++)
		{
			System.out.println(family[i]);
		}*/
		
		Arrays.sort(family);
		for (int i =0;i<=(family.length)-1;i++)
		{
			System.out.println(family[i]);
		}
		
		Arrays.fill(family, "ganga");
		for (int i =0;i<=(family.length)-1;i++)
		{
			System.out.println(family[i]);
		}
		
		
	}

}
