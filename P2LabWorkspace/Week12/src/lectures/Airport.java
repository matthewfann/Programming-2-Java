package lectures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Airport {


	static public void print(ArrayList<Passenger> passengers){
		for(Passenger p : passengers)
		{
			System.out.println(p);	
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Passenger> passengers = new ArrayList<Passenger>();

		Collections.addAll(passengers, new Passenger("Ken",RewardsClub.BRONZE,121),
				new Passenger("Frank",RewardsClub.BRONZE,33),
				new Passenger("Alice",RewardsClub.SILVER,127),
				new Passenger("Bob",RewardsClub.GOLD,32),
				new Passenger("Carl",RewardsClub.GOLD,210),
				new Passenger("Bill",RewardsClub.SILVER,89));

		print(passengers);//pre-sort
		
		Collections.sort(passengers,Passenger.compareByName());
		print(passengers);//compared by name
		Collections.sort(passengers,Passenger.compareByWeight());		
		print(passengers);//compared by weight
		
		Collections.sort(passengers,Collections.reverseOrder(Passenger.compareByWeight()));		
		print(passengers);//compared by reverse order weight

	}

}
