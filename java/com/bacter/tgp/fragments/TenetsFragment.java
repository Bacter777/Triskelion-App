package com.bacter.tgp.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bacter.tgp.R;

public class TenetsFragment extends Fragment
{
    private static final String TAG = "TenetsFragment";
    public static final String TENETS = "TenetsActivity";


    public static TenetsFragment newInstance(String type)
    {
        TenetsFragment fragment = new TenetsFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_tenets, container, false);
        return view;
    }
}