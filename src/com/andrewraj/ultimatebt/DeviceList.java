package com.andrewraj.ultimatebt;

import com.andrewraj.ultimatebt.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class DeviceList extends Activity {

	
	
	//Initialize the button to perform DEVICE DISCOVERY
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
			Button scanButton = (Button) findViewById(R.id.button_scan); // bScan
				scanButton.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						doDiscovery(); // does the device discovery later on
						v.setVisibility(View.GONE);
						
					}
				});
			}	
}
