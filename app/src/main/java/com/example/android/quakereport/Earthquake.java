package com.example.android.quakereport;

/**
 * Created by Aishwarya on 20-12-2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMilliSeconds, String url)
    {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliSeconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation()
    {
        return mLocation;
    }


    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }

}
