package Day2.Exercise2;

public class main {

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo t1=new ThreadDemo(10);
		ThreadDemo t2=new ThreadDemo(20);
		ThreadDemo t3=new ThreadDemo(30);
   t1.start();
   t1.join();
   t2.start();
   t2.join();
   t3.start();
   t3.join();
	}

}
