package rabob.haejang.visiting_web;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {
	WebView myWeb;
	final String DEFAULT_URL = "http://naver.com";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myWeb=(WebView)findViewById(R.id.webView1);
		myWeb.getSettings().setJavaScriptEnabled(true);
		myWeb.getSettings().setUseWideViewPort(true);
		myWeb.loadUrl(DEFAULT_URL);
	}
}
