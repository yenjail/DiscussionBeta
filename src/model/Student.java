package model;

public class Student {
	private String id;
	private String name;
	private String address;
	private String gender;
	private String country;
	
	public Student(String id, String name, String address, String gender, String country){
		this.id=id;
		this.name=name;
		this.address=address;
		this.gender=gender;
		this.country=country;
		
	}
	
	
	public String getId(){
		return id;
	}
	public void setID(String name){
		this.name=name;
	}
	public String getName() {
		return name;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
