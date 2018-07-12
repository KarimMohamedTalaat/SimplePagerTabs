package com.example.karim.pager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomAdapter extends FragmentPagerAdapter {

    public CustomAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new BlankFragment();
            case 1: return new BlankFragment2();
            case 2: return new BlankFragment3();
            case 3: return new BlankFragment4();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Chapter 1";
            case 1: return "Chapter 2";
            case 2: return "Chapter 3";
            case 3: return "Chapter 4";
            default: return null;
        }
    }
}
