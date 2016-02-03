package com.startingandroid.tabslayout;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button simple_tabs, scrollable_tabs, icon_tabs, text_icons_tabs, custom_icon_tabs;
    private Toolbar toolbar;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        clickListners();
    }

    public void initialize() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        simple_tabs = (Button) findViewById(R.id.simple_tabs);
        scrollable_tabs = (Button) findViewById(R.id.scrollable_tabs);
        icon_tabs = (Button) findViewById(R.id.icons_tabs);
        text_icons_tabs = (Button) findViewById(R.id.text_icon_tabs);
        custom_icon_tabs = (Button) findViewById(R.id.custom_icons_tabs);
    }

    public void clickListners() {
        simple_tabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SimpleTabsActivity.class);
                startActivity(i);
            }
        });
        scrollable_tabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ScrollableTabsActivity.class);
                startActivity(i);
            }
        });
        icon_tabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, IconTabsActivity.class);
                startActivity(i);
            }
        });
        text_icons_tabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, IconTextTabsActivity.class);
                startActivity(i);
            }
        });
        custom_icon_tabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CustomViewIconTextTabsActivity.class);
                startActivity(i);
            }
        });
    }
}
