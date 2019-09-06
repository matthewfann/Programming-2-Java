package examples;

public class SearchPersonApp {

	public static void main(String[] args) {
		Person p1 = new Person("ABC",1900,"Bob,Al,Alice,Jay");
		Person p2 = new Person("ABCXYZ",1900,"");
		Person p3 = new Person("DEFG",1900,"");
		Person p4 = new Person("DEFG",1900,"");
	
	
		
		PersonDatabase pdb = new PersonDatabase();
		pdb.addPersons(p1,p2,p3,p4);
		System.out.println(pdb);
		
		
		PersonDatabase resultsDB = pdb.getSearchEngine().byName("ABC");
		System.out.println(resultsDB);
		
		resultsDB = resultsDB.getSearchEngine().byName("XYZ");
		System.out.println(resultsDB);

		
		
		
		
	}

}
