package com.chananya.recipes;

import com.chananya.recipes.adapter.FullScreenImageAdapter;
import com.chananya.recipes.helper.Utils;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FullScreenViewActivity extends AppCompatActivity {

    private Utils utils;
    private ViewPager viewPager;
    private FullScreenImageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_view);

        utils = new Utils(this);
        viewPager = findViewById(R.id.pager);
        adapter = new FullScreenImageAdapter(this, utils.getFilePaths());
        viewPager.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        int pos = getIntent().getIntExtra("position", 0);
        viewPager.setCurrentItem(pos);
    }
}
