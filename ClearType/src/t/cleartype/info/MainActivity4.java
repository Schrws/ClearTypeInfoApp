package t.cleartype.info;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main4);
		
		
		Button btn1 = (Button)findViewById(R.id.button2);
		btn1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
					finish();
				
			}
		});
		
		Button btn2 = (Button)findViewById(R.id.button1);
		btn2.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
					Intent myIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://cleartype.kr"));
					startActivity(myIntent);
				
			}
		});
		
		Button btn3 = (Button)findViewById(R.id.button3);
		btn3.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				Intent myIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://b.cleartype.kr"));
				startActivity(myIntent);
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	

}
