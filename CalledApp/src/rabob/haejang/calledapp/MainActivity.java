package rabob.haejang.calledapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txt = (TextView)findViewById(R.id.txt_result);
		String data = getIntent().getStringExtra("KEY_VAL"); //get data matched KEY_VALUE
		if(data != null)
			txt.setText(data);	
	}
}
