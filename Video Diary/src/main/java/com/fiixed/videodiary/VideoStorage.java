package com.fiixed.videodiary;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by abell on 12/2/13.
 */
public class VideoStorage {
    private ArrayList<Video> mVideos;
    private static VideoStorage sVideoStorage;
    private Context mAppContext;

    private VideoStorage(Context appContext) {
        mAppContext = appContext;
        mVideos = new ArrayList<Video>();
        for(int i = 0; i < 100; i++) {
            Video v = new Video();
            v.setDate(v.getDate());
            v.setTags("blah blah blah");
            mVideos.add(v);
        }
    }

    public static VideoStorage get(Context c) {
        if(sVideoStorage == null) {
           sVideoStorage = new VideoStorage(c.getApplicationContext());
        }
        return sVideoStorage;
    }

    public ArrayList<Video> getVideos() {
        return mVideos;
    }
    public Video getVideo(UUID id) {
        for(Video v: mVideos) {
            if(v.getId().equals(id)) {
                return v;
            }
        }
        return null;
    }
}
