package exercises;

public class UniversityGradeApplication {

	public static void main(String[] args)
	{
		Grade p2 = new Grade(0); //create a new object
		//Is this the right way to initialse Grade?
		
		p2.setPercentage(95);
		
		System.out.println(p2.getPercentage() + "%");
	}
}
