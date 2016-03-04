package com.cste.nstu06.suvro.dhrubotara;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity  {
    ViewPager pager;
    DummyAdapter adapter;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.textView);
        final ActionBar actionBar = getSupportActionBar();

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);


        adapter = new DummyAdapter(getSupportFragmentManager());

        pager = (ViewPager) findViewById(R.id.pager);

        pager.setAdapter(adapter);

        pager.startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));

        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                actionBar.selectTab(actionBar.getTabAt(position));
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
                // TODO Auto-generated method stub

            }
        });

        actionBar.addTab(actionBar.newTab().setText("Dhrubotara")
                .setTabListener(tabListener));
        actionBar.addTab(actionBar.newTab().setText("DYDF")
                .setTabListener(tabListener));

    }

    public ActionBar.TabListener tabListener = new ActionBar.TabListener() {
        @Override
        public void onTabSelected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {
            pager.setCurrentItem(tab.getPosition());
        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {

        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {

        }

    };



    public class DummyAdapter extends FragmentPagerAdapter {

        public DummyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;

            switch (position) {
                case 0:
                    fragment = new Dhrubotara();
                    break;

                case 1:
                    fragment = new Dydf();
                    break;


                default:
                    break;
            }

            return fragment;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return 2;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId())
        {
            case R.id.menu_bookmark:
                // Single menu item is selected do something
                // Ex: launching new activity/screen or show alert message
                Toast.makeText(MainActivity.this, tv.getText(), Toast.LENGTH_SHORT).show();
                //  tv.getText();
                return true;
            case R.id.menu_save:
                Toast.makeText(MainActivity.this, "Save is under processing", Toast.LENGTH_SHORT).show();
                return true;
//            case R.id.menu_search:
//                Toast.makeText(MainActivity.this, "Search is Selected", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.menu_share:
//                Toast.makeText(MainActivity.this, "Share is Selected", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.menu_delete:
//                Toast.makeText(MainActivity.this, "Delete is Selected", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.menu_preferences:
//                Toast.makeText(MainActivity.this, "Preferences is Selected", Toast.LENGTH_SHORT).show();
//                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
