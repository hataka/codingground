package gudon.sample.surfaceview02;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class SurfaceView02Activity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(new CustomSurfaceView(this));
	}
}

class CustomSurfaceView extends SurfaceView implements SurfaceHolder.Callback {

	private static final float rectWidth = 50;
	private static final float rectHeight = 50;

	private float x0 = 0, y0 = 0;
	private float dx = 0, dy = 0;
	private float xOffset = 0, yOffset = 0;

	public CustomSurfaceView(Context context) {
		super(context);

		setFocusable(true);
		getHolder().addCallback(this);
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		// SurfaceViewが変化（画面の大きさ，ピクセルフォーマット）した時のイベントの処理を記述
	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		// SurfaceViewが作成された時の処理（初期画面の描画等）を記述
		doDraw(holder);
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		// SurfaceViewが廃棄された時の処理を記述
	}

	private void doDraw(SurfaceHolder holder) {
		Canvas canvas = holder.lockCanvas();
		onDraw(canvas);
		holder.unlockCanvasAndPost(canvas);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawColor(Color.BLACK);

		Paint paint = new Paint();
		paint.setColor(Color.GREEN);
		canvas.drawRect(xOffset + dx, yOffset + dy, xOffset + dx + rectWidth,
				yOffset + dy + rectHeight, paint);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_DPAD_LEFT:
			xOffset--;
			break;
		case KeyEvent.KEYCODE_DPAD_RIGHT:
			xOffset++;
			break;
		case KeyEvent.KEYCODE_DPAD_UP:
			yOffset--;
			break;
		case KeyEvent.KEYCODE_DPAD_DOWN:
			yOffset++;
			break;
		default:
			return true;
		}
		doDraw(getHolder());
		return true;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		float x = event.getX();
		float y = event.getY();
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			x0 = x;
			y0 = y;
			break;
		case MotionEvent.ACTION_MOVE:
			dx = x - x0;
			dy = y - y0;
			break;
		case MotionEvent.ACTION_UP:
			xOffset += (x - x0);
			yOffset += (y - y0);
			dx = 0;
			dy = 0;
			break;
		default:
			return true;
		}
		doDraw(getHolder());
		return true;
	}
}

/*
import android.app.Activity;
import android.os.Bundle;

public class SurfaceView02Activity extends Activity {
    / ** Called when the activity is first created. * /
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
*/