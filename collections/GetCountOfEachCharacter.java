package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetCountOfEachCharacter {

	public static void main(String[] args) {

		// Lets write Psuedocode first
		// Goal ?? Count of every character in a String
		
		String companyName = "Cognizant Coimbatore";
		
		// Create a Map in the same order
		Map<Character,Integer> charMap = new LinkedHashMap<>();
		
		// Convert to characters
		char[] compChar = companyName.toCharArray();
		
		// Loop through each character
		for (char c : compChar) {		
		
			// check if the character is there in the map?
			if(charMap.containsKey(c)){
			
				// if yes, add the count by 1
				charMap.put(c, charMap.get(c)+1);
			} else {
			// if no, just create new entry and make it as 1
				charMap.put(c, 1);
			}
		}
		
		System.out.println(charMap);
	}
		
}




