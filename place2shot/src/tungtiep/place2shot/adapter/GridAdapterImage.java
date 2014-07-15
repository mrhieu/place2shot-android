package tungtiep.place2shot.adapter;



import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.ImageView;

public class GridAdapterImage extends BaseAdapter {
	private Context context;
	private int[] idImage;

	public GridAdapterImage(Context context, int[] idImage) {
		this.idImage = idImage;
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return idImage.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		ImageView iv;
//		Button bt = null;
		if(arg1 == null){
			iv = new ImageView(context);
//			bt = new Button(context);
		}else{
			iv = (ImageView) arg1;
//			bt = (Button) arg1;
		}
		iv.setImageResource(idImage[arg0]);
//		bt.setText("ok");
		return iv;
	}

}
