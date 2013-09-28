package kinreiboku.tomorrow.botter;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.view.Menu;

public class MainActivity extends PreferenceActivity implements OnPreferenceClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	    // PreferenceScreenからのIntent
	    PreferenceScreen nextMove1 = (PreferenceScreen) this.findPreference(this.getString(R.string.screen_key));
	    nextMove1.setOnPreferenceClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onPreferenceClick(Preference preference) {
        // Activityの遷移
        Intent nextActivity = new Intent(
        		MainActivity.this,
                TweetEditListActivity.class);

        startActivity(nextActivity);
        return true;
	}

}
