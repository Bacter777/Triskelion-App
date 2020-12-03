package com.bacter.tgp.models;

public class TriskelionModel
{
    private final String mTitle;
    private final String mTenets;
    private final String mCodesOfConduct;
    private final String mPrayer;
    private final String mHistory;
    private final String mPreamble;
    private final String mUrl;

    public TriskelionModel(String title, String tenets, String codesOfConduct, String prayer, String preamble, String url, String history)
    {
        mTitle = title;
        mTenets = tenets;
        mCodesOfConduct = codesOfConduct;
        mPrayer = prayer;
        mPreamble = preamble;
        mHistory = history;
        mUrl = url;
    }
    public String geTitle()
    {
        return mTitle;
    }
    public String getTenets()
    {
        return mTenets;
    }
    public String getCodesOfConduct()
    {
        return mCodesOfConduct;
    }
    public String getPrayer()
    {
        return mPrayer;
    }
    public String getmUrl()
    {
        return mUrl;
    }
    public String getPreamble()
    {
        return mPreamble;
    }
    public String getHistory()
    {
        return mHistory;
    }
}
