package com.bacter.tgp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bacter.tgp.R;
import com.borjabravo.readmoretextview.ReadMoreTextView;

public class TenetsActivity extends AppCompatActivity
{
    ReadMoreTextView readMoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenets);

        //TENETS #1
        ReadMoreTextView tenets1 = findViewById(R.id.tenets1);
        tenets1.setText(getString(R.string.tenets1));
        ReadMoreTextView explanation1 = findViewById(R.id.explanation1);
        explanation1.setText(getString(R.string.tenets_explanation1));
        //TENETS #2
        ReadMoreTextView tenets2 = findViewById(R.id.tenets2);
        tenets2.setText(getString(R.string.tenets2));
        ReadMoreTextView explanation2 = findViewById(R.id.explanation2);
        explanation2.setText(getString(R.string.tenets_explanation2));
        //TENETS #3
        ReadMoreTextView tenets3 = findViewById(R.id.tenets3);
        tenets3.setText(getString(R.string.tenets3));
        ReadMoreTextView explanation3 = findViewById(R.id.explanation3);
        explanation3.setText(getString(R.string.tenets_explanation3));
        //TENETS #4
        ReadMoreTextView tenets4 = findViewById(R.id.tenets4);
        tenets4.setText(getString(R.string.tenets4));
        ReadMoreTextView explanation4 = findViewById(R.id.explanation4);
        explanation4.setText(getString(R.string.tenets_explanation4));
        //TENETS #5
        ReadMoreTextView tenets5 = findViewById(R.id.tenets5);
        tenets5.setText(getString(R.string.tenets5));
        ReadMoreTextView explanation5 = findViewById(R.id.explanation5);
        explanation5.setText(getString(R.string.tenets_explanation5));
        //TENETS #6
        ReadMoreTextView tenets6 = findViewById(R.id.tenets6);
        tenets6.setText(getString(R.string.tenets6));
        ReadMoreTextView explanation6 = findViewById(R.id.explanation6);
        explanation6.setText(getString(R.string.tenets_explanation6));
        //TENETS #7
        ReadMoreTextView tenets7 = findViewById(R.id.tenets7);
        tenets7.setText(getString(R.string.tenets7));
        ReadMoreTextView explanation7 = findViewById(R.id.explanation7);
        explanation7.setText(getString(R.string.tenets_explanation7));
        //TENETS #8
        ReadMoreTextView tenets8 = findViewById(R.id.tenets8);
        tenets8.setText(getString(R.string.tenets8));
        ReadMoreTextView explanation8 = findViewById(R.id.explanation8);
        explanation8.setText(getString(R.string.tenets_explanation8));
    }
}