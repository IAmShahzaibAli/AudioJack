package com.example.pocketcompanies.audiojack.FragmentPageAdapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class FragmentAdapterOne extends FragmentPagerAdapter
{
    ArrayList<Fragment> Fragments = new ArrayList<>();
    ArrayList<String>  Titles = new ArrayList<>();
    public FragmentAdapterOne(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int i)
    {
        return Fragments.get(i);
    }

    @Override
    public int getCount()
    {
        return Titles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return Titles.get(position);
    }

public void AddFragment(Fragment fragment,String title)
{
    Fragments.add(fragment);
    Titles.add(title);

}
}
