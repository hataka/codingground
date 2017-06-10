package ya.Sample073;


import com.google.android.maps.*;
import android.os.*;
import android.widget.*;

public class Sample073 extends MapActivity
{
	MapView mv;
   
   public void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      LinearLayout ll = new LinearLayout(this); 
      ll.setOrientation(LinearLayout.VERTICAL);
      setContentView(ll);

      mv= new MapView(this, "0ZEldpaTWV2dKLtPZARBsGq-B2WQyggZc9A7HLQ");  //API�L�[���K�v
      mv.setEnabled(true);
      mv.setClickable(true);
      mv.setBuiltInZoomControls(true);
      
      ll.addView(mv);
      
   }
   protected boolean isRouteDisplayed()
   {
	   return false;
   }
}
