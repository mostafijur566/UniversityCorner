package com.example.universitycorner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class AboutUs extends AppCompatActivity {

    private Animation bottomAnim;

    private LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setTitle("About Us");

        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        mainLayout = (LinearLayout)findViewById(R.id.mainLayout);

        mainLayout.setAnimation(bottomAnim);
    }
}