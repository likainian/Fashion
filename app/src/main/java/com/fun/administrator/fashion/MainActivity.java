package com.fun.administrator.fashion;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    private ActionBar mBar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ArrayList<Fragment> list = new ArrayList<>();
    private String[] title = {"首页", "频道", "个人"};
    private MyAdapter adapter;
    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initBar();
        initData();
        initAdapter();

    }

    private void initBar() {
        setSupportActionBar(mToolbar);
        mBar = getSupportActionBar();
        mBar.setTitle("欢流视频");
        mBar.setLogo(R.mipmap.icon);
        mBar.setDisplayUseLogoEnabled(true);
        mBar.setDisplayShowHomeEnabled(true);
    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
    }

    private void initData() {
        list.add(HomeFragment.newInstance());
        list.add(ChannelFragment.newInstance());
        list.add(MineFragment.newInstance());
    }

    private void initAdapter() {
        adapter = new MyAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);
        mTabLayout.setTabTextColors(getResources().getColor(R.color.black), getResources().getColor(R.color.orange));
        mTabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.orange));
        mTabLayout.setupWithViewPager(mViewPager);
    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return title[position];
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem shop = menu.add(0, 1, 1, "");
        shop.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        shop.setIcon(R.drawable.icon_home_shop_unclick);
        MenuItem download = menu.add(0, 2, 2, "");
        download.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        download.setIcon(R.drawable.icon_home_download);
        MenuItem history = menu.add(0, 3, 3, "");
        history.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        history.setIcon(R.drawable.icon_home_watch_history);
        MenuItem search = menu.add(0, 4, 4, "");
        search.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        search.setIcon(R.drawable.icon_home_search);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                item.setIcon(R.drawable.icon_home_shop);
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "4", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}
