package com.fileapp.api;

public class WorkerThred {

	public void method(Exception e) {
		System.out.println("Airth");
	}

	public void method(NullPointerException e) {
		System.out.println("Normal");
	}

	public static void main(String[] bbb) {
		
		new WorkerThred().method(null);
	}
}
