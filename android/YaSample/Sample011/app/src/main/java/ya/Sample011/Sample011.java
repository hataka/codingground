// -*- mode: java -*-  Time-stamp: <2012-02-14 9:42:51 kahata>
/*================================================================
 * title: 
 * file: Sample011.java
 * path: F:\android\YASample\Sample011\src\ya\Sample011\Sample011.java
 * url:  http://192.168.24.92/android/YASample/Sample011/src/ya/Sample011/Sample011.java
 * created: Time-stamp: <2012-02-14 9:42:51 kahata>
 * revision: $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * description: はじめてのアンドロイドアプリケーション p.5
 *================================================================*/

package ya.Sample011;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Sample011 extends Activity {
	public final static String GIT_SITE   = "https://github.com/hataka/codingground/tree/master/android/YaSample/";
	public final static String RAW_SITE   = "https://raw.githubusercontent.com/hataka/codingground/master/android/YaSample/";
	public final static String LOCAL_SITE = "http://192.168.1.53/f/android/YASample/";
	public static String className;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        className = this.getClass().getSimpleName();
        
        setContentView(R.layout.main);
        TextView tv = (TextView) findViewById(R.id.textView1);
        tv.setText("ひろくん、こんにちは");
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// メニューを追加
		menu.add(Menu.NONE, 0, Menu.NONE, className+".java");
		menu.add(Menu.NONE, 1, Menu.NONE, "Git Site");
		return super.onCreateOptionsMenu(menu);
	}
	// メニューが選択されたときに実行される
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Uri uri;
		Intent i;
		// 選択されたIDを確認
		switch (item.getItemId()) {
			case 0:
		    	// 指定したURLをWebviewに読み込む
				//uri = Uri.parse("http://192.168.１.53/f/android/YASample/Sample011/src/ya/Sample011/Sample011.java");
				//uri = Uri.parse("https://raw.githubusercontent.com/hataka/codingground/master/android/YaSample/Sample011/app/src/main/java/ya/Sample011/Sample011.java");
				uri = Uri.parse(RAW_SITE + className+"/app/src/main/java/ya/"+ className+"/"+ className+".java");
			i = new Intent(Intent.ACTION_VIEW,uri);
			startActivity(i);
				Toast.makeText(this,
						"Menu0", Toast.LENGTH_SHORT).show();
				break;
			case 1:
		    // 指定したURLをWebviewに読み込む
				//uri = Uri.parse("http://192.168.1.53/f/android/YASample/Sample011/res/layout/main.xml");
				//uri = Uri.parse("https://raw.githubusercontent.com/hataka/codingground/master/android/YaSample/Sample011/app/src/main/res/layout/main.xml");
				uri = Uri.parse(GIT_SITE+ className);
				i = new Intent(Intent.ACTION_VIEW,uri);
				startActivity(i);
				Toast.makeText(this,
						"Menu0", Toast.LENGTH_SHORT).show();
				break;
		}
		return true;
	}
}