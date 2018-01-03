package com.example.android.p6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/*** Provides the appropriate {@link Fragment} for each view*/

class Swiper extends FragmentPagerAdapter {
    private String tabTitles[] = new String[]{"@strings/sights", "@strings/musea", "@strings/restaurants", "@strings/party"};

   Swiper(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsActivity();
        } else if (position == 1) {
            return new MuseaActivity();
        } else if (position == 2) {
            return new RestaurantsActivity();
        } else {
            return new PartyActivity();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}