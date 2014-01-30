package com.fiixed.videodiary;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import java.util.UUID;

public class VideoActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        UUID videoId = (UUID)getIntent().getSerializableExtra(VideoFragment.EXTRA_VIDEO_ID);
        return VideoFragment.newInstance(videoId);
    }
}
