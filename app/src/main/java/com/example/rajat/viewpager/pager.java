package com.example.rajat.viewpager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class pager extends FragmentStatePagerAdapter {
    public pager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        if(position==0){
            fragment = new fragA();
        }else if(position==1){
            fragment = new fragB();
        }else if(position==2){
            fragment = new frag3();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if(position==0){
            return "Tab 1";
        }
        else if(position==1){
            return "Tab 2";
        }

        else if (position==2){
            return "Tab 3";
        }


        return null;

        }
}
