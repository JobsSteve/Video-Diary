package com.fiixed.videodiary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

/**
 * Created by abell on 1/31/14.
 */
public class VideoPagerActivity extends FragmentActivity {
    private ViewPager mViewPager;
    private ArrayList<Video> mVideos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewPager = new ViewPager(this);
        mViewPager.setId(R.id.viewPager);
        setContentView(mViewPager);

        mVideos = VideoStorage.get(this).getVideos();

        FragmentManager fm = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentPagerAdapter(fm) {
            @Override
            public Fragment getItem(int i) {
                Video video = mVideos.get(i);
                return new VideoFragment().newInstance(video.getId());
            }

            @Override
            public int getCount() {
                return mVideos.size();
            }
        });
    }
}
