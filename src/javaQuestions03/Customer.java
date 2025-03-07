package javaQuestions03;

//import groovy.transform.ToString;
//import lombok.AllArgsConstructor;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@Data

public class Customer {

	private String name;
	private int age;
	private String city;
	private boolean isActive;
	private String dob;

	public Customer() {

	}

	public Customer(String name, int age, String city, boolean isActive, String dob) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.isActive = isActive;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", city=" + city + ", isActive=" + isActive + ", dob=" + dob
				+ "]";
	}
}