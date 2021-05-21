package Day1.Exercise3;

class ThreadDemo implements Runnable{
int n=0;
	@Override
	public void run() {
System.out.println("Thread "+Thread.currentThread().getId()+" is Running");
			Fact(n);
	}
	
	public ThreadDemo(int n) {
		super();
		this.n = n;
	}

	public void Fact(int n) {
		int result=1;
		for(int i=2;i<=n;i++)
			result*=i;
		System.out.println("Factorial of "+n+" is "+result);
	}
}
