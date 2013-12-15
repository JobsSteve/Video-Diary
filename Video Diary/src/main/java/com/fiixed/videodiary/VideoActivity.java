package com.fiixed.videodiary;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class VideoActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new VideoFragment();
    }
}
