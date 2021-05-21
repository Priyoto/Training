package Day1.Exercise4;

public class main {

	public static void main(String[] args) {
		
		Employee e1=new Employee.Builder().Firstname("Suraj").Age(17).build();
		System.out.println(e1);
		
		Employee e2 =new Employee.Builder().Firstname("Rekha").Compay("Wipro").Experience(5).build();
		
		System.out.println(e2);
	}
}
