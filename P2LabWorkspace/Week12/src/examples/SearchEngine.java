package examples;

public class SearchEngine {
	private PersonDatabase pdb;
	
	public SearchEngine(PersonDatabase pdb)
	{
		this.pdb = pdb;
	}

	public PersonDatabase byName(String term) 
	{
		PersonDatabase results = new PersonDatabase();
		for(Person aPerson : this.pdb.getPersons())
		{
			if(aPerson.getName().contains(term))
			{
				results.addPerson(aPerson);
			}
		}
	return results;	
	}

}
