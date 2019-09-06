package examples;

import java.util.HashMap;
import java.util.Map.Entry;

public class ContentDirectory {



	public static void main(String[] args) {

		HashMap<String,Contact> contacts;
		contacts = new HashMap<String,Contact>();
		
		Contact contact1 = new Contact("Ken Johnson","Auckland","123 456 7890");		
		Contact contact2 = new Contact("Bob Barker","Hollywood","290 555 3420");		
		Contact contact3 = new Contact("Mona Lisa","Paris","912 831 2123");		
		Contact contact4 = new Contact("Sue Perman","Metropolis","100 987 3129");
		
		
		contacts.put(contact1.getName(),contact1);
		contacts.put(contact2.getName(),contact2);
		contacts.put(contact3.getName(),contact3);
		contacts.put(contact4.getName(),contact4);
		
		for(Entry<String, Contact> e : contacts.entrySet()){
			System.out.println(e.getKey()+" --> "+e.getValue());
			
		}


	}

}
