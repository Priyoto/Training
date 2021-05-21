package Day1.Exercise3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main{

	
	public static void main(String[] args) {
		
   ExecutorService executor = Executors.newFixedThreadPool(5);
   for (int i = 5; i < 10; i++) {  
       Runnable worker = new ThreadDemo(i);  
       executor.execute(worker);
     }  
   executor.shutdown(); 
	}

}
