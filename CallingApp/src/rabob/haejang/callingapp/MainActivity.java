package rabob.haejang.callingapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	int KEY_VAL = 1; //value of KEY
	Button btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn = (Button)findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent it = new Intent("aaa");
				it.putExtra("KEY_VAL", "hi!!"); //send data (value of key, data)
				startActivityForResult(it,1); //(intent, identifier)
				
				
			}
		});
	}
}
