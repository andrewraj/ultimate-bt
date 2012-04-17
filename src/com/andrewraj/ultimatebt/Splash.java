package com.andrewraj.ultimatebt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle UBT) {
		// TODO Auto-generated method stub
		super.onCreate(UBT);
		
		setContentView(R.layout.splash);
		
		Thread timer = new Thread() {
			public void run() {
				try {
					sleep(5000); //5000ms = 5 seconds 
										
				}catch (InterruptedException e){
					e.printStackTrace();
					
				}finally{
					Intent openStartingPoint = new Intent("com.andrewraj.ultimatebt.ULTIMATEBT");
					startActivity(openStartingPoint); 
				}
			}
			
		};
		timer.start();
	}
	
	//Device List
	
	
	
	

	
	
}
