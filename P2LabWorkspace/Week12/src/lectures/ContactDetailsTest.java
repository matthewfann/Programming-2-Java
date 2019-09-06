package lectures;

import java.util.HashMap;

public class ContactDetailsTest {
	public static void main(String[] args) {
		HashMap<String, ContactDetail> contacts = new HashMap<String, ContactDetail>();
		contacts.put("Ken Johnson", new ContactDetail());
		contacts.put("Mona Lisa", new ContactDetail());
		contacts.put("Scream Guy", new ContactDetail());
	}
}
