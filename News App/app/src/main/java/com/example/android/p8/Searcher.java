package com.example.android.p8;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.ver2point0.android.thegreatestnews.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Searcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    public static class NewsPreferenceFragment extends PreferenceFragment implements Preference.OnPreferenceChangeListener {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.layout.search_main);
            Preference contentNewsPreference = findPreference(getString(R.string.search_content_key));
            bindPreferenceSummaryToValuwe(contentNewsPreference);
            Preference sectionNewsPreference = findPreference(getString(R.string.search_section_key));
            bindPreferenceSummaryToValuwe(sectionNewsPreference);
            Preference tagNewsPreference = findPreference(getString(R.string.search_tag_key));
            bindPreferenceSummaryToValuwe(tagNewsPreference);
            Preference startDatePreference = findPreference(getString(R.string.start_date_key));
            bindPreferenceSummaryToValuwe(startDatePreference);
            Preference endDatePreference = findPreference(getString(R.string.end_date_key));
            bindPreferenceSummaryToValuwe(endDatePreference);
        }

        @Override
        public boolean onPreferenceChange(Preference preference, Object object) {
            String stringValue = object.toString();
            switch (preference.getOrder()) {
                case 3:
                case 4:
                    if (isValidDate(stringValue) && !stringValue.equals("")) {
                        Toast.makeText(getActivity(), getString(R.string.wrong_data_format), Toast.LENGTH_LONG).show();
                    }
                    break;
            }
            preference.setSummary(stringValue);
            return true;
        }

        public static boolean isValidDate(String inDate) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            try {
                dateFormat.parse(inDate.trim());
            } catch (ParseException pe) {
                return true;
            }
            return false;
        }

        private void bindPreferenceSummaryToValuwe(Preference preference) {
            preference.setOnPreferenceChangeListener(this);
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(preference.getContext());
            String preferenceString = preferences.getString(preference.getKey(), "");
            onPreferenceChange(preference, preferenceString);
        }
    }
}