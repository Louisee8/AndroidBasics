package com.example.android.p6;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Allow users to swipe between categories
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create a swiper that knows which category should be shown on each page
        Swiper adapter = new Swiper(getSupportFragmentManager());

        // Set the swiper onto the viewPager
        viewPager.setAdapter(adapter);

        // Set the TabLayout with the viewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}