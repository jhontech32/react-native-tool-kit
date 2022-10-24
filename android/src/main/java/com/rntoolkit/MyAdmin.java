package com.rntoolkit;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;

/**
 * DeviceAdminDemo to enable, disable the options.
 * @author Prashant Adesara
 * */
public class MyAdmin extends DeviceAdminReceiver
{
    @Override
	public void onReceive(Context context, Intent intent) {
		super.onReceive(context, intent);
	}
	
    @Override
    public void onEnabled(@NonNull Context context, @NonNull Intent intent) {
        Toast.makeText(context, "Device Admin : enabled", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDisabled(@NonNull Context context, @NonNull Intent intent) {
        Toast.makeText(context, "Device Admin : disabled", Toast.LENGTH_SHORT).show();
    }
}
