package examples;

import java.util.ArrayList;

public class PeopleList {

	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		Student stu1 = new Student("Sue Perman","55 Hero ave","COMP503,COMP500","123");
		Student stu2 = new Student("Robin Banks","Vault Street","COMP503","1233435");
		
		people.add(stu1);
		people.add(stu2);
		
		Lecturer lecture1  = new Lecturer("Ken","123 Fake Street","P2 is great!");
		
		Lecturer lecture2  = new Lecturer("Steffan","123 Fake Ave","P1 was better!");
		
		people.add(lecture1);
		people.add(lecture2);
		
	
		for(Person person : people)
		{
			System.out.println(person);
		}
		
		
		
		

	}

}
