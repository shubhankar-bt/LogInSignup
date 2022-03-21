package com.shubhankarsanket.test;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter {
    private final int totalTabs;

    public LoginAdapter(@NonNull FragmentManager fm, int totalTabs) {
        super(fm);
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 1) {
            return new SignupTabFragment();
        }
        return new LoginTabFragment();

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
