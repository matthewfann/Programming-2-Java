package lectures;

import java.util.Comparator;
public class PassengerCompareByName 
     implements Comparator<Passenger>{
	@Override
	public int compare(Passenger o1, Passenger o2) {
		return o1.name.compareTo(o2.name);
	}
}