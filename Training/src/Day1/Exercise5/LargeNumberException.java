package Day1.Exercise5;

public class LargeNumberException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LargeNumberException() {
		System.out.println("Number is too Large");
	}
}
