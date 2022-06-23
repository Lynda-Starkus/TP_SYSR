package com.example.tp;

public class FakeResource {
	public static void access(){
		System.out.print("Resource is being accessed by " + Main.PROCESS_ID + " ...");
		try {
			Thread.sleep(10000);
			System.out.println(" released");
		} catch (InterruptedException e) {
		}
	}
}
