package com.lambda.thread;

public class Main {
	public static void main(String[] args) {
		 System.out.println("Starts");
		 
		 
		 //thread
		 Runnable runnable = () -> {
			 //this body of thread
			 for(int i=0; i<10;i++) {
				 
				 try {
					 System.err.println("Value is : "+i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
			 
		 };
		 Thread thread = new Thread(runnable);
		 thread.setName("Ayub");
		 thread.start();
		 
		 
		 
		 new Thread(()->{
			 //this body of thread
			 for(int i=0; i<10;i++) {
				 
				 try {
					 System.err.println("Value from thread : "+i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			 }
		 }).start();;
		 System.out.println("Ends");
	}
}
