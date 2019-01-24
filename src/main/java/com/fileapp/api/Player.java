package com.fileapp.api;

public class Player {
	
	
	public static  void getPlay(Integer in) {
		if(in==1) {
			
			System.out.println("thread1"+Thread.currentThread().getName());
			throw new RuntimeException();
			
		}
		else {
			System.out.println("thread2"+Thread.currentThread().getName());
		}
		//
		
	}

}
