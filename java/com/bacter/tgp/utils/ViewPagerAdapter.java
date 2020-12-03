package com.bacter.tgp.utils;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.bacter.tgp.fragments.CodesOfConductFragment;
import com.bacter.tgp.fragments.HistoryFragment;
import com.bacter.tgp.fragments.PrayerFragment;
import com.bacter.tgp.fragments.PreambleFragment;
import com.bacter.tgp.fragments.TenetsFragment;


public class ViewPagerAdapter extends FragmentStatePagerAdapter
{
    private static final int PAGE_COUNT = 5;
    private final TenetsFragment mTenetsFragment;
    private final CodesOfConductFragment mCodesOfConduct;
    private final PreambleFragment mHistoryFragment;
    private final PreambleFragment mPreambleFragment;
    private final PreambleFragment mPrayerFragment;
    private final Context mContext;

    @SuppressWarnings("deprecation")
    public ViewPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
        mTenetsFragment = TenetsFragment.newInstance(TenetsFragment.TENETS);
        mCodesOfConduct = CodesOfConductFragment.newInstance(CodesOfConductFragment.CODES_OF_CONDUCT);
        mHistoryFragment = HistoryFragment.newInstance(HistoryFragment.HISTORY);
        mPreambleFragment = PreambleFragment.newInstance(PreambleFragment.PREAMBLE);
        mPrayerFragment = PrayerFragment.newInstance(PrayerFragment.PRAYER);
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return mTenetsFragment;
            case 1:
                return mCodesOfConduct;
            case 2:
                return mPreambleFragment;
            case 3:
                return mPrayerFragment;
            case 4:
                return mHistoryFragment;
        }
        return null;
    }
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

}
