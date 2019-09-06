package lectures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> line = new LinkedList<Integer>();
		line.add(1);
		line.add(9);
		line.add(13);
		line.remove();
		line.remove();

		Queue<Passenger> passengers = new LinkedList<Passenger>();
		// passengers arrive and form a queue

		passengers.add(new Passenger("Carl"));
		passengers.add(new Passenger("Darlene"));
		passengers.add(new Passenger("Bob"));
		passengers.add(new Passenger("Alice"));
		// gates open and passengers board the plane
		passengers.remove();
		passengers.remove();
	}
}