package rabob.haejang.sliding_menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements Animation.AnimationListener{
	boolean isPageOpen = false; //flag
	Animation toLeft, toRight;
	Button btn; LinearLayout my_layout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		my_layout = (LinearLayout)findViewById(R.id.my_layout); //blue
		btn = (Button)findViewById(R.id.button3);
		
		toLeft = AnimationUtils.loadAnimation(this, R.anim.move_to_left);
		toLeft.setAnimationListener(this);
		toRight = AnimationUtils.loadAnimation(this, R.anim.move_to_right);
		toRight.setAnimationListener(this);
		
		btn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				if(isPageOpen)
					my_layout.startAnimation(toRight);
				else{
					my_layout.setVisibility(View.VISIBLE);
					my_layout.startAnimation(toLeft);
				}
			}
		});
	}
	
//call back in AnimationListener
	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onAnimationEnd(Animation animation) {
		isPageOpen = !isPageOpen;
	//	my_layout.setVisibility(View.INVISIBLE);
	}
	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub
		
	}
	
}
