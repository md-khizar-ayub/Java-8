package com.lambda;

public class Main {

	public static void main(String[] args) {
		System.out.println("START");
		
//		MyInterface interface1 = new MyInterfaceImpl();
//		interface1.sayHello();
		
		
//		MyInterface myInterface = new MyInterface() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("Hello from anonymous class");
//				
//			}
//		};
//		myInterface.sayHello();
//		
		
		MyInterface myInterface = () -> {
			System.out.println("Lambda expression");
		};
		myInterface.sayHello();
		System.out.println("END");
	}

}
