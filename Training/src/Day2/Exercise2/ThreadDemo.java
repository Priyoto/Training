package Day2.Exercise2;

import java.util.ArrayList;

 class ThreadDemo extends Thread {

	 ArrayList<Integer> list=new ArrayList<>();
	
	
	 int n;
	 public ThreadDemo(int n) {
		super();
		this.n = n;
		
	}
	@Override
	 public void run() {
		
			list.add(n);
		
		
		System.out.println(list);
		
	}

}
