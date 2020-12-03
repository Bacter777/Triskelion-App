package com.bacter.tgp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bacter.tgp.R;

public class CodesOfConductFragment extends Fragment
{
    public static final String CODES_OF_CONDUCT ="CodesOfConductFragment";


    public static CodesOfConductFragment newInstance(String type)
    {
        CodesOfConductFragment fragment = new CodesOfConductFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_codes_of_conduct, container, false);
        return view;
    }

}