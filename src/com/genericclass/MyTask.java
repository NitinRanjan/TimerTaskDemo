package com.genericclass;

import java.util.Date;
import java.util.TimerTask;
import java.util.stream.IntStream;

public class MyTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("\n\nTask started at:"+new Date());
		doTask();
		System.out.println("Task Compleated at:"+new Date());
	}

	private void doTask() {
		System.out.print("executing Task");
		IntStream.range(0,10).forEach(n -> {
			System.out.print(".");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		System.out.println("\n Task done\n\n");
	}

}
