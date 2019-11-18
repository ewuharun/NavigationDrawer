package com.example.navigationdashboard;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class TabAdapter extends FragmentStatePagerAdapter {
    int count_tab;

    public TabAdapter(FragmentManager fm,int count_tab) {
        super(fm);
        this.count_tab=count_tab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                TabOne tabOne=new TabOne();
                return tabOne;
            case 1:
                TabTwo tabTwo=new TabTwo();
                return tabTwo;

                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return count_tab;
    }
}
