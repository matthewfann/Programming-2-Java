package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ForLoopExamples {

	public static void main(String[] args) 
	{
	
		int[] array = new int[] {8,2,9,4,5};
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Collections.addAll(arrayList,8,2,9,4,5);
		
		
		//iteration over a primitive array
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		//iteration over an arraylist
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		Collections.addAll(set,8,2,9,4,5);		
		for(Integer e : set)
		{			
			System.out.println(e);
		}
		
		
	}

}
