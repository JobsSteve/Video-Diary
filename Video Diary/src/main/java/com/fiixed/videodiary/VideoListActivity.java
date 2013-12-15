package com.fiixed.videodiary;

import android.support.v4.app.Fragment;

/**
 * Created by abell on 12/15/13.
 */
public class VideoListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new VideoListFragment();
    }
}
