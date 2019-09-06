package exercises;

public class Ex4PersonalData 
{
	public static void main(String[] args) 
	{
		PersonalInfo data;
		data = new PersonalInfo();
		
		data.name = "Matthew Fan";
		data.birthday = "November 25th";
		data.interests = "Programming";
		data.favoritebook = "The Beauty of Math";
		data.favoritefilm = "Iron Man";
		
		System.out.println("Name: " + data.name);
		System.out.println("Birthday: " + data.birthday);
		System.out.println("Intersts: " + data.interests);
		System.out.println("Favorite book: " + data.favoritebook);
		System.out.println("Favorite film: " + data.favoritefilm);
	}
}