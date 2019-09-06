package exercises;

public class Person 
{
	int age;
	double weight;
	boolean student;
	char gender;
	
	Person(int input_age, double input_weight, boolean input_student, char input_gender)
	{
		this.age = input_age;
		this.weight = input_weight;
		this.student = input_student;
		this.gender = input_gender;
	}
	
	Person()
	{
		this.age = 0;
		this.weight = 0.0;
		this.student = false;
		this.gender = '?';
	}
}
