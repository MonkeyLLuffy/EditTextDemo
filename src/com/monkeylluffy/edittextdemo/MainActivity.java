package com.monkeylluffy.edittextdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText btn_visible;
	private DelEditText btn_delete;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn_delete = (DelEditText) findViewById(R.id.delete);
		btn_visible = (EditText) findViewById(R.id.passwordvisible);
		
	}

}
