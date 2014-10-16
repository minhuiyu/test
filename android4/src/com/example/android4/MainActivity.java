package com.example.android4;

import com.example.android4.R.id;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.*;
import android.widget.RadioGroup;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener{
	public CheckBox checkBox1;
	public CheckBox checkBox2;
	public CheckBox checkBox3;
	public RadioGroup rgGroup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
		checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
		checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
		checkBox1.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean ischecked1) {
				Log.i("tag", ischecked1 + "");
				if (ischecked1) {
					String text = checkBox1.getText().toString();
					Log.i("tag", "text");
				}

				// TODO Auto-generated method stub

			}
		});

		checkBox2.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean ischecked2) {
				Log.i("tag", ischecked2 + "");
				if (ischecked2) {
					String text = checkBox2.getText().toString();
					Log.i("tag", "text");
				}

				// TODO Auto-generated method stub

			}
		});
		checkBox3.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean ischecked3) {
				Log.i("tag", ischecked3 + "");
				if (ischecked3) {
					String text = checkBox3.getText().toString();
					Log.i("tag", "text");
				}

				// TODO Auto-generated method stub

			}
		});

		
		rgGroup=(RadioGroup)findViewById(R.id.radioGroup1);
		rgGroup.setOnCheckedChangeListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onCheckedChanged(RadioGroup arg0, int checkid) {
		switch(checkid){
		case R.id.radio0:
			System.out.println("是个男娃子");
			break;
		case R.id.radio1:
			Log.i("tag", "是个女娃子");
			break;
			
		}
		// TODO Auto-generated method stub
		
	}

}
