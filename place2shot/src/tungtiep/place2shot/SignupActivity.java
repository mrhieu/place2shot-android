package tungtiep.place2shot;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SignupActivity extends Activity implements OnClickListener {
	
	
	private Button btsubmit;
	Bundle bd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.signup);
		
		
		btsubmit = (Button)findViewById(R.id.btSubmit);
		btsubmit.setOnClickListener(this);
		
		}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
//		Intent back = new Intent("android.intent.action.MAIN");
//		startActivity(back);
		finish();
	};
	}
	
	
	
	


