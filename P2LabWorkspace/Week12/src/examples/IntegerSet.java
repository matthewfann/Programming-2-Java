package examples;

import java.util.HashSet;
public class IntegerSet {
	public static void main(String[] args) {
		HashSet<Integer> a = new HashSet<Integer>();		
		a.add(7);
		a.add(1);
		a.add(5);
		a.add(5);
		for(Integer i : a){
			System.out.println(i);
		}
	}
}
