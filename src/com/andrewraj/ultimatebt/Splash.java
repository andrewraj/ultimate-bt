/* 
 * Coded by Andrew Raj
 * www.andrewraj.com
 */

package com.andrewraj.ultimatebt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle UBT) {
		// TODO Auto-generated method stub
		super.onCreate(UBT);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
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
