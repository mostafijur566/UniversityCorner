package com.example.universitycorner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;

public class FullScreenImage extends AppCompatActivity {

    private ImageView img;

    String value, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);
        getSupportActionBar().hide();

        img = (ImageView)findViewById(R.id.img);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            value = bundle.getString("tag");
            name = bundle.getString("name");
        }

        //.............................BUET.............................
        if(name.equals("buet"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.buet1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.buet2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.buet3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.buet4);
        }
        //.............................BUET.............................

        //.............................RUET.............................
        else if(name.equals("ruet"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.ruet1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.ruet2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.ruet3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.ruet4);
        }
        //.............................RUET.............................

        //.............................CUET.............................
        else if(name.equals("cuet"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.cuet1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.cuet2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.cuet3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.cuet4);
        }
        //.............................CUET.............................

        //.............................KUET.............................
        else if(name.equals("kuet"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.kuet1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.kuet2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.kuet3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.kuet4);
        }
        //.............................KUET.............................

        //.............................DUET.............................
        else if(name.equals("duet"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.duet1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.duet2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.duet3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.duet4);
        }
        //.............................DUET.............................
    }
}