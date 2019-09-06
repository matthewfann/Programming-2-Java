package examples;

public class Contact {
	private String name;
	private String telephone;
	
	public Contact(String name, String telephone, String address) {	
		this.name = name;
		this.telephone = telephone;
		this.address = address;
	}
	
	private String address;
	public String getName() {
		return name;
	}
	
	public String toString(){
		return name+", "+address+", "+telephone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
