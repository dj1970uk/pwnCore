package com.anwarelmakrahy.pwncore.activities;

//import com.anwarelmakrahy.plugindroid.PluginManager;
//import com.anwarelmakrahy.plugindroid.PluginManager.PackageTableChangeListener;
import com.anwarelmakrahy.pwncore.MainActivity;
import com.anwarelmakrahy.pwncore.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {	
		super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
		WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);    
        
    	/*new Thread() {
			@Override
			public void run() {			
			
				PluginManager.registerPlugin("com.anwarelmakrahy.pwncore.plugin");
				PluginManager.loadPlugins(
						getApplicationContext(),
						"com.anwarelmakrahy.pwncore.plugin");
				PluginManager.setPackageTableChangerListener(new PackageTableChangeListener() {

					@Override
					protected void packageTableChanged(String action,
							String packageName) {
						Log.i("PluginManager", action + " " + packageName);
						
					}});
				
			}
		}.start();*/
        
        long splashDelay = 1000;
		new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            	Intent main = new Intent(getApplicationContext(), MainActivity.class);
            	main.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP); 
                startActivity(main);
                finish();
            }
        }, splashDelay );
	}

}
