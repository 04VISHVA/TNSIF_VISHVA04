package com.tnsif.multithreading;

//Thread class
public class ChildThread extends Thread {
	private int n;
	private String msg;

	// Constructor
	public ChildThread(int n, String msg) {
		this.n = n;
		this.msg = msg;
	}

	@Override
	public void run() {
		for (int i = 1; i <= n; i++) {
			Thread.sleep(300);  
			System.out.println(msg + i + " " + Thread.currentThread().getName());
		}
	}
}

