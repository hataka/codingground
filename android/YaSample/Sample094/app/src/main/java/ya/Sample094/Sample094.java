package ya.Sample094;

import android.app.*;
import android.appwidget.*;
import android.content.*;
import android.graphics.*;
import android.widget.*;

public class Sample094 extends AppWidgetProvider
{
    public void onUpdate(Context cn, AppWidgetManager am, int[] ids)
    {
        RemoteViews rv = new RemoteViews(cn.getPackageName(), R.layout.widget);
        rv.setTextViewText(R.id.SampleTextView, "MEMO");
        rv.setTextColor(R.id.SampleTextView, Color.BLACK);

        for(int i=0; i<ids.length; i++)
        {
            Intent it = new Intent(cn, Sample4Setting.class);
            it.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, ids[i]);
            PendingIntent pi = PendingIntent.getActivity(cn, ids[i], it, 0);
            rv.setOnClickPendingIntent(R.id.SampleTextView, pi);
        }
        am.updateAppWidget(ids, rv);
    }
}
