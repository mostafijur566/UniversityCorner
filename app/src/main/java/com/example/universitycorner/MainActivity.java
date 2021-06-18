package com.example.universitycorner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    private Animation leftAnim;
    private Animation rightAnim;

    private CardView engineering;
    private CardView medical;
    private CardView agricultural;
    private CardView general;
    private CardView national;
    private CardView pvt;
    private CardView scTech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        engineering = (CardView)findViewById(R.id.engineering);
        medical = (CardView)findViewById(R.id.medical);
        agricultural = (CardView)findViewById(R.id.agricultural);
        general = (CardView)findViewById(R.id.general);
        national = (CardView)findViewById(R.id.national);
        pvt = (CardView)findViewById(R.id.pvt);
        scTech = (CardView)findViewById(R.id.scTech);

        leftAnim = AnimationUtils.loadAnimation(this,R.anim.side_animation);
        rightAnim = AnimationUtils.loadAnimation(this, R.anim.right_side_animation);

        engineering.setAnimation(leftAnim);
        medical.setAnimation(rightAnim);
        agricultural.setAnimation(leftAnim);
        general.setAnimation(rightAnim);
        scTech.setAnimation(leftAnim);
        national.setAnimation(rightAnim);
        pvt.setAnimation(leftAnim);

        engineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VarsityList.class);
                intent.putExtra("tag","engineering");
                startActivity(intent);
            }
        });

        medical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VarsityList.class);
                intent.putExtra("tag","medical");
                startActivity(intent);
            }
        });

        agricultural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VarsityList.class);
                intent.putExtra("tag","agricultural");
                startActivity(intent);
            }
        });

        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VarsityList.class);
                intent.putExtra("tag","general");
                startActivity(intent);
            }
        });

        national.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VarsityList.class);
                intent.putExtra("tag","national");
                startActivity(intent);
            }
        });

        scTech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VarsityList.class);
                intent.putExtra("tag","tech");
                startActivity(intent);
            }
        });

        pvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VarsityList.class);
                intent.putExtra("tag","pvt");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.about)
        {
            Intent intent = new Intent(MainActivity.this, AboutUs.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}