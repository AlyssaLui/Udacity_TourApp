package com.example.android.tourguideapp;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter{
    public CategoryAdapter(android.support.v4.app.FragmentManager fm){
        super(fm);
    }

    public int getCount(){
        return 4;
    }

    public Fragment getItem(int position){
//        switch(position){
//            case 0:
//                return new NumbersFragment();
//            case 1:
//                return new FamilyFragment();
//            case 2:
//                return new ColorsFragment();
//            case 3:
//                return new PhrasesFragment();
//            default:
//                return null;
//        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Restaurants";
            case 1:
                return "Attractions";
            case 2:
                return "Public Places";
            case 3:
                return "Events";
            default:
                return null;
        }
    }
}
