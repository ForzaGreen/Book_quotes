package izydor.eurecom.fr.book_quotes;

import android.os.Bundle;
import android.preference.PreferenceActivity;


public class Preferences extends PreferenceActivity {
    /** Called when the activity is first created. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);
    }
}