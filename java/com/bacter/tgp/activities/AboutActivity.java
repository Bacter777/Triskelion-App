package com.bacter.tgp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bacter.tgp.R;
import com.bacter.tgp.helper.BacterHelper;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        BacterHelper.with(this).loadAbout();
    }
}