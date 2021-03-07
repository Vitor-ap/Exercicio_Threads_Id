package view;

import controller.Thread_1;
import controller.Thread_2;
import controller.Thread_3;
import controller.Thread_4;
import controller.Thread_5;

public class Main5Threads {

	public static void main(String[] args) {
		Thread t1 = new Thread_1();
		Thread t2 = new Thread_2();
		Thread t3 = new Thread_3();
		Thread t4 = new Thread_4();
		Thread t5 = new Thread_5();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
