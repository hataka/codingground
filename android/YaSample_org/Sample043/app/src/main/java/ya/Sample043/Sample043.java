package ya.Sample043;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;

public class Sample043 extends Activity
{
   TextView tv;
   Button bt;
	
   public void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      LinearLayout ll = new LinearLayout(this); 
      ll.setOrientation(LinearLayout.VERTICAL);
      setContentView(ll);
      
      tv = new TextView(this);
      tv.setText("いらっしゃいませ。");
      bt = new Button(this);
      bt.setText("購入");

      ll.addView(tv);
      ll.addView(bt);
 
      bt.setOnClickListener(new SampleClickListener());
   }
   
   class SampleClickListener implements OnClickListener
   {
      public void onClick(View v)
      {
         tv.setText("ありがとうございます。");
         bt.setEnabled(false);
      }
   }  
}
