package Aiub.LabExam;

public class EmployeeTest {
	public static void main(String[] args) {
		Address A1=new Address("Rangpur","Bangladesh");
		Employee E1=new Employee (111,"Sufi",222.22,A1);
		
		System.out.println(E1);
		
		E1.show();
		
		System.out.println();
		
        Address A2=new Address("Dhaka","Bangladesh");
		Employee E2=new Employee (121,"Siam",333.12,A2);
		
		System.out.println(E2);
		
		E2.show();
		
		
   
	}

}
