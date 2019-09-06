package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsFunctionality {

	public static void main(String[] args) {


		ArrayList<Integer> list = 
				new ArrayList<Integer>(Arrays.asList(new Integer[]{9,2,83,45,8,15,27,2,44,1,36,90,100,2,5,2}));
		
		System.out.println(list);
		System.out.println("Sorting list");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Binary search for element 90 yields: "+Collections.binarySearch(list, 90));


		System.out.println("Shuffling list");
		Collections.shuffle(list);
		System.out.println(list);
		
		
		System.out.println("max element is: "+Collections.max(list));
		System.out.println("min element is: "+Collections.min(list));

		
		System.out.println("Frequency of element 2 in the list is: "+Collections.frequency(list,2));
		



	}

}
