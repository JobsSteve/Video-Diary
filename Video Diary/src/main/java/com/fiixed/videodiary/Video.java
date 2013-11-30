package com.fiixed.videodiary;

import java.util.Date;
import java.util.UUID;

/**
 * Created by abell on 11/30/13.
 */
public class Video {
    private UUID mId;
    private String mtags;
    private Date mDate;

    public Video() {
        //generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTags() {
        return mtags;
    }

    public void setTags(String tags) {
        this.mtags = tags;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }
}
