package Day1.Exercise4;

public class FirstNameException extends RuntimeException{

	public FirstNameException() {
		System.out.println("First name can not be null");
	}
}
