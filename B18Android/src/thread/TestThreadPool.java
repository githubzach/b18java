package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {  

	public static void main(String[] args) {
		//thread pool://创建一个可重用固定线程数的线程池
		ExecutorService pool = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
		
		for (int i = 0; i < 10; i++) { 
			//initialize the 5 threads...
			Runnable worker = new WorkerThread("" + i);  
			//invoke execute() method to execute the threads from the pool
			pool.execute(worker);//calling execute method of ExecutorService  
		}
		
		pool.shutdown();
		while (!pool.isTerminated()) {   } 
		System.out.println("Finished all threads");  
		
	}
}  