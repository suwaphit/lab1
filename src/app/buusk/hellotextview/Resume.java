package app.buusk.hellotextview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Resume extends Activity {
	private TextView txt1,txt2,txt3,txt4;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resume);
		ViewMatching();
	}


	private void ViewMatching() {
		// TODO Auto-generated method stub
		txt1 = (TextView) findViewById(R.id.txtname);
		txt2 = (TextView) findViewById(R.id.txtnickname);
		txt3 = (TextView) findViewById(R.id.txttel);
		txt4 = (TextView) findViewById(R.id.txtemail);
		txt1.setText("Name  : SUWAPHIT   KETKUN");
		txt2.setText("Nickname	:	Kai");
		txt3.setText("Tel : 0885283660");
		txt4.setText("E-mail : pdan-gai@hotmail.com");
		
		
	}
}
