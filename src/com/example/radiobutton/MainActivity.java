package com.example.radiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
	RadioGroup rg;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 rg = (RadioGroup) findViewById(R.id.radioGroup);
         rg.clearCheck();

        OnClickListener listener = new OnClickListener() {
             @Override
             public void onClick(View v) {
                    RadioButton rb = (RadioButton) v;
                    Toast.makeText(MainActivity.this, rb.getText(),Toast.LENGTH_SHORT).show();
             }
       };

       RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton1);
       rb1.setOnClickListener(listener);

       RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
       rb2.setOnClickListener(listener);

       RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);
       rb3.setOnClickListener(listener);
}

	public void clear(View v) {
		rg.clearCheck();
	}

	

	
}
