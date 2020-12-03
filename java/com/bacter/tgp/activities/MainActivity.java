package com.bacter.tgp.activities;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.bacter.tgp.R;
import com.bacter.tgp.utils.ViewPagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
{
    Button tab_tenets,tab_codesOfConduct,tab_prayer,tab_history,tab_preamble;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView toolbarText = findViewById(R.id.toolbar_text);
        toolbarText.setText(R.string.app_name);

        tab_tenets = findViewById(R.id.tab_tenets);
        tab_codesOfConduct = findViewById(R.id.tab_codesofconduct);
        tab_prayer = findViewById(R.id.tab_prayer);
        tab_preamble = findViewById(R.id.tab_preamble);
        tab_history = findViewById(R.id.tab_history);

        tab_tenets.setOnClickListener(this::onTabButtonClick);
        tab_codesOfConduct.setOnClickListener(this::onTabButtonClick);
        tab_prayer.setOnClickListener(this::onTabButtonClick);
        tab_preamble.setOnClickListener(this::onTabButtonClick);
        tab_history.setOnClickListener(this::onTabButtonClick);

        ViewPager viewPager = findViewById(R.id.pager_main);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),this));

        BottomNavigationView bottom_navigation = findViewById(R.id.bottom_navigation);
        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                if (item.getItemId() == R.id.action_home)
                {
                    //TODO
                    return true;
                }
                if (item.getItemId() == R.id.action_triskelion)
                {
                    //TODO
                    return true;
                }
                if (item.getItemId() == R.id.action_settings)
                {
                    //TODO
                    return true;
                }
                if (item.getItemId() == R.id.action_profile)
                {
                    aboutApp();
                    return true;
                }
                if (item.getItemId() == R.id.action_exit)
                {
                    exitApp();
                }
                return false;
            }
        });
    }
    public void aboutApp()
    {
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);
    }
    public void exitApp()
    {
        AlertDialog.Builder MagAhukNata = new AlertDialog.Builder(this);
        MagAhukNata.setTitle(R.string.app_name);
        MagAhukNata.setIcon(R.drawable.alert_icon);
        MagAhukNata.setCancelable(false);
        MagAhukNata.setMessage("Are you sure you want to exit?");
        MagAhukNata.setPositiveButton("QUIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.this.finish();
            }
        });
        MagAhukNata.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"CANCELLED",Toast.LENGTH_SHORT).show();
            }
        });
        MagAhukNata.show();
        MagAhukNata.create();
    }
    @SuppressWarnings("DuplicateBranchesInSwitch")
    @SuppressLint("NonConstantResourceId")
    public void onTabButtonClick(View view)
    {
        Intent intent;
        switch (view.getId())
        {
            case R.id.tab_tenets:
                intent = new Intent(this,TenetsActivity.class);
                startActivity(intent);
                break;
            case R.id.tab_codesofconduct:
                intent = new Intent(this,CodesOfConductActivity.class);
                startActivity(intent);
                break;
            case R.id.tab_preamble:
                intent = new Intent(this,PreambleActivity.class);
                startActivity(intent);
                break;
            case R.id.tab_history:
                //TODO
                break;
            case R.id.tab_prayer:
                //TODO
                break;
            default:
                intent = null;
        }
    }
}