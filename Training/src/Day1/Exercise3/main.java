package Day1.Exercise3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main implements Callable<Integer>{
    
	int n=0;
	public main(int i) {
		this.n=i;
	}


	@Override
	public Integer call() throws Exception {
	
	    return Fact(n);
	}
	
	public int  Fact(int n) {
		int result=1;
		for(int i=2;i<=n;i++)
			result*=i;
		return result;
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
   ExecutorService executor = Executors.newFixedThreadPool(5);
   for (int i = 5; i < 10; i++) {  
//       Runnable worker = new ThreadDemo(i);  
//       executor.execute(worker);
	   Future<Integer> result = executor.submit(new main(i));
	   System.out.println("Factorial of "+i+" is "+ result.get());
     }  
   executor.shutdown(); 
   
	}

	

}
