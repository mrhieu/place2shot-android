package tungtiep.place2shot;





import tungtiep.place2shot.adapter.GridAdapterImage;
import LibraryImage.LoadImage;


import android.os.Bundle;
import android.app.Activity;

import android.view.Menu;
import android.view.View;

import android.widget.GridView;
import android.widget.TabHost;
import android.widget.Toast;

public class ProfileActivity extends Activity {
	private GridView gv;
	
	LoadImage image;
	GridAdapterImage gridAdapter;
	int[] image2 = { R.drawable.b, R.drawable.b, R.drawable.b, R.drawable.b,
			R.drawable.b, R.drawable.b, R.drawable.b};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile);
		gv = (GridView) findViewById(R.id.gvImage11);
		image = new LoadImage();
		gridAdapter = new GridAdapterImage(getApplicationContext(),
				image2);
		// Button bt = (Button) findViewById(R.id.bt);

		loadTabhost();
		// bt.setOnClickListener(new View.OnClickListener() {
		//
		// @Override
		// public void onClick(View arg0) {
		// // TODO Auto-generated method stub
		// Intent intent = new Intent(
		// getApplicationContext(), main.class);
		// startActivity(intent);
		// }
		// });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void btQuit(View v) {
		Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();

	}

	private void loadTabhost() {
		final TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
		tabHost.setup();
		TabHost.TabSpec tabSpec;
		// tabInfo
		tabSpec = tabHost.newTabSpec("infomation");
		tabSpec.setContent(R.id.tabInfo);
		tabSpec.setIndicator("Info");
		tabHost.addTab(tabSpec);

		// tabLibrary
		tabSpec = tabHost.newTabSpec("library");
		tabSpec.setContent(R.id.tabLibrary);
		tabSpec.setIndicator("Library");
		tabHost.addTab(tabSpec);

		// tabFriend
		tabSpec = tabHost.newTabSpec("friend");
		tabSpec.setContent(R.id.tabFriend);
		tabSpec.setIndicator("Friend");
		tabHost.addTab(tabSpec);

		tabSpec = tabHost.newTabSpec("setting");
		tabSpec.setContent(R.id.tabSetting);
		tabSpec.setIndicator("Setting");
		tabHost.addTab(tabSpec);

		tabHost.setCurrentTab(0);

		tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {

			@Override
			public void onTabChanged(String tabId) {
				// TODO Auto-generated method stub

				if (tabHost.getCurrentTab() == 1) {

					// String s="Tab tag ="+tabId +"; index ="+
					// tabHost.getCurrentTab();
					// Toast.makeText(getApplicationContext(),
					// s, Toast.LENGTH_LONG).show();
					gv.setAdapter(gridAdapter);
					// gv = (GridView) findViewById(R.id.gvImage);
					// main m = new main();
					// adapter = m.ok(getApplicationContext(),
					// R.layout.image_row);
					// if(adapter == null)
					// Toast.makeText(getApplicationContext(), "ok",
					// Toast.LENGTH_LONG).show();
					// gv.setAdapter(adapter);
					// Intent intent = new Intent(getApplicationContext(),
					// testAcitivity.class);
					// startActivity(intent);
//					Toast.makeText(getApplicationContext(), "tes",
//							Toast.LENGTH_SHORT).show();
				}
			}
		});
	}


}
