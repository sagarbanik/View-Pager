package com.b1.sagar.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.b1.sagar.viewpager.adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        setAdapter();
    }

    public void setAdapter(){
        final MyAdapter adapter = new MyAdapter(this,getSupportFragmentManager(), 3);
        viewPager.setAdapter(adapter);
    }

}
