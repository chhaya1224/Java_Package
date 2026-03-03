import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 5, 3};

        // Remove duplicates using streams
        int[] distinctNumbers = Arrays.stream(numbers)
                                      .distinct()   // remove duplicates
                                      .toArray();   // convert back to array

        // Print result
        System.out.println(Arrays.toString(distinctNumbers));
    }
}
================================================================================================================
  package java_package;

import java.util.HashSet;

public class duplicatenumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find duplicates number in array using hashSet
		
		int arr []= {0,0,1,1,91,2,2,3,4,5,6,7,8,9};
		HashSet<Integer>set=new HashSet<>();
		HashSet<Integer>duplicates= new HashSet<>();
		for(int num : arr)
		{
			if(! set.add(num))
			{
		      duplicates.add(num);
			}
		}
		System.out.println("duplicate number in array is " + duplicates);

	}

}
