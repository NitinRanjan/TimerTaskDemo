package com.genericclass;

import java.util.Timer;
import java.util.TimerTask;

public class Driver {

	public static void main(String[] args) {

		TimerTask task = new MyTask();	//TimerTask Object of MyTask class
		Timer timer = new Timer(true);	// Creates a new timer whose associated thread may be specified to run as a daemon

		timer.scheduleAtFixedRate(task, 0, 5*1000); //Schedules the specified task for repeated fixed-rate execution, 
													   //beginning after the 0 millisecond delay and perform task after every 5sec.
		try {
			Thread.sleep(1*60*1000); 	//wait for one min to let the timer run
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timer.cancel();		//cancel the timer
	}

}
