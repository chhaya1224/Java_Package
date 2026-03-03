package java_package;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap → stores frequency, but does NOT preserve order
		//LinkedHashMap → stores frequency AND preserves insertion order
		/*Approach (Logic)
		Traverse the string
		Store each character and its count in a LinkedHashMap
		Traverse the map in insertion order
		The first character with count = 1 is the answer */
		String str= "Swsis";
		String str1=str.toLowerCase();
		LinkedHashMap<Character,Integer>map = new LinkedHashMap<>();
		  // Step 1: Count frequency
		for(char ch: str1.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		//
		for(Map.Entry<Character,Integer>entry : map.entrySet())
		{
			if(entry.getValue()== 1)
			{
				System.out.println(" " + entry.getKey());
				break;
			}
		}

		

	}

}
