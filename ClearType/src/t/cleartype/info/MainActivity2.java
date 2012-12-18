package t.cleartype.info;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		
		
		Button btn1 = (Button)findViewById(R.id.button2);
		btn1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
					mOnClick2(v);
					finish();
				
			}
		});
	}
	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void mOnClick2(View v) {
		Intent intent = new Intent(this,MainActivity3.class);
		startActivity(intent);
	}
	

}
