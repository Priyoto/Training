package Day2.Exercise1;

import java.util.Scanner;

public class main {
	
	public static boolean isPalindrome(int n) {
		StringBuffer sb=new StringBuffer(String.valueOf(n));
		String temp=sb.toString();
		sb.reverse();
	
		if(temp.equals(sb.toString()))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		int n=sc.nextInt();
		
		
		if(isPalindrome(n))
			System.out.println(n+" is a palindrome number");
		else {
		
		int low=n-1;
		
		while(!isPalindrome(low))
			low--;
		
		int high=n+1;
		
		while(!isPalindrome(high))
			high++;
		
		if(n-low < high-n)
			System.out.println("nearest palindrome number is "+low);
		else
			
			System.out.println("nearest palindrome number is "+high);
	}
	}

}
