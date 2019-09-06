package examples;

public class Person {
	
	private String name;
	private int birthYear;
	private String relatives;
	
	public String toString()
	{
		return this.getName()+" "+
	           this.getBirthYear()+" "+
			   this.getRelatives();	
	}
	public Person(String name,int birthYear,String relatives)
	{
		this.setName(name);
		this.setBirthYear(birthYear);
		this.setRelatives(relatives);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getRelatives() {
		return relatives;
	}
	public void setRelatives(String relatives) {
		this.relatives = relatives;
	}
	
	
	
	

}
