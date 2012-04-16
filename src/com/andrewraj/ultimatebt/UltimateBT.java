package com.andrewraj.ultimatebt;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;

public class UltimateBT extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    
    // Creating menus
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    
    // Menu creation
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Intent serverIntent = null;
        switch (item.getItemId()) {
        case R.id.secure_connect_scan:
            // Launch the DeviceListActivity to see devices and do scan
            //serverIntent = new Intent(this, DeviceListActivity.class);
            //startActivityForResult(serverIntent, REQUEST_CONNECT_DEVICE_SECURE);
            return true;
        case R.id.discoverable:
            // Ensure this device is discoverable by others
            //ensureDiscoverable();
            return true;
        case R.id.about:
            // Ensure this device is discoverable by others
        	//showDialog(DIALOG_ABOUT);
            return true;
        }
        
        return false;
    }
}