package examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import lectures.ContactDetail;


public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String,ContactDetail> contacts = new HashMap<String,ContactDetail>();

		contacts.put("Ken Johnson",new ContactDetail());
		contacts.put("Mona Lisa",new ContactDetail());
		contacts.put("Scream Guy",new ContactDetail());
		ContactDetail mona = contacts.get("Mona Lisa");
		
		
		Collection<ContactDetail> dets = contacts.values();
		
		
		
		
		
		
	}
}
