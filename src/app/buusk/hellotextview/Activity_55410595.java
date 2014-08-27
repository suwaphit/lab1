package app.buusk.hellotextview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity_55410595 extends Activity implements OnClickListener {
	private Button btnone, btntwo, btnthree, btnfour;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_595);
		ViewMatching();

	}// OnCreate

	private void ViewMatching() {
		// TODO Auto-generated method stub
		btnone = (Button) findViewById(R.id.one1);
		btntwo = (Button) findViewById(R.id.two2);
		btnthree = (Button) findViewById(R.id.three3);
		btnfour = (Button) findViewById(R.id.four4);
		btnone.setOnClickListener(this);
		btntwo.setOnClickListener(this);
		btnthree.setOnClickListener(this);
		btnfour.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.one1:

			break;
		case R.id.two2:
			Intent ssurema = new Intent(Activity_55410595.this, Resume.class);
			startActivity(ssurema);

			break;
		case R.id.three3:

			break;
		case R.id.four4:

			break;

		default:
			break;
		}
	}

}
