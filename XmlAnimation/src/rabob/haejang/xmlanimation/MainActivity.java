package rabob.haejang.xmlanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {
	ImageView iv1,iv2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		iv1 = (ImageView)findViewById(R.id.imageView1);
		iv1.setImageResource(R.drawable.roidragon);
		Animation an = AnimationUtils.loadAnimation(this, R.anim.spin); //anim��  �� �ִ� XML ���� ����ϴ� ��ü Animation
		iv1.startAnimation(an); //���ϸ��̼� ���� 
		
		iv2 = (ImageView)findViewById(R.id.imageView2);
		iv2.setImageResource(R.drawable.red_oval);
		Animation ov = AnimationUtils.loadAnimation(this, R.anim.pulse);
		iv2.startAnimation(ov);
	}
}

