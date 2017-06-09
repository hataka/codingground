// -*- mode: java -*-  Time-stamp: <2012-02-10 14:16:08 kahata>
/*================================================================
 * title: 
 * file: Sample036.java
 * path: F:\android\YASample\Sample036\src\ya\Sample\Sample036.java
 * url:  http://192.168.24.92/android/YASample/Sample036/src/ya/Sample/Sample036.java
 * created: Time-stamp: <2012-02-10 14:16:08 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * description: 
 *================================================================*/

package ya.Sample036;

import android.app.*;
import android.content.Intent;
import android.net.Uri;
import android.os.*;
import android.view.*;
import android.widget.*;

public class Sample036 extends Activity
{
   TextView tv;
	
   public void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      LinearLayout ll = new LinearLayout(this); 
      ll.setOrientation(LinearLayout.VERTICAL);
      setContentView(ll);
      
      tv = new TextView(this);
      tv.setText("いらっしゃいませ。");

      ll.addView(tv);
   }
   
   public boolean onTouchEvent(MotionEvent e)
   {
      if(e.getAction() == MotionEvent.ACTION_DOWN)
      {
         tv.setText("こんにちは");
      }
      else if(e.getAction() == MotionEvent.ACTION_UP)
      {
         tv.setText("さようなら");
      }
      return true;
   }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// メニューを追加
		menu.add(Menu.NONE, 0, Menu.NONE, "ソースをブラウザで表示");
		return super.onCreateOptionsMenu(menu);
	}
	// メニューが選択されたときに実行される
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		// 選択されたIDを確認
		switch (item.getItemId()) {
			case 0:
				//Uri uri = Uri.parse("http://android.roof-balcony.com/");
				try {
					Uri uri = Uri.parse("http://localhost/f/android/YASample/Sample036/src/ya/Sample/Sample036.java");
					Intent intent = new Intent(Intent.ACTION_VIEW,uri);
					startActivity(intent);
				}catch (Exception e) {
					Toast.makeText(this,
							e.toString(), Toast.LENGTH_LONG).show();
				}
				break;
		}
		return true;
	}
}
