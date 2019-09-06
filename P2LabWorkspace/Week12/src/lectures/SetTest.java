package lectures;

import java.util.Collections;
import java.util.HashSet;

public class SetTest {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println(set.add(5));
		System.out.println(set.add(3));
		System.out.println(set.add(6));
		System.out.println(set.add(2));
		System.out.println(set.add(5));
		System.out.println(set.remove(2));
		System.out.println(set.remove(3));
		System.out.println(set.remove(2));
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		Collections.addAll(set2,8,2,9,4,5);
		for(Integer e : set2)
		{
		System.out.println(e);
		}
	}
}
