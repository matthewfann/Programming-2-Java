package examples;

import java.util.ArrayList;

public class PersonDatabase {

	private ArrayList<Person> persons;
	private SearchEngine searchEngine;
	
	
	public ArrayList<Person> getPersons()
	{
		return this.persons;
	}
	//-------------------------------------------------
	public String toString()
	{
		String out = "";
		out += "This database has "+this.persons.size()+" persons.\n";
		for(Person p : persons)
		{
			out += p+"\n";
		}
			
		return out;
	}
	//-------------------------------------------------
	public SearchEngine getSearchEngine() 
	{
		return this.searchEngine;
	}
	//-------------------------------------------------
	public void addPersons(Person...persons)
	{
		for(Person p : persons)
		{
			addPerson(p);
		}
	}
	//-------------------------------------------------
	public void addPerson(Person aPerson)
	{
		this.persons.add(aPerson);
	}
	//-------------------------------------------------
	
	public PersonDatabase()
	{
		this.persons = new ArrayList<Person>();
		this.searchEngine = new SearchEngine(this);
	}
	
	
	
}
