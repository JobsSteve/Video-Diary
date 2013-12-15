package com.fiixed.videodiary;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abell on 12/15/13.
 */
public class VideoListFragment extends ListFragment {
    private ArrayList<Video> mVideos;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.app_name);
        mVideos = VideoStorage.get(getActivity()).getVideos();

        VideoAdapter adapter = new VideoAdapter(mVideos);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Video video = ((VideoAdapter)getListAdapter()).getItem(position);
    }

    private class VideoAdapter extends ArrayAdapter<Video> {

        public VideoAdapter(ArrayList<Video> videos) {
            super(getActivity(), 0,  videos);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //If we are not given a view, inflate one
            if(convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.row, null);
            }

            //Configure the view for the video
            Video v = getItem(position);

            ImageView vidImageView = (ImageView)convertView.findViewById(R.id.vidImageView);

            TextView dateTextView = (TextView)convertView.findViewById(R.id.listViewDateTimeTextView);
            dateTextView.setText(v.getDate().toString());

            TextView tagsTextView = (TextView)convertView.findViewById(R.id.listViewTagTextView);
            tagsTextView.setText(v.getTags());

            return convertView;
        }
    }
}
