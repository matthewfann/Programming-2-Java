package lectures;

import java.util.Comparator;

public class Passenger implements Comparable<Passenger> {
	public RewardsClub membership;
	public String name;
	public Integer luggageWeight;

	// --------------------------------------------------------------------------------
	public Passenger(String name, RewardsClub membership, Integer weight) {
		this.name = name;
		this.membership = membership;
		this.luggageWeight = weight;
	}

	// --------------------------------------------------------------------------------
	public String toString() {
		return name + ": " + membership + " luggage kilos: " + luggageWeight;
	}

	// --------------------------------------------------------------------------------
	@Override
	public int compareTo(Passenger o) {
		return this.membership.compareTo(o.membership);
	}

	static public Comparator<Passenger> compareByName() {
		return new Comparator<Passenger>() {
			@Override
			public int compare(Passenger o1, Passenger o2) {
				return o1.name.compareTo(o2.name);
			}
		};
	}

	static public Comparator<Passenger> compareByWeight() {
		return new Comparator<Passenger>() {
			@Override
			public int compare(Passenger o1, Passenger o2) {
				return o1.luggageWeight.compareTo(o2.luggageWeight);
			}
		};
	}

}