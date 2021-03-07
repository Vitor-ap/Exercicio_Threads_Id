package controller;

public class Thread_1 extends Thread {

	@Override
	public void run() {
		System.out.println("Id da Thread #1: " + getId());
	}
}
