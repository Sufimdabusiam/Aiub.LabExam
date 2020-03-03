package Aiub.LabExam;

public class Employee {
	public int id;
	public String name;
	public double salary;
	public Address address;
	
	public Employee() {	
		
	}

	public Employee(int id,String name,double salary,Address address) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.address=address;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public double getSalary(){
		return salary;
	}

	public void setSalary(double salary){
		this.salary = salary;
	}

	public Address getAddress(){
		return address;
	}

	public void setAddress(Address address){
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	public void show() {
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
		System.out.println("City:"+address.city);
		System.out.println("Country:"+address.country);
		
		
		
		
	}
	
}
