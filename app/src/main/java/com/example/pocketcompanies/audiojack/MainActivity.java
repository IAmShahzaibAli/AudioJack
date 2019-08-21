package com.example.pocketcompanies.audiojack;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import com.example.pocketcompanies.audiojack.FragmentPageAdapter.FragmentAdapterOne;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity  {
    TabLayout tab;
    ViewPager pageview;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // BrowseTabDesign();
        enablebottombar();






    }


    public void enablebottombar()
    {
           BottomNavigationViewEx bottomNavigation = (BottomNavigationViewEx)findViewById(R.id.Bottomnavbar);
           BottomnavIconHelper bottomnavIconHelper = new BottomnavIconHelper();
           bottomnavIconHelper.enablebottombaricon(bottomNavigation);
           bottomnavIconHelper.enablenavigationclick(MainActivity.this,bottomNavigation);
           Menu menu = bottomNavigation.getMenu();

           MenuItem menuItem = menu.getItem(0);
           menuItem.setChecked(true);


    }

    public void BrowseTabDesign() {

        tab = (TabLayout) findViewById(R.id.toolbar_id);
        pageview = (ViewPager) findViewById(R.id.Viewpager_id);
        FragmentAdapterOne fragmentAdapterOne = new FragmentAdapterOne(getSupportFragmentManager());
        fragmentAdapterOne.AddFragment(new trending(), "Trending");
        fragmentAdapterOne.AddFragment(new topsongs(), "Top Songs");
        fragmentAdapterOne.AddFragment(new topalbum(), "Top Albums");

        tab.setupWithViewPager(pageview);
        actionBar = getSupportActionBar();
        pageview.setAdapter(fragmentAdapterOne);


    }
}