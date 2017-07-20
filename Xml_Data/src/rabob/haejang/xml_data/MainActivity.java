package rabob.haejang.xml_data;

import org.xmlpull.v1.XmlPullParser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

// Data locate res/xml/sales.xml
public class MainActivity extends Activity {

	TextView result; Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		result = (TextView)findViewById(R.id.result);
		btn = (Button)findViewById(R.id.button1);
		btn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				XmlPullParser parser = getResources().getXml(R.xml.sales); //XMLPullPaser is interpret XML file
				StringBuilder sBuilder = new StringBuilder(); //StringBuilder handles unfixed length of string
				try{
					while(parser.next() != XmlPullParser.END_DOCUMENT){//if not end of XML repeat
						String name = parser.getName();
						String brand = null; String position = null;
						if(name != null && name.equals("car")){
							int size = parser.getAttributeCount(); //get attribute's number
							for(int i = 0 ; i<size; i++){
								String attr = parser.getAttributeName(i);
								String attrValue = parser.getAttributeValue(i);
								
								if((attr != null) && (attr.equals("position")))
									position = attrValue;
								else if((attr != null)&&(attr.equals("brand")))
									brand = attrValue;
							}
							
							if (position != null && brand != null){
								sBuilder.append(position+","+brand+"\n");
							}
						}
					}
					result.setText(sBuilder.toString());
				}catch(Exception e){
					
				}
			}
		});
	}
}
