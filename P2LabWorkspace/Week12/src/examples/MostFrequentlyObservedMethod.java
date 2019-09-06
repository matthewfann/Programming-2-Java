package examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class MostFrequentlyObservedMethod {
	//------------------------------------------------------------------------
	public static Integer mostFrequentlyObserved(ArrayList<Integer> list) throws Exception{
		if(list.isEmpty()) throw new Exception("List is empty!");
		HashMap<Integer,Integer> obs = new HashMap<Integer,Integer>(); 
		for(Integer i : list)
		{
			if(!obs.containsKey(i))
				obs.put(i, 1);
			else
				obs.put(i,obs.get(i)+1);
		}
		Integer maxKey = list.get(0);		
		Integer maxObs=obs.get(maxKey);

		for(Entry<Integer,Integer> e : obs.entrySet()){
			if(e.getValue() > maxObs){
				maxObs=e.getValue();
				maxKey=e.getKey();
			}
		}
		return maxKey;
	}
	//------------------------------------------------------------------------
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>
		(Arrays.asList(new Integer[]{8,9,7,7,8,3,4,4,4,4,4,8}));

		try {
			System.out.println(list);
			System.out.println("The most frequently observed element in the list is: "+ mostFrequentlyObserved(list));
		} catch (Exception e) 
		{			
			e.printStackTrace();
		}
	}
}