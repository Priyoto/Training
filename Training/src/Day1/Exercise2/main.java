package Day1.Exercise2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your input");
		String input=sc.next();
		
		ShapeObjectCreator s=new ShapeObjectCreator();
		s.getShape(input).display();
		sc.close();

	}

}
