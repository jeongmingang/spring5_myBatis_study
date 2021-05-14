package spring5_myBatis_study.dto;

import java.util.List;

public class Tutor {
	private int tutorId;
	private String name;
	private String email;
	private Address address;
	private List<Course> courses;
	
	private PhoneNumber phone;
	
	public Tutor() {
		
	}

	public Tutor(int tutorId, String name, String email, PhoneNumber phone, Address address) {
		this.tutorId = tutorId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public int getTutorId() {
		return tutorId;
	}
	
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Course> getCourses() {
		return courses;
	}
	
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public PhoneNumber getPhone() {
		return phone;
	}

	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return String.format("Tutor [%s, %s, %s, %s, %s, %s]",
				tutorId, name, email, address, phone, courses);
	}
}
