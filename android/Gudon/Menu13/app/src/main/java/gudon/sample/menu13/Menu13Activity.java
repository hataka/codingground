package gudon.sample.menu13;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Menu13Activity extends Activity {
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    	LinearLayout layout = new LinearLayout(this);
    	layout.setOrientation(LinearLayout.VERTICAL);
    	setContentView(layout);

    	button = new Button(this);
    	button.setText("初期状態");
    	layout.addView(button);
    }

    // Creates the menu items
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.menu, menu);
        return true;
    }

    // Handles item selections */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
		Uri uri;
		Intent i;
		
    	button.setText(String.format("menuTitle=%s",item.getTitle()));
        switch (item.getItemId()) {
        case R.id.menu_file:
        	// ここにFileが押された時の処理を記述する。
            return true;
        case R.id.menu_edit:
        	// ここにEditが押された時の処理を記述する。
            return true;
        case R.id.menu_help:
        	// ここにHelpが押された時の処理を記述する。
            return true;
        case R.id.menu_file_new:
        	// ここにnewが押された時の処理を記述する。
            return true;
        case R.id.menu_file_open:
        	// ここにopenが押された時の処理を記述する。
            return true;
        case R.id.menu_file_save:
        	// ここにsaveが押された時の処理を記述する。
            return true;
        case R.id.menu_edit_undo:
        	// ここにundoが押された時の処理を記述する。
            return true;
        case R.id.menu_edit_redo:
        	// ここにredoが押された時の処理を記述する。
            return true;
            
        case R.id.website:
			// 指定したURLをWebviewに読み込む
			uri = Uri.parse("http://ichitcltk.hustle.ne.jp/gudon/modules/pico_rd/index.php?content_id=59");
			i = new Intent(Intent.ACTION_VIEW,uri);
			startActivity(i);
			Toast.makeText(this,
					"Menu0", Toast.LENGTH_SHORT).show();
	           return true;
        }
        return false;
    }
}
