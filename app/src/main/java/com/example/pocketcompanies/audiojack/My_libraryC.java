package com.example.pocketcompanies.audiojack;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class My_libraryC extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.my_libraryc,container,false);
        BottomNavigationViewEx bottomNavigation = (BottomNavigationViewEx)v.findViewById(R.id.Bottomnavbar);
        BottomnavIconHelper bottomnavIconHelper = new BottomnavIconHelper();
        bottomnavIconHelper.enablebottombaricon(bottomNavigation);
        bottomnavIconHelper.enablenavigationclick(v.getContext(),bottomNavigation);

        return v;
    }
}