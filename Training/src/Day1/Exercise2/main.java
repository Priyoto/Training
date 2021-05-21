package Day1.Exercise2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your input");
		String input=sc.next();
		if(input.equals("Circle")) {
			new Circle().display();
		}
		else if(input.equals("Rectangle")) {
			new Rectangle().display();
		}
		else if(input.equals("Square")) {
			new Square().display();
		}
		else
			System.out.println("Wrong Input");
		sc.close();

	}

}
