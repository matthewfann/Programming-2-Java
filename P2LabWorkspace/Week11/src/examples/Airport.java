package examples;

import java.util.Collections;
import java.util.PriorityQueue;

public class Airport {


	static public void print(PriorityQueue<Passenger> passengers){
		for(Passenger p : passengers)
		{
			System.out.println(p);	
		}
		System.out.println();
	}

	public static void main(String[] args) {
		PriorityQueue<Passenger> passengers = new PriorityQueue<Passenger>();


		passengers.add(new Passenger("Ken",RewardsClub.BRONZE));
		passengers.add(new Passenger("Frank",RewardsClub.BRONZE));
		passengers.add(new Passenger("Alice",RewardsClub.SILVER));
		passengers.add(new Passenger("Bob",RewardsClub.GOLD));
		passengers.add(new Passenger("Adam",RewardsClub.GOLD));
		passengers.add(new Passenger("Carl",RewardsClub.GOLD));
		passengers.add(new Passenger("Bill",RewardsClub.SILVER));

		print(passengers);
	}

}
