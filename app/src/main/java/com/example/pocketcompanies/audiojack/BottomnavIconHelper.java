package com.example.pocketcompanies.audiojack;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomnavIconHelper
{
    public void enablebottombaricon(BottomNavigationViewEx bottomNavigationViewEx)
    {

        bottomNavigationViewEx.setSelectedItemId(R.id.browseicon);
    }

   MainActivity mainActivity = new MainActivity();
    FeedC feedC = new FeedC();
    My_libraryC my_libraryC = new My_libraryC();
    PlaylistC playlistC = new PlaylistC();
    SearchC searchC = new SearchC();


    public void enablenavigationclick(final Context context, BottomNavigationViewEx bottomnavigationView)
    {
        bottomnavigationView.setOnNavigationItemSelectedListener(new BottomNavigationViewEx.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.browseicon :
                        context.startActivity(new Intent(context,mainActivity.getClass()));
                        break;
                    case R.id.feedicon :
                        context.startActivity(new Intent(context,feedC.getClass()));
                        break;
                    case R.id.my_libraryicon :
                        context.startActivity(new Intent(context,my_libraryC.getClass()));
                        break;
                    case R.id.playlisticon :
                        context.startActivity(new Intent(context,playlistC.getClass()));
                        break;
                    case R.id.searchicon :
                        context.startActivity(new Intent(context,searchC.getClass()));
                        break;





                }






                return false;
            }
        });



    }















}
