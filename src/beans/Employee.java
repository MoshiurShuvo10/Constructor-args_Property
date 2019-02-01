package beans;

public class Employee {
	private String name,email;
	private int age;
	Address address;
	
	
	public Employee(String name, String email, int age, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
	}

	
	public void print() {
		System.out.println("name: "+name);
		System.out.println("email: "+email);
		System.out.println("age: "+age);
		System.out.println(address.toString());
	}
}
