package Aiub.LabExam;

public class Student extends Person {
	public int id;
	public  double cgpa;
	
	public Student() {

	}

	public Student(String name,int age,int id, double cgpa) {
		
		super();
		this.name=name;
		this.age=age;
		this.id = id;
		this.cgpa = cgpa;
	}
	
	public void showInfo() {
		System.out.println("Name:"+name+" Age:"+age+" ID:"+id+" CGPA:"+cgpa);
	}
	
	

}
