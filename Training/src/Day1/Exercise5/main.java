package Day1.Exercise5;

import java.util.Scanner;

public class main {
	
	public static void isPrime(int n) {
		if(n==0||n==1)
			System.out.println("Number "+n+" is not prime");
		else if(n==2)
			System.out.println("Number "+n+" is  prime");
		else {
			boolean flag=false;
			
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					flag=true;
				break;
				}
			}
			if(flag)
				System.out.println("Number "+n+" is not prime");
			else
				System.out.println("Number "+n+" is  prime");
			}
	}

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to check prime");
		int n=sc.nextInt();
		try {
		if(n<0)
			throw new NegativeNumberException();
		else if(n>100)
			throw new LargeNumberException();
		else
			isPrime(n);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
		sc.close();
		}
			
	}

}
