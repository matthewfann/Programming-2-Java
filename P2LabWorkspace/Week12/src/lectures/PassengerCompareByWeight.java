package lectures;

import java.util.Comparator;
public class PassengerCompareByWeight implements Comparator<Passenger>{

	@Override
	public int compare(Passenger o1, Passenger o2) {
		return o1.luggageWeight.compareTo(o2.luggageWeight);
	}
}