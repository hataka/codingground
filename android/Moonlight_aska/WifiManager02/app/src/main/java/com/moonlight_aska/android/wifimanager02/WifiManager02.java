package com.moonlight_aska.android.wifimanager02;

import java.util.List;
import android.app.ListActivity;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class WifiManager02 extends ListActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		WifiManager manager = (WifiManager)getSystemService(WIFI_SERVICE);
		if(manager.getWifiState() == WifiManager.WIFI_STATE_ENABLED) {
			// APをスキャン
			manager.startScan();
			// スキャン結果を取得
			List<ScanResult> apList = manager.getScanResults();
			String[] aps = new String[apList.size()];
			for(int i=0; i<apList.size(); i++) {
				aps[i] = "SSID:" + apList.get(i).SSID + "\n" 
					+ apList.get(i).frequency + "MHz " + apList.get(i).level + "dBm";
			}
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, aps);
			setListAdapter(adapter);
		}
	}
}