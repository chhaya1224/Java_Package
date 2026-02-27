package java_package;

import java.util.LinkedHashSet;

public class RemoveDuplicatesfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// input : programming
		// output =progamin
	String str="programming";
	LinkedHashSet<Character>set= new LinkedHashSet<>();
	for(char ch : str.toCharArray())
	{
		set.add(ch);
	}
	
    System.out.print("String after removing duplicates: ");

    for(char ch: set)
    {
    	System.out.print(ch);
    }

	}

}
