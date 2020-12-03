package com.bacter.tgp.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bacter.tgp.R;

public class PrayerFragment extends Fragment {

    private static final String TAG = "PrayerFragment";
    public static final String PRAYER = "PrayerActivity";

    public static PreambleFragment newInstance(String type) {
        PreambleFragment fragment = new PreambleFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_prayer, container, false);
        return view;
    }
}