package tungtiep.place2shot.tab;



import tungtiep.place2shot.adapter.GridAdapterImage;
import android.widget.GridView;

public class Library {
//	private GridView gv;
	private GridAdapterImage gridAdapter;
	public Library(GridView gv){
//		gridAdapter = new GridAdapterImage(image.idImage());
		gv.setAdapter(gridAdapter);
	}
}
