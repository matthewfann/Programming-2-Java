package lectures;

public class UniApp {

	public static void main(String[] args) {

		Person aPerson = new Person("Ken",100,new Address());

		System.out.println(aPerson);
		Staff staff = new Staff("Ken",100,new Address(),"WT703");
		System.out.println(staff);
		/*System.out.println(staff);
		staff.setName("Ken");
		staff.setAge(100);
		staff.setAddress( new Address());
		staff.setOfficeNumber("WT703C");
		 */
		// TODO Auto-generated method stub

	}

}
