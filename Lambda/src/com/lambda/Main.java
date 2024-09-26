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
		
//		MyInterface myInterface = () -> System.out.println("Lambda expression");
//		
//		myInterface.sayHello();
		
		
		
		SumInter inter =(i, j) -> i+j;
		System.out.println(inter.sum(10, 20));
		System.out.println("END");
	}

}
