package com.example.universitycorner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    //variable for overview
    private TextView varsityName, year, student, hall, department, nickName, location, campus, faculty1, facultyDepartment, overviewTxt1;

    //variable for Faculties
    private TextView faculty2, faculty3, faculty4, faculty5, faculty6, faculty7, faculty8, faculty9, faculty10, faculty11, faculty12, faculty13;

    //variable for all department
    private TextView faculty1txt1;
    private TextView faculty2txt1;
    private TextView faculty3txt1;
    private TextView faculty4txt1;
    private TextView faculty5txt1;
    private TextView faculty6txt1, faculty7txt1, faculty8txt1, faculty9txt1, faculty10txt1, faculty11txt1, faculty12txt1, faculty13txt1;

    private ScrollView scrl;

    //variable for contact info
    private TextView email, mobile, webAddress;

    //layoutVariable
    private LinearLayout overViewLayout, facultyDepartmentLayout;

    //animation variable
    private Animation rightSideAnim, leftSideAnim;

    //image variable
    private ImageView img1, img2, img3, img4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //animation variable casting
        rightSideAnim = AnimationUtils.loadAnimation(this,R.anim.right_side_animation);
        leftSideAnim = AnimationUtils.loadAnimation(this, R.anim.side_animation);

        //titlebar and layout variable casting
        varsityName = (TextView)findViewById(R.id.varsityName);
        overViewLayout = (LinearLayout)findViewById(R.id.overViewLayout);
        facultyDepartmentLayout = (LinearLayout)findViewById(R.id.facultyDepartmentLayout);

        //animation set
        varsityName .setAnimation(leftSideAnim);
        overViewLayout.setAnimation(rightSideAnim);
        facultyDepartmentLayout.setAnimation(leftSideAnim);

        scrl = (ScrollView)findViewById(R.id.scrl);

        overviewTxt1 = (TextView)findViewById(R.id.overviewTxt1);


        year = (TextView)findViewById(R.id.year);
        student = (TextView)findViewById(R.id.student);
        hall = (TextView)findViewById(R.id.hall);
        department = (TextView)findViewById(R.id.department);
        nickName = (TextView)findViewById(R.id.nickName);
        location = (TextView)findViewById(R.id.location);
        campus = (TextView)findViewById(R.id.campus);

        //Contact info variable casting
        email = (TextView)findViewById(R.id.email);
        mobile = (TextView)findViewById(R.id.mobile);
        webAddress = (TextView)findViewById(R.id.webAddress);

        facultyDepartment = (TextView)findViewById(R.id.facultyDepartment);

        faculty1 = (TextView)findViewById(R.id.faculty1);
        faculty2 = (TextView)findViewById(R.id.faculty2);
        faculty3 = (TextView)findViewById(R.id.faculty3);
        faculty4 = (TextView)findViewById(R.id.faculty4);
        faculty5 = (TextView)findViewById(R.id.faculty5);
        faculty6 = (TextView)findViewById(R.id.faculty6);
        faculty7 = (TextView)findViewById(R.id.faculty7);
        faculty8 = (TextView)findViewById(R.id.faculty8);
        faculty9 = (TextView)findViewById(R.id.faculty9);
        faculty10 = (TextView)findViewById(R.id.faculty10);
        faculty11 = (TextView)findViewById(R.id.faculty11);
        faculty12 = (TextView)findViewById(R.id.faculty12);
        faculty13 = (TextView)findViewById(R.id.faculty13);

        faculty1txt1 = (TextView)findViewById(R.id.faculty1txt1);

        faculty2txt1 = (TextView)findViewById(R.id.faculty2txt1);

        faculty3txt1 = (TextView)findViewById(R.id.faculty3txt1);

        faculty4txt1 = (TextView)findViewById(R.id.faculty4txt1);

        faculty5txt1 = (TextView)findViewById(R.id.faculty5txt1);

        faculty6txt1 = (TextView)findViewById(R.id.faculty6txt1);

        faculty7txt1 = (TextView)findViewById(R.id.faculty7txt1);

        faculty8txt1 = (TextView)findViewById(R.id.faculty8txt1);

        faculty9txt1 = (TextView)findViewById(R.id.faculty9txt1);

        faculty10txt1 = (TextView)findViewById(R.id.faculty10txt1);

        faculty11txt1 = (TextView)findViewById(R.id.faculty11txt1);

        faculty12txt1 = (TextView)findViewById(R.id.faculty12txt1);

        faculty13txt1 = (TextView)findViewById(R.id.faculty13txt1);

        img1 = (ImageView)findViewById(R.id.img1);
        img2 = (ImageView)findViewById(R.id.img2);
        img3 = (ImageView)findViewById(R.id.img3);
        img4 = (ImageView)findViewById(R.id.img4);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null)
        {
            String value = bundle.getString("tag");

            //...............................Engineering University..............................

            //BUET
            if(value.equals("BUET"))
            {
                getSupportActionBar().setTitle("BUET");
                webAddress.setMovementMethod(LinkMovementMethod.getInstance());

                scrl.setBackgroundResource(R.drawable.engineering_background);

                year.setText("1876");

                faculty1.setText("01. Faculty of Electrical and Electronic:");
                faculty1txt1.setText("1. Department of Electrical and Electronic Engineering (EEE)\n2. Department of Computer Science and Engineering (CSE)");

                faculty2.setText("02. Faculty of Architecture and Planning:");
                faculty2txt1.setText("1. Department of Architecture (Arch)\n2. Department of Urban and Regional Planning (URP)\n3. Department of Humanities (Hum)");

                faculty3.setText("03. Faculty of Civil Engineering:");
                faculty3txt1.setText("1. Department of Civil Engineering (CE)\n2. Department of Water Resources Engineering (WRE)");

                faculty4.setText("04. Faculty of Mechanical Engineering:");
                faculty4txt1.setText("1. Department of Mechanical Engineering (ME)\n2. Department of Industrial and Production Engineering (IPE)\n3. Department of Naval Architecture and Marine Engineering (NAME)");

                faculty5.setText("05. Faculty of Engineering:");
                faculty5txt1.setText("1. Department of Chemical Engineering (ChE)\n2. Department of Materials and Metallurgical Engineering (MME)\n3. Department of Chemistry (Chem)" +
                        "\n4. Department of Mathematics (Math)\n5. Department of Physics (Phys)\n6. Department of Petroleum and Mineral Resources Engineering (PMRE)" +
                        "\n7. Department of Glass and Ceramic Engineering (GCE)");

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);

                img1.setBackgroundResource(R.drawable.buet1);
                img2.setBackgroundResource(R.drawable.buet2);
                img3.setBackgroundResource(R.drawable.buet3);
                img4.setBackgroundResource(R.drawable.buet4);

                img1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img1");
                        intent.putExtra("name", "buet");
                        startActivity(intent);
                    }
                });

                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img2");
                        intent.putExtra("name", "buet");
                        startActivity(intent);
                    }
                });

                img3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img3");
                        intent.putExtra("name", "buet");
                        startActivity(intent);
                    }
                });

                img4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img4");
                        intent.putExtra("name", "buet");
                        startActivity(intent);
                    }
                });
            }

            //RUET
            else if(value.equals("RUET"))
            {
                getSupportActionBar().setTitle("RUET");
                scrl.setBackgroundResource(R.drawable.engineering_background);
                varsityName.setText("Rajshahi University of Engineering and Technology");
                year.setText("1964");
                student.setText("3,654(+-)");
                hall.setText("7");
                nickName.setText("RUET");
                location.setText("Rajshahi, Bangladesh");
                campus.setText("Urban, 152 acres");

                email.setText("registrar@ruet.ac.bd");
                mobile.setText("+88 (0721) 750105");
                webAddress.setText("www.ruet.ac.bd");

                faculty1.setText("01. Faculty of Mechanical Engineering:");
                faculty1txt1.setText("1. Department of Industrial and Production Engineering (IPE)\n2. Department of Glass and Ceramic Engineering (GCE)\n3. Department of Mechatronics Engineering (MTE)" +
                        "\n4. Department of Mechanical Engineering (ME)\n5. Department of Material Science and Engineering (MSE)\n6. Department of Chemical and Food Process Engineering (CFPE)");

                faculty2.setText("02. Faculty of Civil Engineering:");
                faculty2txt1.setText("1. Department of Civil Engineering (CE)\n2. Department of Urban and Regional Planning (URP)\n3. Department of Architecture (Arch)\n4. Department of Building Engineering and Construction Management (BECM)");

                faculty3.setText("03. Faculty of Electrical and Computer Engineering:");
                faculty3txt1.setText("1. Department of Computer Science and Engineering (CSE)\n2. Department of Electrical and Electronic Engineering (EEE)\n3. Department of Electrical and Computer Engineering (ECE)" +
                        "\n4. Department of Electronics and Telecommunication Engineering (ETE)");

                faculty4.setText("04. Faculty of Applied Science and Engineering:");
                faculty4txt1.setText("1. Department of Chemistry (Chem)\n2. Department of Mathematics (Math)\n3. Department of Physics (Phy)\n4. Department of Humanities (Hum)");

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);

                img1.setBackgroundResource(R.drawable.ruet1);
                img2.setBackgroundResource(R.drawable.ruet2);
                img3.setBackgroundResource(R.drawable.ruet3);
                img4.setBackgroundResource(R.drawable.ruet4);

                img1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img1");
                        intent.putExtra("name", "ruet");
                        startActivity(intent);
                    }
                });

                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img2");
                        intent.putExtra("name", "ruet");
                        startActivity(intent);
                    }
                });

                img3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img3");
                        intent.putExtra("name", "ruet");
                        startActivity(intent);
                    }
                });

                img4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img4");
                        intent.putExtra("name", "ruet");
                        startActivity(intent);
                    }
                });
            }

            //CUET
            else if(value.equals("CUET"))
            {
                getSupportActionBar().setTitle("CUET");
                scrl.setBackgroundResource(R.drawable.engineering_background);
                varsityName.setText("Chittagong University of Engineering and Technology");
                year.setText("1968");
                student.setText("4,500(+-)");
                hall.setText("5");
                department.setText("15");
                nickName.setText("CUET");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Suburban, 188 acres");

                email.setText("iict@cuet.ac.bd");
                mobile.setText("+88031714946, +880-31-714911");
                webAddress.setText("www.cuet.ac.bd");

                faculty1.setText("01. Faculty of Electrical and Computer Engineering:");
                faculty1txt1.setText("1. Department of Electrical and Electronic Engineering (EEE)\n2. Department of Computer Science and Engineering (CSE)\n3. Department of Electronic and Telecommunication Engineering (ETE)");

                faculty2.setText("02. Faculty of Civil Engineering:");
                faculty2txt1.setText("1. Department of Civil Engineering (CE)\n2. Department of Civil and Water Resource Engineering (CWRE)\n3. Department of Disaster and Environmental Engineering (DEE)");

                faculty3.setText("03. Faculty of Mechanical Engineering:");
                faculty3txt1.setText("1. Department of Mechanical Engineering (ME)\n2. Department of Petroleum and Mining Engineering (PME)\n3. Department of Mechatronics and Industrial Engineering (MIE)");

                faculty4.setText("04. Faculty of Architecture and Planning:");
                faculty4txt1.setText("1. Department of Architecture and Engineering (AE)\n2. Department of Urban and Regional Planning (URP)\n3. Department of Humanities (Hum)");

                faculty5.setText("05. Faculty of Engineering and Technology:");
                faculty5txt1.setText("1. Department of Physics (Phy)\n2. Department of Mathematics (Math)\n3. Department of Chemistry (Chm)");

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);

                img1.setBackgroundResource(R.drawable.cuet1);
                img2.setBackgroundResource(R.drawable.cuet2);
                img3.setBackgroundResource(R.drawable.cuet3);
                img4.setBackgroundResource(R.drawable.cuet4);

                img1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img1");
                        intent.putExtra("name", "cuet");
                        startActivity(intent);
                    }
                });

                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img2");
                        intent.putExtra("name", "cuet");
                        startActivity(intent);
                    }
                });

                img3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img3");
                        intent.putExtra("name", "cuet");
                        startActivity(intent);
                    }
                });

                img4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img4");
                        intent.putExtra("name", "cuet");
                        startActivity(intent);
                    }
                });
            }

            //KUET
            else if(value.equals("KUET"))
            {
                getSupportActionBar().setTitle("KUET");
                scrl.setBackgroundResource(R.drawable.engineering_background);
                varsityName.setText("Khulna University of Engineering and Technology");
                year.setText("1967");
                student.setText("4,280(+-)");
                hall.setText("7");
                department.setText("19");
                nickName.setText("KUET");
                location.setText("Khulna, Bangladesh");
                campus.setText("Suburban, 101 acres");

                email.setText("info@kuet.ac.bd");
                mobile.setText("+8804176946875");
                webAddress.setText("www.kuet.ac.bd");

                faculty1.setText("01. Faculty of Civil Engineering:");
                faculty1txt1.setText("1. Department of Civil Engineering (CE)\n2. Department of Urban and Regional Planning (URP)\n3. Department of Building Engineering and Construction Management (BECM)" +
                        "\n4. Department of Architecture (AE)\n5. Department of Mathematics (Math)\n6. Department of Chemistry (Chm)");

                faculty2.setText("02. Faculty of Electrical and Electronic Engineering:");
                faculty2txt1.setText("1. Department of Electrical and Electronic Engineering (EEE)\n2. Department of Computer Science and Engineering (CSE)\n3. Department of Electronics and Communication Engineering (ECE)" +
                        "\n4. Department of Material Science and Engineering (MSE)\n5. Department of Biomedical Engineering (BME)");

                faculty3.setText("03. Faculty of Mechanical Engineering:");
                faculty3txt1.setText("1. Department of Mechanical Engineering (ME)\n2. Department of Industrial Engineering and Management (IEM)\n3. Department of Leather Engineering (LE)" +
                        "4. Department of Textile Engineering (TE)\n5. Department of Energy Science and Engineering (ESE)");

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);

                img1.setBackgroundResource(R.drawable.kuet1);
                img2.setBackgroundResource(R.drawable.kuet2);
                img3.setBackgroundResource(R.drawable.kuet3);
                img4.setBackgroundResource(R.drawable.kuet4);

                img1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img1");
                        intent.putExtra("name", "kuet");
                        startActivity(intent);
                    }
                });

                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img2");
                        intent.putExtra("name", "kuet");
                        startActivity(intent);
                    }
                });

                img3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img3");
                        intent.putExtra("name", "kuet");
                        startActivity(intent);
                    }
                });

                img4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img4");
                        intent.putExtra("name", "kuet");
                        startActivity(intent);
                    }
                });
            }

            //DUET
            else if(value.equals("DUET"))
            {
                getSupportActionBar().setTitle("DUET");
                scrl.setBackgroundResource(R.drawable.engineering_background);
                varsityName.setText("Dhaka University of Engineering and Technology");
                year.setText("1980");
                student.setText("2,200(+-)");
                hall.setText("7");
                department.setText("11");
                nickName.setText("DUET");
                location.setText("Gazipur, Bangladesh");
                campus.setText("Urban, 20.29 acres (Main campus) 4 acres (Affiliated campus)");

                email.setText("reg_duet@duet.ac.bd");
                mobile.setText("+88-02-49274003");
                webAddress.setText("www.duet.ac.bd");

                faculty1.setText("01. Faculty of Civil Engineering:");
                faculty1txt1.setText("1. Department of Civil Engineering (CE)\n2. Department of Architecture (AE)\n3. Department of Chemistry (Chm)\n4. Department of Physics (Phy)" +
                        "\n5. Department of Mathematics (Math)");

                faculty2.setText("02. Faculty of Electrical and Electronic Engineering:");
                faculty2txt1.setText("1. Department of Electrical and Electronic Engineering (EEE)\n2. Department of Computer Science and Engineering (CSE)");

                faculty3.setText("03. Faculty of Mechanical Engineering:");
                faculty3txt1.setText("1. Department of Mechanical Engineering (ME)\n2. Department of Textile Engineering (TE)\n3. Department of Industrial and Production Engineering (IPE)" +
                        "\n4. Department of Humanities (Hum)");

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);

                img1.setBackgroundResource(R.drawable.duet1);
                img2.setBackgroundResource(R.drawable.duet2);
                img3.setBackgroundResource(R.drawable.duet3);
                img4.setBackgroundResource(R.drawable.duet4);

                img1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img1");
                        intent.putExtra("name", "duet");
                        startActivity(intent);
                    }
                });

                img2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img2");
                        intent.putExtra("name", "duet");
                        startActivity(intent);
                    }
                });

                img3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img3");
                        intent.putExtra("name", "duet");
                        startActivity(intent);
                    }
                });

                img4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(DetailsActivity.this, FullScreenImage.class);
                        intent.putExtra("tag", "img4");
                        intent.putExtra("name", "duet");
                        startActivity(intent);
                    }
                });
            }

            //...............................Engineering University..............................

            //...............................Medical college..............................

            //Chittagong Medical College
            else if(value.equals("CMC")) {
                getSupportActionBar().setTitle("CMC");
                scrl.setBackgroundResource(R.drawable.medical_background);

                overviewTxt1.setText("Public, Medical");

                varsityName.setText("Chittagong Medical College");
                year.setText("1957");
                student.setText("1,050(+-)");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("CMC");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Urban");

                email.setText("cmc@ac.dghs.gov.bd");
                mobile.setText("+88-031-619400");
                webAddress.setText("www.cmc.gov.bd");

                facultyDepartment.setVisibility(View.GONE);

                faculty1.setVisibility(View.GONE);
                faculty1txt1.setVisibility(View.GONE);

                faculty2.setVisibility(View.GONE);
                faculty2txt1.setVisibility(View.GONE);

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Chittagong Medical University
            else if(value.equals("CMU")) {
                getSupportActionBar().setTitle("CMU");
                scrl.setBackgroundResource(R.drawable.medical_background);

                overviewTxt1.setText("Government Medical University");

                varsityName.setText("Chittagong Medical University");
                year.setText("2016");
                student.setText("N/A");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("CMU");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Urban");

                email.setText("info@cmu.edu.bd");
                mobile.setText("+88031-2780430, +88031-2780428");
                webAddress.setText("www.cmu.edu.bd");

                facultyDepartment.setVisibility(View.GONE);

                faculty1.setVisibility(View.GONE);
                faculty1txt1.setVisibility(View.GONE);

                faculty2.setVisibility(View.GONE);
                faculty2txt1.setVisibility(View.GONE);

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Chittagong International Medical College
            else if(value.equals("CIMCH")) {
                getSupportActionBar().setTitle("CIMCH");
                scrl.setBackgroundResource(R.drawable.medical_background);

                overviewTxt1.setText("Private, Medical");

                varsityName.setText("Chittagong International Medical College");
                year.setText("N/A");
                student.setText("N/A");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("CIMCH");
                location.setText("Chittagong, Bangladesh");
                campus.setText("N/A");

                email.setText("info.cimchbd@gmail.com");
                mobile.setText("+88031672062");
                webAddress.setText("www.cimch.edu.bd");

                facultyDepartment.setVisibility(View.GONE);

                faculty1.setVisibility(View.GONE);
                faculty1txt1.setVisibility(View.GONE);

                faculty2.setVisibility(View.GONE);
                faculty2txt1.setVisibility(View.GONE);

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Army Medical College Chittagong
            else if(value.equals("AMC")) {
                getSupportActionBar().setTitle("AMC");
                scrl.setBackgroundResource(R.drawable.medical_background);

                overviewTxt1.setText("Military medical college");

                varsityName.setText("Army Medical College Chittagong");
                year.setText("2014");
                student.setText("250");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("AMC");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Urban");

                email.setText("N/A");
                mobile.setText("+8803125-80425");
                webAddress.setText("N/A");

                facultyDepartment.setVisibility(View.GONE);

                faculty1.setVisibility(View.GONE);
                faculty1txt1.setVisibility(View.GONE);

                faculty2.setVisibility(View.GONE);
                faculty2txt1.setVisibility(View.GONE);

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);

            }

            //Southern Medical College
            else if(value.equals("SMC")) {
                getSupportActionBar().setTitle("SMC");
                scrl.setBackgroundResource(R.drawable.medical_background);

                overviewTxt1.setText("Private, Medical");

                varsityName.setText("Southern Medical College");
                year.setText("N/A");
                student.setText("N/A");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("SMC");
                location.setText("Chittagong, Bangladesh");
                campus.setText("N/A");

                email.setText("mdsmch1946@gmail.com");
                mobile.setText("+88031-685075-8");
                webAddress.setText("www.smchctgbd.com");

                facultyDepartment.setVisibility(View.GONE);

                faculty1.setVisibility(View.GONE);
                faculty1txt1.setVisibility(View.GONE);

                faculty2.setVisibility(View.GONE);
                faculty2txt1.setVisibility(View.GONE);

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Marine City Medical College
            else if(value.equals("MCMC")) {
                getSupportActionBar().setTitle("MCMC");
                scrl.setBackgroundResource(R.drawable.medical_background);

                overviewTxt1.setText("Private, Medical");

                varsityName.setText("Marine City Medical College");
                year.setText("2013");
                student.setText("N/A");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("MCMC");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Urban");

                email.setText("mcmchedu@gmail.com");
                mobile.setText("+88-031-258-1040");
                webAddress.setText("www.mcmchedu.com");

                facultyDepartment.setVisibility(View.GONE);

                faculty1.setVisibility(View.GONE);
                faculty1txt1.setVisibility(View.GONE);

                faculty2.setVisibility(View.GONE);
                faculty2txt1.setVisibility(View.GONE);

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //University of Science and Technology
            else if(value.equals("USTC")) {
                getSupportActionBar().setTitle("USTC");
                scrl.setBackgroundResource(R.drawable.medical_background);

                overviewTxt1.setText("Private, Medical");

                varsityName.setText("University of Science and Technology");
                year.setText("1989");
                student.setText("4203");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("USTC");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Urban");

                email.setText("registrar@ustc.ac.bd\nrecrutement@ustc.ac.bd");
                mobile.setText("+88031-659070-71");
                webAddress.setText("www.ustc.ac.bd");

                facultyDepartment.setVisibility(View.GONE);

                faculty1.setVisibility(View.GONE);
                faculty1txt1.setVisibility(View.GONE);

                faculty2.setVisibility(View.GONE);
                faculty2txt1.setVisibility(View.GONE);

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //...............................Medical college..............................

            //...............................Agricultural and Others..............................

            //Bangladesh Agricultural University
            else if(value.equals("BAU")) {
                getSupportActionBar().setTitle("BAU");
                scrl.setBackgroundResource(R.drawable.agriculature_background);

                overviewTxt1.setText("Public, Agricultural");

                varsityName.setText("Bangladesh Agricultural University");
                year.setText("1961");
                student.setText("5400(+-)");
                hall.setText("13");
                department.setText("45");
                nickName.setText("BAU");
                location.setText("Mymensingh, Bangladesh");
                campus.setText("Rural, 1261 acres");

                email.setText("registrar@bau.edu.bd");
                mobile.setText("+880-91-66846");
                webAddress.setText("www.bau.edu.bd");

                faculty1.setText("01. Faculty of Agricultural Engineering and Technology:");
                faculty1txt1.setText("1. Department of Farm Structure and Environmental Engineering\n2. Department of Farm Power And Machinery\n3. Department of Irrigation and Water Management" +
                        "\n4. Department of Food Technology and Rural Industries\n5. Department of Computer Science and Mathematics");

                faculty2.setText("02. Faculty of Veterinary Science:");
                faculty2txt1.setText("1. Department of Anatomy and Histology\n2. Department of Physiology\n3. Department of Microbiology and Hygiene" +
                        "\n4. Department of Pharmacology\n5. Department of Parasitology\n6. Department of Pathology\n7. Department of Medicine\n8. Department of Surgery and Obstetrics");

                faculty3.setText("03. Faculty of Agricultural:");
                faculty3txt1.setText("1. Department of Agronomy\n2. Department of Soil Science\n3. Department of Entomology\n4. Department of Horticulture" +
                        "\n5. Department of Pathology\n6. Department of Botany\n7. Department of Genetics and Plant Breeding\n8. Department of Agricultural Extension Education" +
                        "\n9. Department of Agricultural Chemistry\n10. Department of Biochemistry and Molecular Biology\n11. Department of Physics\n12. Department of Chemistry" +
                        "\n13. Department of Languages\n14. Department of Agroforestry\n15. Department of Biotechnology\n16. Department of Environmental Science" +
                        "\n17. Department of Seed Science and Technology");

                faculty4.setText("04. Faculty of Animal Husbandry:");
                faculty4txt1.setText("1. Department of Animal Breeding and Genetics\n2. Department of Animal Science\n3. Department of Animal Nutrition\n4. Department of Poultry Science" +
                        "\n5. Department of Dairy Science");

                faculty5.setText("05. Faculty of Agricultural Economics and Rural Sociology:");
                faculty5txt1.setText("1. Department of Agricultural Economics\n2. Department of Agricultural Finance\n3. Department of Agricultural Statistics" +
                        "\n4. Department of Agribusiness and Marketing\n5. Department of Rural Sociology");

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Bangabandhu Sheikh Mujibur Rahman Agricultural University
            else if(value.equals("BSMRAU")) {
                getSupportActionBar().setTitle("BSMRAU");
                scrl.setBackgroundResource(R.drawable.agriculature_background);

                overviewTxt1.setText("Public, Agricultural");

                varsityName.setText("Bangabandhu Sheikh Mujibur Rahman Agricultural University");
                year.setText("1998");
                student.setText("1400(+-)");
                hall.setText("4");
                department.setText("36");
                nickName.setText("BSMRAU");
                location.setText("Salna, Gazipur, Bangladesh");
                campus.setText("Rural, 187 acres");

                email.setText("registrar@bsmrau.edu.bd");
                mobile.setText("+88029205323");
                webAddress.setText("www.bsmrau.edu.bd");

                faculty1.setText("01. Faculty of Agricultural:");
                faculty1txt1.setText("1. Agricultural Extension and Rural Development\n2. Agroforestry and Environment\n3. Agronomy\n4. Agricultural Engineering" +
                        "\n5. Agro-processing\n6. Biochemistry and Molecular Biology\n7. Environmental Science\n8. Biotechnology\n9. Computer Science and Information" +
                        "\n10. Crop Botany\n11. Entomology\n12. Horticulture\n13. Plant Pathology\n14. Genetics and Breeding\n15. Soil Science" +
                        "\n16. Seed Science and Technology Unit");

                faculty2.setText("02. Faculty of Fisheries:");
                faculty2txt1.setText("1. Department of Aquaculture\n2. Fisheries Biology and Aquatic Environment\n3. Fisheries Management" +
                        "\n4. Fisheries Technology\n5. Genetics and Fish Breeding");

                faculty3.setText("03. Faculty of Veterinary Medicine and Animal Science:");
                faculty3txt1.setText("1. Department of Agronomy and Histology\n2. Department of Animal Breeding and Genetics\n3. Department of Animal Science and Nutrition\n4. Department of Diary and Poultry Science" +
                        "\n5. Department of Gynecology and Reproductive Health\n6. Department of Medicine\n7. Department of Micro-biology and Public Health\n8. Department of Pathobiology" +
                        "\n9. Department of Physiology and Pharmacology\n10. Department of Surgery and Radiology");

                faculty4.setText("04. Faculty of Agricultural Economics and Rural Development:");
                faculty4txt1.setText("1. Department of Agricultural Economics\n2. Department of Agribusiness\n3. Department of Agricultural Finance and Cooperatives\n4. Department of Rural Development" +
                        "\n5. Department of Statistics");

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Sher-e-Bangla Agricultural University
            else if(value.equals("SAU")) {
                getSupportActionBar().setTitle("SAU");
                scrl.setBackgroundResource(R.drawable.agriculature_background);

                overviewTxt1.setText("Public, Agricultural");

                varsityName.setText("Sher-e-Bangla Agricultural University");
                year.setText("2001");
                student.setText("3300(+-)");
                hall.setText("5");
                department.setText("36");
                nickName.setText("SAU");
                location.setText("Sher-e-Bangla Nagar, Dhaka, Bangladesh");
                campus.setText("Rural, 187 acres");

                email.setText("info@sau.edu.bd");
                mobile.setText("+880244914001");
                webAddress.setText("www.sau.edu.bd");

                faculty1.setText("01. Faculty of Agricultural:");
                faculty1txt1.setText("1. Department of Agricultural Botany\n2. Department of Agricultural Chemistry\n3. Department of Agricultural Extension and Information System\n4. Department of Agroforestry and Environmental" +
                        "\n5. Department of Agronomy\n6. Department of Biochemistry\n7. Department of Biotechnology\n8. Department of Genetics and Plant Breeding\n9. Department of Entomology" +
                        "\n10. Department of Horticulture\n11. Department of Plant Pathology\n12. Department of Soil Science\n13. Department of Fisheries\n14. Department of Agricultural Engineering\n15. Department of Language");

                faculty2.setText("02. Faculty of Agribusiness Management:");
                faculty2txt1.setText("1. Department of Agricultural Economics\n2. Fisheries Agribusiness and Marketing\n3. Department of Agricultural Statistics" +
                        "\n4. Department of Development and Poverty Studies\n5. Department of Management and Finance");

                faculty3.setText("03. Faculty of Veterinary Medicine and Animal Science:");
                faculty3txt1.setText("1. Department of Agronomy and Histology\n2. Department of Animal Breeding and Genetics\n3. Department of Animal Science and Nutrition\n4. Department of Diary and Poultry Science" +
                        "\n5. Department of Gynecology and Reproductive Health\n6. Department of Medicine\n7. Department of Micro-biology and Public Health\n8. Department of Pathobiology" +
                        "\n9. Department of Physiology and Pharmacology\n10. Department of Surgery and Radiology");

                faculty4.setText("04. Faculty of Animal Science and Veterinary Medicine:");
                faculty4txt1.setText("1. Department of Animal Nutrition, Genetics and Breeding\n2. Department of Animal Prodcution and Management\n3. Department of Anatomy, Histology and Physiology\n4. Department of Poultry Science" +
                        "\n5. Department of Microbiology and Parasitology\n6. Department of Dairy Science\n7. Department of Medicine and Public Health\n8. Department of Pathology" +
                        "\n9. Department of Pharmacology and Toxicology\n10. Department of Surgery and Theriogenology");

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Sylhet Agricultural University
            else if(value.equals("StAU")) {
                getSupportActionBar().setTitle("StAU");
                scrl.setBackgroundResource(R.drawable.agriculature_background);

                overviewTxt1.setText("Public, Agricultural");

                varsityName.setText("Sylhet Agricultural University");
                year.setText("2006");
                student.setText("2000(+-)");
                hall.setText("5");
                department.setText("47");
                nickName.setText("StAU");
                location.setText("Sylhet, Bangladesh");
                campus.setText("Urban, 50 acres");

                email.setText("registrarsau2013@gmail.com");
                mobile.setText("+88-0821-760930");
                webAddress.setText("www.sau.ac.bd");

                faculty1.setText("01. Faculty of Veterinary and Animal:");
                faculty1txt1.setText("1. Department of Anatomy and Histology\n2. Department of Physiology\n3. Department of Pharmacology and Toxicology\n4. Department of Dairy Science" +
                        "\n5. Department of Poultry Science\n6. Department of Genetics and Animal Breeding\n7. Department of Animal Nutrition\n8. Department of Livestock Production and Management\n9. Department of Pathology" +
                        "\n10. Department of Parasitology\n11. Department of Microbiology and Immunology\n12. Department of Public Health and Hygiene\n13. Department of Medicine\n14. Department of Surgery and Theriogenology");

                faculty2.setText("02. Faculty of Agriculture:");
                faculty2txt1.setText("1. Department of Agronomy and Hawor Agriculture\n2. Department of Soil Science\n3. Department of Crop Botany" +
                        "\n4. Department of Genetics and Plant Breeding\n5. Department of Horticulture\n6. Department of Plant Pathology and Seed Science" +
                        "\n7. Department of Entomology\n8. Department of Agricultural Extension Education\n9. Department of Biotechnology and Genetic Engineering" +
                        "\n10. Department of Agroforestry and Environmental Science\n11. Department of Agricultural Chemistry\n12. Department of Agronomy and Seed Science" +
                        "\n13. Department of Language\n14. Department of Tea Production and Technology");

                faculty3.setText("03. Faculty of Fisheries:");
                faculty3txt1.setText("1. Department of Fish Biology and Genetics\n2. Department of Aquaculture\n3. Department of Aquatic Resource Management\n4. Department of Fisheries Technology and Quality" +
                        "\n5. Department of Coastal and Marine Fisheries\n6. Department of Fish health Management");

                faculty4.setText("04. Faculty of Agricultural Economics and Business Studies:");
                faculty4txt1.setText("1. Department of Agricultural and Policy\n2. Department of Agricultural Marketing and Business Management\n3. Department of Agricultural Fiance and Banking\n4. Department of Agricultural Statistics" +
                        "\n5. Department of Agricultural Statistics");

                faculty5.setText("05. Faculty of Agricultural Engineering and Technology:");
                faculty5txt1.setText("1. Department of Farm Power Machinery\n2. Department of Irrigation and Water Management\n3. Department of Computer Science and Engineering\n4. Department of Agricultural Construction and Environment Engineering" +
                        "\n5. Department of Food Engineering and Technology");

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Chittagong Veterinary and Animal Science University
            else if(value.equals("CVASU"))
            {
                getSupportActionBar().setTitle("CVASU");
                scrl.setBackgroundResource(R.drawable.agriculature_background);

                overviewTxt1.setText("Public, Veterinary");

                varsityName.setText("Chittagong Veterinary and Animal Science University");
                year.setText("2006");
                student.setText("870(+-)");
                hall.setText("2");
                department.setText("18");
                nickName.setText("CVASU");
                location.setText("Khulsi, Chittagong, Bangladesh");
                campus.setText("Urban");

                email.setText("registrarcvasu@gmail.com");
                mobile.setText("+88-02334466153");
                webAddress.setText("www.cvasu.ac.bd");

                faculty1.setText("01. Faculty of Veterinary Medicine:");
                faculty1txt1.setText("1. Department of Anatomy and Histology\n2. Department of Animal Science and Nutrition\n3. Department of Agricultural Economics and Science\n4. Department of Dairy nad Poultry Science" +
                        "\n5. Department of Genetics and Animal Breeding\n6. Department of Medicine and Surgery\n7. Department of Microbiology and Veterinary Public\n8. Department of Pathology and Parasitology\n9. Department of Physiology, Biochemistry and Pharmacology");

                faculty2.setText("02. Faculty of Food Science and Technology:");
                faculty2txt1.setText("1. Department of Applied Chemistry and Chemical Technology\n2. Department of Physical and Mathematical Science\n3. Department of Applied Food Science and Nutrition" +
                        "\n4. Department of Food Processing and Engineering");

                faculty3.setText("03. Faculty of Fisheries:");
                faculty3txt1.setText("1. Department of Aquaculture\n2. Department of Fisheries Resources Management\n3. Department of Fishing and Post Harvest Technology\n4. Department of Marine Bio-Resources Science" +
                        "\n5. Department of Fish Biology and Biotechnology");

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Bangladesh University of Textile Engineering
            else if(value.equals("BUTex")) {
                getSupportActionBar().setTitle("BUTex");
                scrl.setBackgroundResource(R.drawable.agriculature_background);

                overviewTxt1.setText("Public, Textile");

                varsityName.setText("Bangladesh University of Textile Engineering");
                year.setText("1921");
                student.setText("1880(+-)");
                hall.setText("3");
                department.setText("14");
                nickName.setText("BUTex");
                location.setText("Tejgaon Industrial Area, Dhaka, Bangladesh");
                campus.setText("Urban, 50 acres");

                email.setText("info@butex.edu.bd");
                mobile.setText("+88 02 58151788");
                webAddress.setText("www.butex.edu.bd");

                faculty1.setText("01. Faculty of Textile Engineering:");
                faculty1txt1.setText("1. Department of Yarn Engineering(YE)\n2. Department of Fabric Engineering (FE)");

                faculty2.setText("02. Faculty of Textile Chemical Engineering:");
                faculty2txt1.setText("1. Department of Wet Process Engineering (WPE)\n2. Department of Dyes and Chemical Engineering (DCE)");

                faculty3.setText("03. Faculty of Fashion Design and Apparel Engineering:");
                faculty3txt1.setText("1. Department of Apparel Engineering (AE)\n2. Department of Textile Fashion and Design");

                faculty4.setText("04. Faculty of Textile Management and Business Studies:");
                faculty4txt1.setText("1. Department of Textile Engineering Management (TEM)\n2. Department of Department of Industrial and Production Engineering (IPE)");

                faculty5.setText("05. Faculty of Science and Engineering:");
                faculty5txt1.setText("1. Department of Textile Machinery Design and Maintenance (TMDM)\n2. Department of Physics( Phy)\n3. Department of Chemistry (Chem)\n4. Department of Mathematics and Statistics (Math)" +
                        "\n5. Department of Applied Science (AS)\n6. Department of Humanities and Social Sciences (HSS)");

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Textile Engineering College, Chittagong
            else if(value.equals("CTEC")) {
                getSupportActionBar().setTitle("CTEC");
                scrl.setBackgroundResource(R.drawable.agriculature_background);

                overviewTxt1.setText("Public, Textile");

                varsityName.setText("Textile Engineering College, Chittagong");
                year.setText("1980");
                student.setText("420");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("CTEC");
                location.setText("Zorargonj, Mirsharai, Chittagong, Bangladesh");
                campus.setText("Suburb");

                email.setText("N/A");
                mobile.setText("N/A");
                webAddress.setText("N/A");

                faculty1.setVisibility(View.GONE);
                faculty1txt1.setText("1. BSc in Textile Engineering (major in Apparel Merchandising)\n2. BSc in Textile Engineering (major in Fabric Technology)" +
                        "\n3. BSc in Textile Engineering (major in Wet Processing)\n4. BSc in Textile Engineering (major in Yarn Technology)");

                faculty2.setVisibility(View.GONE);
                faculty2txt1.setVisibility(View.GONE);

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Textile Engineering College, Noakhali
            else if(value.equals("TECN")) {
                getSupportActionBar().setTitle("TECN");
                scrl.setBackgroundResource(R.drawable.agriculature_background);

                overviewTxt1.setText("Public, Textile");

                varsityName.setText("Textile Engineering College, Noakhali");
                year.setText("2006");
                student.setText("480");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("TECN");
                location.setText("Begumganj Upazila, Noakhali, Bangladesh");
                campus.setText("Suburb");

                email.setText("N/A");
                mobile.setText("+8801400-959640");
                webAddress.setText("www.tecn.gov.bd");

                faculty1.setVisibility(View.GONE);
                faculty1txt1.setText("1. BSc in Textile Engineering (major in Apparel Engineering)\n2. BSc in Textile Engineering (major in Fabric Engineering)" +
                        "\n3. BSc in Textile Engineering (major in Wet Processing Engineering)\n4. BSc in Textile Engineering (major in Yarn Engineering)");

                faculty2.setVisibility(View.GONE);
                faculty2txt1.setVisibility(View.GONE);

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Pabna Textile Engineering College
            else if(value.equals("PTEC")) {
                getSupportActionBar().setTitle("PTEC");
                scrl.setBackgroundResource(R.drawable.agriculature_background);

                overviewTxt1.setText("Public, Textile");

                varsityName.setText("Pabna Textile Engineering College");
                year.setText("2006");
                student.setText("480");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("PTEC");
                location.setText("Pabna, Bangladesh");
                campus.setText("Urban");

                email.setText("info@pabtec.gov.bd");
                mobile.setText("+880-0731-66103");
                webAddress.setText("www.pabtec.gov.bd");

                faculty1.setVisibility(View.GONE);
                faculty1txt1.setText("1. Department of Wet Process Engineering\n2. Department of Fabric Engineering" +
                        "\n3. Department of Yarn Engineering\n4. Department of Apparel Engineering");

                faculty2.setVisibility(View.GONE);
                faculty2txt1.setVisibility(View.GONE);

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Bangobondhu Textile Engineering College
            else if(value.equals("BTEC")) {
                getSupportActionBar().setTitle("BTEC");
                scrl.setBackgroundResource(R.drawable.agriculature_background);

                overviewTxt1.setText("Public, Textile");

                varsityName.setText("Bangobondhu Textile Engineering College");
                year.setText("2007");
                student.setText("420");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("BTEC");
                location.setText("Kalihati, Bangladesh");
                campus.setText("Suburban 11.5 acres (4.7 ha)");

                email.setText("info@btec.gov.bd");
                mobile.setText("+8801733-192418");
                webAddress.setText("www.btec.gov.bd");

                faculty1.setVisibility(View.GONE);
                faculty1txt1.setText("1. Department of Wet Process Engineering\n2. Department of Fabric Manufacturing and Weaving and Knitting" +
                        "\n3. Department of Yarn Engineering\n4. Department of Garments Manufacturing");

                faculty2.setVisibility(View.GONE);
                faculty2txt1.setVisibility(View.GONE);

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //...............................Agricultural and Others..............................

            //...............................General University..............................

            //DU
            else if(value.equals("DU")) {
                getSupportActionBar().setTitle("DU");
                scrl.setBackgroundResource(R.drawable.public_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("University of Dhaka");
                year.setText("1921");
                student.setText("30,015(+-)");
                hall.setText("23");
                department.setText("70");
                nickName.setText("DU");
                location.setText("Dhaka, Bangladesh");
                campus.setText("Urban, 240 hectares (600 acres)");

                email.setText("registrar@du.ac.bd");
                mobile.setText("+88-09666911463");
                webAddress.setText("www.du.ac.bd");

                faculty1.setText("01. Faculty of Arts:");
                faculty1txt1.setText("1. Department of Bangla\n2. Department of English\n3. Department of Persian Language and Literature\n4. Department of Philosophy" +
                        "\n5. Department of History\n6. Department of Arabic\n7. Department of Islamic Studies\n8. Department of Islamic History and Culture\n9. Department of Sanskrit" +
                        "\n10. Department of Information Science and Library Management\n11. Department of Language Science\n12. Department of Theater and Performance Studies" +
                        "\n13. Department of World Religions and Culture\n14. Department of Pali and Buddhist Studies\n15. Department of Urdu\n16. Department of Linguistics");

                faculty2.setText("02. Faculty of Business Studies:");
                faculty2txt1.setText("1. Department of Management Studies\n2. Department of Accounting & Information Systems\n3. Department of Marketing\n4. Department of Finance" +
                        "\n5. Department of Banking and Insurance\n6. Department of Management Information Systems\n7. Department of International Business\n8. Department of Tourism and Hospitality Management" +
                        "\n9. Department of Organization Strategy and Leadership");

                faculty3.setText("03. Faculty of Biological Science:");
                faculty3txt1.setText("1. Department of Soil, Water and Environment\n2. Department of Botany\n3. Department of Zoology\n4. Department of Biochemistry and Molecular Biology" +
                        "\n5. Department of Psychology\n6. Department of Microbiology\n7. Department of Fisheries\n8. Department of Medical Psychology\n9. Department of Genetic Engineering and Biotechnology" +
                        "\n10. Department of Educational Psychology ");

                faculty4.setText("04. Faculty of Engineering and Technology:");
                faculty4txt1.setText("1. Department of Electrical and Electronic Engineering\n2. Department of Applied Chemistry and Chemical Engineering\n" +
                        "\n3. Department of Computer Science & Engineering\n4. Department of Nuclear Engineering\n5. Department of Robotics and Mechatronics Engineering");

                faculty5.setText("05. Faculty of Fine Arts:");
                faculty5txt1.setText("1. Department of Drawing and Painting\n2. Department of Graphic Design\n3. Department of Printmaking\n4. Department of Oriental Art" +
                        "\n5. Department of Ceramics\n6. Department of Sculpture\n7. Department of Craft\n8. Department of History of Art");

                faculty6.setText("06. Faculty of Law:");
                faculty6txt1.setText("1. Department of Law");

                faculty7.setText("07. Faculty of Medicine");
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setText("08. Faculty of Pharmacy:");
                faculty8txt1.setText("1. Department of Pharmaceutical Chemistry\n2. Department of Clinical Pharmacy and Pharmacology\n3. Department of Pharmaceutical Technology" +
                        "\n4. Department of Pharmacy");

                faculty9.setText("09. Faculty of Science:");
                faculty9txt1.setText("1. Department of Physics\n2. Department of Mathematics\n3. Department of Chemistry\n4. Department of Biomedical Physics and Technology\n5. Department of Theoretical Physics" +
                        "\n6. Department of Applied Mathematics\n" +
                        "7. Department of Statistics\n" +
                        "8. Department of Theoretical and Computational Chemistry");

                faculty10.setText("10. Faculty of Social Sciences");
                faculty10txt1.setText("1. Department of Economics\n" +
                        "2. Department of Health Economics\n" + "3. Department of Political Science\n" + "4. Department of International Relations\n" + "5. Department of Anthropology\n" +
                        "6. Department of Public Administration\n" + "7. Department of Mass Communication and Journalism\n" + "8. Department of Communication Disorders\n" +
                        "9. Department of Printing and Publication Studies\n" + "10. Department of Television, Film and Photography\n" + "11. Department of Sociology\n" +
                        "12. Department of Development Studies\n" + "13. Department of Criminology\n" + "14. Department of Japanese Studies\n" + "15. Department of Women and Gender Studies\n" + "16.Department Of Peace and Conflict Studies");

                faculty11.setText("11. Faculty of Earth and Environmental Sciences:");
                faculty11txt1.setText("1. Department of Geography and Environment\n2. Department of Geology\n3. Department of Oceanography\n4. Department of Disaster Science and Management" +
                        "\n5. Department of Meteorology");

                faculty12.setText("12. Faculty of Education");
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setText("13. Faculty of Postgraduate Medical Sciences and Research");
                faculty13txt1.setVisibility(View.GONE);
            }

            //RU
            else if(value.equals("RU")) {
                getSupportActionBar().setTitle("RU");
                scrl.setBackgroundResource(R.drawable.public_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("University of Rajshahi");
                year.setText("1953");
                student.setText("38,291(+-)");
                hall.setText("17");
                department.setText("52");
                nickName.setText("RU");
                location.setText("Rajshahi, Bangladesh");
                campus.setText("Urban, 305 ha (753 acres)");

                email.setText("registrar@ru.ac.bd");
                mobile.setText("+880 721 750244");
                webAddress.setText("www.ru.ac.bd");

                faculty1.setText("01. Faculty of Life and Earth Science:");
                faculty1txt1.setText("1. Department of Geography and Environmental Studies\n2. Department of Psychology\n3. Department Botany" +
                        "\n4. Department of Zoology" +"\n5. Department of Geology & Mining\n6. Department of Genetic Engineering & Biotechnology\n7. Department of Clinical Psychology");

                faculty2.setText("02. Faculty of Arts:");
                faculty2txt1.setText("1. Department of Philosophy\n2. Department of History\n3. Department of English\n4. Department of Bengali" +
                        "\n5. Department of Islamic History and Culture\n6. Department of Arabic\n7. Department of Islamic Studies\n8. Department of Music" +
                        "\n9. Department of Theater\n10. Department of Persian Language and Literature\n11. Department of Urdu\n12. Department of Sanskrit");

                faculty3.setText("03.Faculty of Fine Arts:");
                faculty3txt1.setText("1. Department of Graphic design, crafts & history of art\n2. Department of Painting, printmaking & Oriental art");

                faculty4.setText("04. Faculty of Law:");
                faculty4txt1.setText("1. Department of Law, University of Rajshahi\n2. Department of Law and Land Administration");

                faculty5.setText("05. Faculty of Engineering:");
                faculty5txt1.setText("1. Department of Textile Engineering\n2. Department of Information and Communication Engineering (ICE)\n3. Department of Computer Science & Engineering\n4. Department of Applied Chemistry & Chemical Engineering" +
                        "\n5. Department of Materials Science and Engineering\n6. Department of Electrical and Electronic Engineering (EEE)");

                faculty6.setText("06. Faculty of Social Science:");
                faculty6txt1.setText("1. Department of Economics\n2. Department of Political Science\n3. Department of Social Work\n4. Department of Sociology" +
                        "\n5. Department of Mass Communication and Journalism\n6. Department of Information Science & Library Management\n7. Department of Public Administration\n8. Department of Anthropology" +
                        "\n9. Department of Folklore\n10. Department of International Relations");

                faculty7.setText("07. Faculty of Business Studies");
                faculty7txt1.setText("1. Department ofFinance\n2. Department of Accounting & Information Systems\n3. Department of Marketing\n4. Department of Management Studies" +
                        "\n5. Department of Banking & Insurance\n6. Department of Tourism & Hospitality Management");

                faculty8.setText("08. Faculty of Science:");
                faculty8txt1.setText("1. Department of Mathematics\n2. Department of Physics\n3. Department of Chemistry\n4. Department of Statistics\n5. Department of Biochemistry & Molecular Biology" +
                        "\n6. Department of Pharmacy\n" +
                        "7. Department of Population Science and Human Resource Development\n" +
                        "8. Department of Applied Mathematics\n9. Department of Physical Education and Sports Sciences");

                faculty9.setText("09. Faculty of Agriculture:");
                faculty9txt1.setText("1. Department of Agronomy and Agricultural Extension\n2. Department of Crop Science and Technology");

                faculty10.setText("10. Faculty of Medicine");
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //CU
            else if(value.equals("CU")) {
                getSupportActionBar().setTitle("CU");
                scrl.setBackgroundResource(R.drawable.public_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("University of Chittagong");
                year.setText("1966");
                student.setText("24,283(+-)");
                hall.setText("10");
                department.setText("52");
                nickName.setText("CU");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Rural, 2,110 acres (8.5 km2)");

                email.setText("registrarcu66@cu.ac.bd");
                mobile.setText("+880726311-14");
                webAddress.setText("www.cu.ac.bd");

                faculty1.setText("01. Faculty of Arts and Humanities:");
                faculty1txt1.setText("1. Department of Geography and Environmental Studies\n2. Department of Bangla\n3.Department of Philosophy" +
                        "\n4. Department of Bangladesh Studies" +"\n5. Department of History\n6. Department of Dramatics\n7. Department of Sanskrit\n8. Department of Arabic" +
                        "\n9. Department of Islamic History and Culture\n10. Department of Islamic Studies\n11. Department of Pali\n12. Department of Persian Language & Literature" +
                        "\nDepartment of Music");

                faculty2.setText("02. Faculty of Biological Sciences:");
                faculty2txt1.setText("1. Department of Soil Science\n2. Department of Botany\n3. Department of Zoology\n4. Department of Genetic Engineering and Biotechnology" +
                        "\n5. Department of Biochemistry and Molecular Biology\n6. Department of Pharmacy\n7. Department of Geography and Environmental Studies\n8. Department of Psychology" +
                        "\n9. Department of Microbiology");

                faculty3.setText("03.Faculty of Marine Science and Fisheries :");
                faculty3txt1.setText("1. Department of Oceanography\n2. Department of Fisheries");

                faculty4.setText("04. Faculty of Science:");
                faculty4txt1.setText("1. Department of Physics\n2. Department of Chemistry\n3. Department of Mathematics\n4. Department of Statistics\n5. Department of Applied Chemistry & Chemical Engineering");

                faculty5.setText("05. Faculty of Engineering:");
                faculty5txt1.setText("1. Department of Computer Science and Engineering\n2. Department of Electrical and Electronic Engineering");

                faculty6.setText("06. Faculty of Social Science:");
                faculty6txt1.setText("1. Department of International Relations\n2. Department of Public Administration\n3. Department of Economics\n4. Department of Communication and Journalism" +
                        "\n5. Department of Criminology and Police Science\n6. Department of Political Science\n7. Department of Development Studies\n8. Department of Sociology" +
                        "\n9. Department of Anthropology");

                faculty7.setText("07. Faculty of Business Administration:");
                faculty7txt1.setText("1. Department of Accounting\n2. Department of Management\n3. Department of Finance\n4. Department of Marketing" +
                        "\n5. Department of Human Resource Management\n6. Department of Banking and Insurance");

                faculty8.setText("08. Faculty of Law:");
                faculty8txt1.setText("1. Department of Law");

                faculty9.setText("09. Faculty of Education:");
                faculty9txt1.setText("1. Department of Physical Education and Sports Science");

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //JU
            else if(value.equals("JU")) {
                getSupportActionBar().setTitle("JU");
                scrl.setBackgroundResource(R.drawable.public_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Jahangirnagar University");
                year.setText("1970");
                student.setText("16,781(+-)");
                hall.setText("15");
                department.setText("34");
                nickName.setText("JU");
                location.setText("Dhaka, Bangladesh");
                campus.setText("Rural, 697.56 acres (2.8 km²)");

                email.setText("email@juniv.edu");
                mobile.setText("+8801715666191");
                webAddress.setText("www.juniv.edu");

                faculty1.setText("01. Faculty of Mathematical and Physical Science:");
                faculty1txt1.setText("1. Department of Mathematics\n2. Department of Physics\n3.Department of Computer Science and Engineering" +
                        "\n4. Department of Environmental sciences" +"\n5. Department of Chemistry\n6. Department of Statistics\n7. Department of Geological Science");

                faculty2.setText("02. Faculty of Biological Science:");
                faculty2txt1.setText("1. Department of Botany\n2. Department of Zoology\n3. Department of Biochemistry & Molecular Biology\n4. Department of Microbiology" +
                        "\n5. Department of Pharmacy\n6. Department of Public Health & Informatics\n7. Department of Biotechnology & Genetic Engineering");

                faculty3.setText("03.Faculty of Social Science :");
                faculty3txt1.setText("1. Department of Anthropology\n2. Department of Economics\n3. Department of Government and Politics\n4. Department of Geography & Environment" +
                        "\n5. Department of Public Administration\n6. Department of Urban and Regional Planning");

                faculty4.setText("04. Faculty of Arts and Humanities:");
                faculty4txt1.setText("1. Department of Bangla\n2. Department of Drama and Dramatics\n3. Department of English\n4. Department of Fine Arts\n5. Department of History" +
                        "\n6. Department of International Relations\n7. Department of Journalism & Media Studies\n8. Department of Philosophy\n9. Department of Anthropology");

                faculty5.setText("05. Faculty of Business Studies:");
                faculty5txt1.setText("1. DDepartment of Accounting and Information Systems\n2. Department of Finance & Banking\n3. Department of Marketing\n4. Department of Management Studies");

                faculty6.setText("06. Faculty of Law:");
                faculty6txt1.setText("1. Department of Law & Justice");

                faculty7.setText("07. Faculty of Business Administration:");
                faculty7txt1.setText("1. Department of Accounting\n2. Department of Management\n3. Department of Finance\n4. Department of Marketing" +
                        "\n5. Department of Human Resource Management\n6. Department of Banking and Insurance");

                faculty8.setText("08. Faculty of Law:");
                faculty8txt1.setText("1. Department of Law");

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //IU
            else if(value.equals("IU")) {
                getSupportActionBar().setTitle("IU");
                scrl.setBackgroundResource(R.drawable.public_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Islamic University");
                year.setText("1979");
                student.setText("18,000(+-)");
                hall.setText("7");
                department.setText("25");
                nickName.setText("IU");
                location.setText("Kushtia, Bangladesh");
                campus.setText("Urban, 175 acre (1.31523km²)");

                email.setText("registrar@iu.ac.bd");
                mobile.setText("+88-071-74904");
                webAddress.setText("www.iu.ac.bd");

                faculty1.setText("01. Faculty of Theology and Islamic Studies:");
                faculty1txt1.setText("1. Department of Al-Quran and Islamic Studies\n2. Department of Dawah and Islamic Studies\n3. Department of Al-Hadith and Islamic Studies");

                faculty2.setText("02. Faculty of Engineering and Technology:");
                faculty2txt1.setText("1. Department of Electrical and Electronic Engineering (EEE)\n2. Department of Computer Science and Engineering (CSE)\n3. Department of Applied Chemistry and Chemical Engineering (ACCE)\n4. Department of Information and Communication Technology (ICT)" +
                        "\n5. Department of Biomedical Engineering (BME)\n6. Department of Nuclear Engineering (NE)\n7. Department of Materials Science and Engineering (MSE)" +
                        "\n8. Department of Explosives Engineering (ExE)\n9. Department of Aeronautical Engineering (AE)\n Department of Petroleum and Mineral Resources Engineering (PMRE)");

                faculty3.setText("03. Faculty of Biological Sciences:");
                faculty3txt1.setText("1. Department of Biotechnology and Genetic Engineering (BTGE)\n2. Department of Applied Nutrition and Food Technology (ANFT)\n3. Department of Pharmacy\n4. Department of Public health (PH)" +
                        "\n5. Department of Microbiology (MB)\n6. Department of  \tBiochemistry and Molecular Biology (BMB)");

                faculty4.setText("04.Faculty of Sciences:");
                faculty4txt1.setText("1. Department of Mathematics\n2. Department of Statistics\n3. Department of Environmental Science & Geography\n4. Department of Chemistry\n5. Department of Physics" +
                        "\n6. Department of Botany\n7. Department of Zoology\n8. Department of Physical Education and Sports Science\n9. Department of Geology and Mining\n10. Disaster Management");

                faculty5.setText("05. Faculty of Business Administration:");
                faculty5txt1.setText("1. Department of Accounting and Information Systems (AIS)\n2. Department of Management (MGT)\n3. Department of Marketing\n4. Department of Finance and Banking (FAB)" +
                        "\n5. Department of Human Resources Management (HRM)\n6. Department of Tourism and Hospitality Management (THM)\n7. Department of Banking and Insurance\n8. Department of International Business" +
                        "\n9. Department of Management Information System (MIS)");

                faculty6.setText("06. Faculty of Arts:");
                faculty6txt1.setText("1. Department of Arabic Language and Literature\n2. Department of Bengali\n3. Department of English" +
                        "\n4. Department of Islamic History and Culture\n5. Department of Fine Arts\n6. Department of Philosophy\n7. Department of Linguistics\n8. Department of Theater and Performing Arts" +
                        "\n9. Department of Music\n10. Department of History\n11. Department of World Religions");

                faculty7.setText("07. Faculty of Law:");
                faculty7txt1.setText("1. Department of Law\n2. Department of Al-Fiqh and Legal Studies\n3. Department of Law and Land Management");

                faculty8.setText("08. Faculty of Social Sciences:");
                faculty8txt1.setText("1. Department of  Economics\n2. Department of Public Administration\n3. Department of Political Science\n4. Department of  \tFolklore Studies" +
                        "\n5. Department of Development Studies\n6. Department of  Social Welfare\n7. Department of  International Relations\n8. Department of Sociology" +
                        "\n9. Department of  Anthropology\n10. Department of Mass Communication & Journalism");

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //KU
            else if(value.equals("KU")) {
                getSupportActionBar().setTitle("KU");
                scrl.setBackgroundResource(R.drawable.public_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Khulna University");
                year.setText("1991");
                student.setText("6,965(+-)");
                hall.setText("5");
                department.setText("26");
                nickName.setText("KU");
                location.setText("Khulna, Bangladesh");
                campus.setText("Urban, 106 acres (43 ha)");

                email.setText("registrar@ku.ac.bd");
                mobile.setText("+88-041-751040");
                webAddress.setText("www.ku.ac.bd");

                faculty1.setText("01. Life Science (LS) School:");
                faculty1txt1.setText("1. Agrotechnology (AT) Discipline\n2. Biotechnology and Genetic Engineering (BGE) Discipline\n3. Environmental Science (ES) Discipline" +
                        "\n4. Fisheries and Marine Resources Technology (FMRT) Discipline\n5. Forestry and Wood Technology (FWT) Discipline \n6. Pharmacy (PHARM) Discipline" +
                        "\n7. Soil, Water and Environment (SWE) Discipline");

                faculty2.setText("02. Science, Engineering and Technology (SET) School:");
                faculty2txt1.setText("1. Architecture (ARCH) Discipline\n2. Chemistry (CHEM) Discipline\n3. Computer Science and Engineering (CSE) Discipline\n4. Electronics and Communication Engineering (ECE) Discipline" +
                        "\n5. Mathematics (MATH) Discipline\n6. Physics (PHY) Discipline\n7. Statistics (STAT) Discipline" +
                        "\n8. Urban and Rural Planning (URP) Discipline");

                faculty3.setText("03. School of Management & Business Administration (MBA):");
                faculty3txt1.setText("1. Business Administration (BA) Discipline\n2. Human Resource Management (HRM) Discipline");

                faculty4.setText("04.Social Science School:");
                faculty4txt1.setText("1. Economics (ECON) Discipline\n2. Development Studies (DS) Discipline\n3. Sociology (SOC) Discipline\n4. Mass Communication and Journalism (MCJ) Discipline");

                faculty5.setText("05. Arts and Humanities School:");
                faculty5txt1.setText("1. Bangla Language and Literature (BNL) Discipline\n2. English (ENG) Discipline\n3. History and Civilization Discipline\n4. Department of Finance and Banking (FAB)" +
                        "\n5. Department of Human Resources Management (HRM)\n6. Department of Tourism and Hospitality Management (THM)\n7. Department of Banking and Insurance\n8. Department of International Business" +
                        "\n9. Department of Management Information System (MIS)");

                faculty6.setText("06. School of Law:");
                faculty6txt1.setText("1. Law Discipline");

                faculty7.setText("07. Fine Arts School:");
                faculty7txt1.setText("1. Drawing and Painting (DP) Discipline\n2. Print Making Discipline\n3. Sculpture Discipline");

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //JNU
            else if(value.equals("JNU")) {
                getSupportActionBar().setTitle("JnU");
                scrl.setBackgroundResource(R.drawable.public_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Jagannath University");
                year.setText("2005");
                student.setText("19,088(+-)");
                hall.setText("12");
                department.setText("36");
                nickName.setText("JnU");
                location.setText("Dhaka, Bangladesh");
                campus.setText("Urban, 7.5 acres & Second Campus (Under Construction) area is Approx. 200 acres near Keraniganj, Dhaka");

                email.setText("info@jnu.ac.bd");
                mobile.setText("+88-02-9534255");
                webAddress.setText("www.jnu.ac.bd");

                faculty1.setText("01. Faculty of Life and Earth Sciences:");
                faculty1txt1.setText("1. Department of Biochemistry and Molecular Biology\n2. Department of Microbiology\n3. Department of Pharmacy" +
                        "\n4. Department of Zoology\n5. Department of Botany\n6. Department of Psychology" +
                        "\n7. Department of Geography and Environment\n8. Department of Genetic Engineering and Biotechnology");

                faculty2.setText("02. Faculty of Science:");
                faculty2txt1.setText("1. Department of Computer Science and Engineering (CSE)\n2. Department of Mathematics\n3. Department of Chemistry\n4. Department of Physics" +
                        "\n5. Department of Statistics");

                faculty3.setText("03. Faculty of Business Studies:");
                faculty3txt1.setText("1. Department of Finance\n2. Department of Management studies\n3. Department of Marketing\n4. Department of Accounting and information systems");

                faculty4.setText("04.Faculty of Arts:");
                faculty4txt1.setText("1. Department of Bengali\n2. Department of English\n3. Department of History\n4. Department of Philosophy\n5. Department of Islamic History and Culture" +
                        "\n6. Department of Islamic Studies\n7. Institute of Education Research\n8. Institute of Modern Languages");

                faculty5.setText("05. Faculty of Social Science:");
                faculty5txt1.setText("1. Department of Sociology\n2. Department of Anthropology\n3. Department of Economics\n4. Department of Political Science)" +
                        "\n5. Department of Public Administration\n6. Department of Social Work\n7. Department of Mass Communication and Journalism\n8. Department of Film and Television");

                faculty6.setText("06. Faculty of Law:");
                faculty6txt1.setText("1. Department of Law\n2. Department of Land Management and Law");

                faculty7.setText("07. Faculty of Fine Arts:");
                faculty7txt1.setText("1. Department of Fine Arts and graphics\n2. Department of Drama and Dramatics\n3. Department of Music");

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //JKKNIU
            else if(value.equals("JKKNIU")) {
                getSupportActionBar().setTitle("JKKNIU");
                scrl.setBackgroundResource(R.drawable.public_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Jatiya Kabi Kazi Nazrul Islam University");
                year.setText("2006");
                student.setText("7,296(+-)");
                hall.setText("2");
                department.setText("19");
                nickName.setText("JKKNIU");
                location.setText("Mymensingh, Bangladesh");
                campus.setText("Urban, 57 acres (23 ha)");

                email.setText("N/A");
                mobile.setText("N/A");
                webAddress.setText("www.jkkniu.edu.bd");

                faculty1.setText("01. Faculty of Science and Engineering:");
                faculty1txt1.setText("1. Department of Computer Science and Engineering (CSE)\n2. Department of Electrical and Electronic Engineering (EEE)\n3. Department of Environmental Science & Engineering (ESE)" +
                        "\n4. Department of Statistics");

                faculty2.setText("02. Faculty of Arts:");
                faculty2txt1.setText("1. Department of Bangla Language and Literature\n2. Department of English language and Literature\n3. Department of Fine arts\n4. Department of Theatre and Performance Studies" +
                        "\n5. Department of Music\n6. Department of Film & Media studies\n7. Department of Philosophy");

                faculty3.setText("03. Faculty of Business Administration:");
                faculty3txt1.setText("1. Department of Accounting and Information Systemse\n2. Department of Finance and Banking\n3. Department of Human Resource Management\n4. Department of Management");

                faculty4.setText("04. Faculty of Social Science:");
                faculty4txt1.setText("1. Department of Economics\n2. Department of Public Administration & Governance Studies\n3. Department of Folklore\n4. Department of Law & Justice\n5. Department of Anthropology" +
                        "\n6. Department of Population Sciences\n7. Local Government and Urban developmen\n8.Department of Sociology");

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //COU
            else if(value.equals("COU")) {
                getSupportActionBar().setTitle("COU");
                scrl.setBackgroundResource(R.drawable.public_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Comilla University");
                year.setText("2006");
                student.setText("7,055(+-)");
                hall.setText("4");
                department.setText("19");
                nickName.setText("COU");
                location.setText("Cumilla, Bangladesh");
                campus.setText("(54 acres),Salmanpur,(200 acres),Rajarkhola, Kotbari, Cumilla");

                email.setText("info@jnu.ac.bd");
                mobile.setText("+88-02-9534255");
                webAddress.setText("www.jnu.ac.bd");

                faculty1.setText("01. Faculty of Arts & Humanities:");
                faculty1txt1.setText("1. Department of Bengali\n2. Department of English");

                faculty2.setText("02. Faculty of Social Sciences:");
                faculty2txt1.setText("1. Department of Archaeology\n2. Department of Anthropology\n3. Department of Economics\n4. Department of Public Administration" +
                        "\n5. Department of Media & Journalism");

                faculty3.setText("03. Faculty of Law:");
                faculty3txt1.setText("1. Department of Law");

                faculty4.setText("04. Faculty of Engineering:");
                faculty4txt1.setText("1. Department of Computer Science & Engineering (BSc/MSc Eng. in CSE)\n2. Department of Information and Communication Technology (BSc/MSc Eng. in ICT)");

                faculty5.setText("05. Faculty of Science:");
                faculty5txt1.setText("1. Department of Mathematics\n2. Department of Physics\n3. Department of Chemistry\n4. Department of Statistics)" +
                        "\n5. Department of Pharmacy");

                faculty6.setText("06. Faculty of Business Studies:");
                faculty6txt1.setText("1. Department of Marketing\n2. Department of Finance and Banking\n3. Department of Management Studies\n4. Department of Accounting and Information System");

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //BUP
            else if(value.equals("BUP")) {
                getSupportActionBar().setTitle("BUP");
                scrl.setBackgroundResource(R.drawable.public_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Bangladesh University of Professionals");
                year.setText("2006");
                student.setText("8,000+");
                hall.setText("N/A");
                department.setText("16");
                nickName.setText("BUP");
                location.setText("Dhaka, Bangladesh");
                campus.setText("Urban, 56 acres");

                email.setText("info@bup.edu.bd");
                mobile.setText("+88-02-8000368");
                webAddress.setText("www.bup.edu.bd");

                faculty1.setText("01. Faculty of Arts and Social Sciences:");
                faculty1txt1.setText("1. BA (Hons.) in English\n2. BSS (Hons.) in Economics\n3. BSS (Hons.) in Sociology\n4. BSS (Hons.) in Development Studies" +
                        "\n5. BSS (Hons.) in Public Administration\n6. BSS (Hons.) in Disaster & Human Security Management");

                faculty2.setText("02. Faculty of Social Sciences:");
                faculty2txt1.setText("1. BBA in Accounting and Information Systems\n2. BBA in Finance and Banking\n3. Department of BBA in Management Studies\n4. Department of BBA in Marketing" +
                        "\n5. BBA (General)");

                faculty3.setText("03. Faculty of Security and Strategic Studies:");
                faculty3txt1.setText("1. LLB (Hons.) in Law\n2. BSS (Hons.) in International Relations (IR)\n2. BSS (Hons.) in Mass Communication & Journalism");

                faculty4.setText("04. Faculty of Science and Technology:");
                faculty4txt1.setText("1. BSc (Hons.) in Information & Communication Engineering\n2. BSc (Hons.) in Environmental Science");

                faculty5.setText("05. Faculty of Medical Studies:");
                faculty5txt1.setText("1. Food & Nutrition\n2. Pharmacy\n3. Public Health & Informatics");

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //BRUR
            else if(value.equals("BRUR")) {
                getSupportActionBar().setTitle("BRUR");
                scrl.setBackgroundResource(R.drawable.public_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Begum Rokeya University, Rangpur");
                year.setText("2008");
                student.setText("7,120(+-)");
                hall.setText("3");
                department.setText("21");
                nickName.setText("BRUR");
                location.setText("Rangpur, Bangladesh");
                campus.setText("Urban , 75 acres (30 ha)");

                email.setText("info@brur.ac.bd");
                mobile.setText("+8801552-421008");
                webAddress.setText("www.brur.ac.bd");

                faculty1.setText("01. Faculty of Arts:");
                faculty1txt1.setText("1. Department of Bangla\n2. Department of English\n3. Department of History and Archaeology");

                faculty2.setText("02. Faculty of Social Science:");
                faculty2txt1.setText("1. Department of Economics\n2. Department of Sociology\n3. Department of Political Science\n4. Department of Gender and Development Studies" +
                        "\n5. Department of Mass Communication and Journalism\n6. Department of Public Administration");

                faculty3.setText("03. Faculty of Business Studies:");
                faculty3txt1.setText("1. Department of Accounting and Information Systems\n2. Department of Management Studies\n3. Department of Marketing\n4. Department of Finance and Banking");

                faculty4.setText("04. Faculty of Science:");
                faculty4txt1.setText("1. Department of Physics\n2. Department of Chemistry\n3. Department of Mathematics\n4. Department of Statistics");

                faculty5.setText("05. Faculty of Engineering & Technology:");
                faculty5txt1.setText("1. Department of Electrical and Electronic Engineering\n2. Department of Computer Science and Engineering");

                faculty6.setText("06. Faculty of Life and Earth Sciences:");
                faculty6txt1.setText("1. Department of Geography and Environmental Science\n2. Department of Disaster Management");

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //BU
            else if(value.equals("BU")) {
                getSupportActionBar().setTitle("BU");
                scrl.setBackgroundResource(R.drawable.public_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("University of Barisal ( BU )");
                year.setText("2011");
                student.setText("7,786(+-)");
                hall.setText("3");
                department.setText("20");
                nickName.setText("BU");
                location.setText("Barisal, Bangladesh");
                campus.setText("Suburban (50 acres)");

                email.setText("admission@bu.edu.bd");
                mobile.setText("+88-01744-291258");
                webAddress.setText("www.bu.edu.bd");

                faculty1.setText("01. Faculty of Science and Engineering:");
                faculty1txt1.setText("1. Department of Mathematics\n2. Department of Computer Science & Engineering\n3. Department of Chemistry\n4. Department of Physics" +
                        "\n5. Department of Geology and Mining\n6. Department of Statistics");

                faculty2.setText("02. Faculty of Bio-Sciences:");
                faculty2txt1.setText("1. Department of Soil and Environmental Sciences\n2. Department of Botany\n3. Department of Coastal Studies and Disaster Management\n4. Department of Biochemistry and Biotechnology");

                faculty3.setText("03. Faculty of Arts and Humanities:");
                faculty3txt1.setText("1. Department of Bangla\n2. Department of English\n3. Department of Philosophy\n4. Department of Mass Communication & Journalism" +
                        "\n5. Department of History and Civilization");

                faculty4.setText("04. Faculty of Social Science:");
                faculty4txt1.setText("1. Department of Economics\n2. Department of Political Science\n3. Department of Public Administration\n4. Department of Sociology");

                faculty5.setText("05. Faculty of Business Studies:");
                faculty5txt1.setText("1. Department of Accounting and Information System\n2. Department of Finance and Banking\n3. Department of Marketing\n4. Department of Management Studies");

                faculty6.setText("06. Faculty of Law:");
                faculty6txt1.setText("1. Department of Law");

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //...............................General University..............................

            //...............................Science and Technology University..............................

            //SUST
            else if(value.equals("SUST")) {
                getSupportActionBar().setTitle("SUST");
                scrl.setBackgroundResource(R.drawable.science_tech_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Shahjalal University of Science and Technology ( SUST )");
                year.setText("1986");
                student.setText("7,662(+-)");
                hall.setText("5");
                department.setText("28");
                nickName.setText("SUST");
                location.setText("Akhalia, Kumargaon, Sylhet, Bangladesh");
                campus.setText("Urban 320 acres (130 ha) (Main campus)");

                email.setText("system.admin@sust.edu");
                mobile.setText("+880-821-713491");
                webAddress.setText("www.sust.edu");

                faculty1.setText("01. School of Agriculture and Mineral Sciences:");
                faculty1txt1.setText("1. Department of Forestry & Environmental Science (FES)");

                faculty2.setText("02. School of Applied Sciences and Technology:");
                faculty2txt1.setText("1. Department of Architecture (ARC)\n2. Department of Chemical Engineering & Polymer Science (CEP)\n3. Department of Civil & Environmental Engineering (CEE)\n4. Department of Computer Science & Engineering (CSE)\n5. Department of Electrical & Electronic Engineering (EEE)\n6. Department of Food Engineering & Tea Technology (FET)\n7. Department of Industrial & Production Engineering (IPE)\n8. Department of Mechanical Engineering (MEE)\n9. Department of Petroleum & Mining Engineering (PME)");

                faculty3.setText("03. School of Physical Sciences:");
                faculty3txt1.setText("1. Department of Chemistry (CHE)\n2. Department of Geography and Environment (GEE)\n3. Department of Mathematics (MAT)\n4. Department of Physics (PHY)\n5. Department of Statistics (STA)\n6. Department of Oceanography (OCG)");

                faculty4.setText("04. School of Social Sciences:");
                faculty4txt1.setText("1. Department of Anthropology (ANP)\n2. Department of Bangla (BNG)\n3. Department of Economics (ECO)\n4. Department of English (ENG)\n5. Department of Political Studies (PSS)\6. Department of Public Administration (PAD)\n7. Department of Social work (SCW)\n8. Department of Sociology (SOC)");

                faculty5.setText("05. School of Life Sciences:");
                faculty5txt1.setText("1. Department of Bio-Chemistry and Molecular Biology (BMB)\n2. Department of Genetic Engineering and Biotechnology (GEB-SUST)");

                faculty6.setText("06. School of Management and Business Administration:");
                faculty6txt1.setText("1. Department of Business Administration");

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //NSTU
            else if(value.equals("NSTU")) {
                getSupportActionBar().setTitle("NSTU");
                scrl.setBackgroundResource(R.drawable.science_tech_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Noakhali Science and Technology University");
                year.setText("2005");
                student.setText("5,437(+-)");
                hall.setText("5");
                department.setText("17");
                nickName.setText("NSTU");
                location.setText("Science and Technology University Sonapur, University Rd, Noakhali 3814");
                campus.setText("Urban; 101 acres (41 ha)");

                email.setText("softbox@nstu.edu.bd");
                mobile.setText("+8801708413520");
                webAddress.setText("www.nstu.edu.bd");

                faculty1.setText("01. Faculty of Engineering and Technology:");
                faculty1txt1.setText("1. Department of Computer Science and Telecommunication Engineering\n2. Department of Applied Chemistry and Chemical Engineering\n3. Department of Information and Communication Engineering\n4. Department of Electrical and Electronic Engineering(EEE)");

                faculty2.setText("02. Faculty of Science:");
                faculty2txt1.setText("1.Department of Fisheries and Marine Science\n2. Department of Pharmacy\n3. Department of Microbiology\n4. Department of Applied Mathematics\n5. Department of Food Technology and Nutrition Science\n6. Department of Environmental Science and Disaster Management\n7. Department of Biotechnology and Genetic Engineering\n8. Department of Agriculture\n9. Department of Statistics\n10.  Department of Oceanography\n11. Department of Biochemistry and Molecular Biology\12. Department of Zoology");

                faculty3.setText("03. Faculty of Social Science and Humanities:");
                faculty3txt1.setText("1. Department of English\n2. Department of Economics\n3. Department of Bangladesh and Liberation War Studies\n4. Department of Sociology\n5. Department of Bangla\n6. Department of Social Work");

                faculty4.setText("04. Faculty of Business Administration:");
                faculty4txt1.setText("1. Department of Business Administration\n2. Department of Tourism and Hospitality Management\n3. Department of Management Information Systems");

                faculty5.setText("05. Faculty of Education Science:");
                faculty5txt1.setText("1. Department of Education\n2. Department of Educational Administration");

                faculty6.setText("06. Faculty of Law:");
                faculty6txt1.setText("1. Department of Law");

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //HSTU
            else if(value.equals("HSTU")) {
                getSupportActionBar().setTitle("HSTU");
                scrl.setBackgroundResource(R.drawable.science_tech_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Hajee Mohammad Danesh Science and Technology University (HSTU)");
                year.setText("1979");
                student.setText("11000(+-)");
                hall.setText("7");
                department.setText("47");
                nickName.setText("HSTU");
                location.setText("Dinajpur, Bangladesh");
                campus.setText("Rural (85 acres)");

                email.setText("registrar@hstu.ac.bd");
                mobile.setText("+880-531-61355");
                webAddress.setText("www.hstu.ac.bd");

                faculty1.setText("01. Faculty of Agriculture:");
                faculty1txt1.setText("1. Department of Agronomy\n2. Department of Horticulture\n3. Department of Soil Science\n4. Department of Entomology" +
                        "\n5. Department of Plant Pathology\n6. Department of Genetics & Plant Breeding\n7. Crop Physiology & Ecology\n8. Department of Agricultural Chemistry\n9. Department of Agroforestry And Environment\n10. Department of Biochemistry & Molecular Biology");

                faculty2.setText("02. Faculty of Computer Science and Engineering:");
                faculty2txt1.setText("1. Department of Computer Science & Engineering\n2. Department of Electronics and Communication Engineering\n3. Department of Electrical & Electronic Engineering");

                faculty3.setText("03. Faculty of Business Studies:");
                faculty3txt1.setText("1. Department of Accounting\n2. Department of Management Studies\n3. Department of Marketing\n4. Department of Finance and Banking");

                faculty4.setText("04. Faculty of Fisheries:");
                faculty4txt1.setText("1. Department of Fisheries Biology & Genetics\n2. Department of Fisheries Management\n3. Department of Fisheries Technology\n4. Department of Aquaculture");

                faculty5.setText("05. Faculty of Veterinary & Animal Science:");
                faculty5txt1.setText("1.  Microbiology\n2. Department of Pathology and Parasitology\n3. Department of Dairy and Poultry Science \n4. Department of Anatomy and Histology\n5. Department of General Animal Science and Nutrition\n6. Department of Genetics and Animal breeding\n7. Department of Medicine, Surgery and Obstetrics\n8. Department of Physiology &Pharmacology");

                faculty6.setText("06. Faculty of  Engineering:");
                faculty6txt1.setText("1. Department of Agricultural & Industrial Engineering\n2. Department of Food Processing & Preservation\n3. Department of Food Engineering & Technology\n4. Department of Food Science & Nutrition\n5. Department of Architecture\n6. Department of Civil Engineering\n7. Department of Mechanical Engineering");

                faculty7.setText("07. Faculty of Science:");
                faculty7txt1.setText("1. Department of Chemistry\n2. Department of Statistics\n3. Department of Mathematics\n4. Department of Mathematics");

                faculty8.setText("08. Faculty of Social Science & Arts:");
                faculty8txt1.setText("1. Department of English\n2. Department of Economics\n3. Department of Sociology\n4. Department of Development Studies");

                faculty9.setText("09. Faculty of Postgraduate");
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //MBSTU
            else if(value.equals("MBSTU")) {
                getSupportActionBar().setTitle("MBSTU");
                scrl.setBackgroundResource(R.drawable.science_tech_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Mawlana Bhashani Science and Technology University ( MBSTU )");
                year.setText("1999");
                student.setText("5,671(+-)");
                hall.setText("5");
                department.setText("15 ");
                nickName.setText("MBSTU");
                location.setText("Tangail, Bangladesh");
                campus.setText("Urban (70.69 acres)");

                email.setText("registrar@mbstu.ac.bd");
                mobile.setText("+880921 55399");
                webAddress.setText("www.mbstu.ac.bd");

                faculty1.setText("01. Faculty of Engineering:");
                faculty1txt1.setText("1. Department ofComputer Science and Engineering\n2. Department of Information and Communication Technology\n3. Department of Textile Engineering");

                faculty2.setText("02. Faculty of Life Science:");
                faculty2txt1.setText("1. Department of Environmental Science and Resource Management\n2. Department of Criminology and Police Science\n3. Department of Biochemistry and Molecular Biology\n4. Department of Biotechnology and Genetic Engineering\n5. Department of Food Technology and Nutrition Science\n6. Department of Food Technology and Nutrition Science\n7. Department of Pharmacy");

                faculty3.setText("03. Faculty of Science:");
                faculty3txt1.setText("1. Department of Chemistry \n2. Department of Mathematics\n3. Department of Physics\n4. Department of Statistics");

                faculty4.setText("04. Faculty of Business Studies:");
                faculty4txt1.setText("1. Department of Business Administration\n2. Department of Accounting\n3. Department of Management Studies");

                faculty5.setText("05. Faculty of Social Science:");
                faculty5txt1.setText("1. Department of Economics");

                faculty6.setText("06. Faculty of Arts:");
                faculty6txt1.setText("1. Department of English");

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //PSTU
            else if(value.equals("PSTU")) {
                getSupportActionBar().setTitle("PSTU");
                scrl.setBackgroundResource(R.drawable.science_tech_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Patuakhali Science and Technology University(PSTU )");
                year.setText("1972(Start as a university in 2000)");
                student.setText("(3000+-)");
                hall.setText("5");
                department.setText("53");
                nickName.setText("PSTU");
                location.setText("Dumki Upazila, Patuakhali District, 8602, Bangladesh	");
                campus.setText("89.97Acres (including Babugonj:12.97acres)");

                email.setText("pstu@pstu.ac.bd");
                mobile.setText("+88-04427-56003");
                webAddress.setText("www.pstu.ac.bd");

                faculty1.setText("01.Faculty of Agriculture :");
                faculty1txt1.setText("1.  Agriculture Botany \n2.  Agriculture Chemistry \n3. Agriculture Engineering \n4.Agricultural Extension and Rural Development"  +
                        "\n5. Agroforestry \n6. Agronomy\n7. Biotechnology \n8.Entomology \n9.Genetics and Plant Breeding \n10.Horticulture \n11.Plant Pathology \n12.Soil Science \n13. Statistics\n14.Animal Science ");

                faculty2.setText("02. Faculty of Computer Science and Engineering :");
                faculty2txt1.setText("1.Computer and Communication Engineering\n2. Computer Science and Information Technology \n3.Electrical and Electronics Engineering\n4.Mathematics " +
                        " \n5.Physics and Mechanical Engineering ");

                faculty3.setText("03.Faculty of Business Administration and Management :");
                faculty3txt1.setText("1.Accounting and Information Systems \n2.Economics and Sociology\n3.Finance and Banking \n4.Language and Communication " +
                        "\n5. Management Studies \n6.Marketing");

                faculty4.setText("04.Faculty of Animal Science and Veterinary Medicine:");
                faculty4txt1.setText("1.Dairy Science \n2. Anatomy and Histology \n3.Animal Products and By-Products Technology \n4.Basic Science"  +
                        " \n5.General Animal Science and Animal Nutrition \n6.Genetics and Animal Breeding \n7.Medicine Surgery and Obstetrics \n8.Microbiology and Public Health \n9.Physiology and Pharmacology \n10.Pathology and Parasitology \n11. Poultry Science");

                faculty5.setText("05. Faculty of Fisheries :");
                faculty5txt1.setText("1.Aquaculture  \n2.Fisheries Biology and Genetics   \n3.Fisheries Management \n4.Fisheries Technology"  + " \n5.Marine Fisheries and Oceanography");

                faculty6.setText("06.Faculty of Environmental Science and Disaster Management:");
                faculty6txt1.setText("1.Disaster Resilience and Engineering \n2. Disaster Risk Management \n3.Emergency Management  \n4.Environmental Science" +
                        "\n5. Geo Information Science and Earth Observation ");
                faculty7.setText("07.Faculty of Nutrition and Food Science  :");
                faculty7txt1.setText("1.Biochemistry and Food Analysis\n2.  Community Health and Hygiene \n3.Environmental Sanitation  \n4.Food Microbiology" +
                        "\n5. Food Technology and Engineering \n6.Human Nutrition and Dietetics \n7.Post Harvest Technology and Marketing ");
                faculty8.setText("08.Faculty of Land Management and Administration:");
                faculty8txt1.setText("1.Geomatics \n2. Geodesy  \n3. Land Administration \n4.Land Policy and Law " +
                        "\n5.Land Record and Transformation  ");

                faculty9.setText("09.Faculty of Postgraduate Studies :");
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //JUST
            else if(value.equals("JUST")) {
                getSupportActionBar().setTitle("JUST");
                scrl.setBackgroundResource(R.drawable.science_tech_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("JASHORE UNIVERSITY OF SCIENCE AND TECHNOLOGY(JUST)");
                year.setText("2007");
                student.setText("(3,731+-)");
                hall.setText("2");
                department.setText("20");
                nickName.setText("JUST");
                location.setText("Jashore Sadar, 7408, Bangladesh");
                campus.setText("Urban 35 acres (14 ha)");

                email.setText("registrar@just.edu.bd");
                mobile.setText("+88-0421-61111");
                webAddress.setText("www.just.edu.bd");

                faculty1.setText("01. Faculty of Engineering and Technology :");
                faculty1txt1.setText("1.Computer Science and Engineering (CSE) \n2.Electrical and Electronic Engineering (EEE)\n3.Industrial and Production Engineering (IPE) \n4.Petroleum and Mining Engineering (PME)" +
                        "\n5.Chemical Engineering (ChE) \n6.Biomedical Engineering (BME) \n7.Textile Engineering (TE)");

                faculty2.setText("02. Faculty of Arts and Social Science :");
                faculty2txt1.setText("1.English (ENG)");

                faculty3.setText("03. Faculty of Biological Science and Technology :");
                faculty3txt1.setText("1.Microbiology (MB)\n2.Fisheries & Marine Bioscience (FMB)\n3.Genetic engineering & Biotechnology (GEBT)\n4.Pharmacy (B.Pharm professional)");

                faculty4.setText("04. Faculty of Health Science :");
                faculty4txt1.setText("1.Physical Education & Sports Science (PESS)\n2.Physiotherapy and Rehabilitation\n3.Nursing Science (NS)");

                faculty5.setText("05 .Faculty of  Science :");
                faculty5txt1.setText("1.Mathematics\n2.Physics\n3.Chemistry");

                faculty6.setText("06 . Faculty of Business Studies:");
                faculty6txt1.setText("1.Accounting and Information Systems (AIS)\n2. Management\n3.Finance and Banking\n4.Marketing");

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //BSMRSTU
            else if(value.equals("BSMRSTU")) {
                getSupportActionBar().setTitle("BSMRSTU");
                scrl.setBackgroundResource(R.drawable.science_tech_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Bangabandhu Sheikh Mujibur Rahman Science and Technology University (BSMRSTU )");
                year.setText("2001");
                student.setText("(11,000+-)");
                hall.setText("3");
                department.setText("23");
                nickName.setText("BSMRSTU");
                location.setText("	Gopalganj-8100, Bangladesh");
                campus.setText("55 acres (0.22 km2)");

                email.setText("registrar@bsmrstu.edu.bd");
                mobile.setText("+88-02-6682257");
                webAddress.setText("www.bsmrstu.edu.bd");

                faculty1.setText("01.Faculty of Engineering :");
                faculty1txt1.setText("1.Physics \n2.Chemistry  \n3. Mathematics \n4." +
                        "\n5. Environmental Science and Disaster Management ");

                faculty2.setText("02. Faculty of Science :");
                faculty2txt1.setText("1. Department of Soil and Environmental Sciences\n2. Department of Botany\n3. Department of Coastal Studies and Disaster Management\n4. Department of Biochemistry and Biotechnology");

                faculty3.setText("03.Faculty of Life Science :");
                faculty3txt1.setText("1.Pharmacy \n2.Biotechnology and Genetic Engineering\n3. Biochemistry and Molecular Biology\n4.Botany " +
                        "\n5.Psychology ");

                faculty4.setText("04.Faculty of Arts :");
                faculty4txt1.setText("1. English\n2.Bangla  \n3.History");

                faculty5.setText("05. Faculty of Social Science:");
                faculty5txt1.setText("1. Economics \n2. Sociology  \n3.Public Administration \n4. International Relations + \n5.Political Science");

                faculty6.setText("06.Faculty of Business Studies :");
                faculty6txt1.setText("1.Management Studies \n2. Accounting and Information System \n3. Marketing \n4.Finance and Banking" +
                        "\n5. Tourism and Hospitality Management ");
                faculty7.setText("07.Faculty of Law :");
                faculty7txt1.setText("1. Law ");
                faculty8.setText("08.Sheikh Hasina Agriculture Institute :");
                faculty8txt1.setText("1.Agriculture \n2. Fisheries and Marine Bioscience  \n3. Livestock Science and Veterinary Medicine ");

                        faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //RMSTU
            else if(value.equals("RMSTU")) {
                getSupportActionBar().setTitle("RMSTU");
                scrl.setBackgroundResource(R.drawable.science_tech_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Rangamati Science and Technology University(RMSTU )");
                year.setText("	2014");
                student.setText("(200+-)");
                hall.setText("N/A");
                department.setText("4");
                nickName.setText("RMSTU");
                location.setText("Vedvedi, Rangamati, Chittagong, Bangladesh");
                campus.setText("65 acres (26 ha)");

                email.setText("contact@rmstu.edu.bd");
                mobile.setText("+8801704383642");
                webAddress.setText("www.rmstu.edu.bd");

                faculty1.setText("01.Faculty of Engineering :");
                faculty1txt1.setText("1.Computer Science and Engineering");
                faculty2.setText("02. Faculty of Biological Science:");
                faculty2txt1.setText("1. Forestry and Environmental Science");

                faculty3.setText("03.Faculty of BBA :");
                faculty3txt1.setText("1.Tourism and hospitality management \n2.Business Management");

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);


                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //CSTU
            else if(value.equals("CSTU")) {
                getSupportActionBar().setTitle("CSTU");
                scrl.setBackgroundResource(R.drawable.science_tech_background);

                overviewTxt1.setText("Public University");

                varsityName.setText("Chandpur Science and Technology University");
                year.setText("2021");
                student.setText("(200+-)");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("RMSTU");
                location.setText("Chandpur, Bangladesh");
                campus.setText("Urban");

                email.setText("info@cstu.ac.bd ");
                mobile.setText("+880-00-00000");
                webAddress.setText("www.cstu.ac.bd");

                facultyDepartment.setVisibility(View.GONE);

                faculty1.setVisibility(View.GONE);
                faculty1txt1.setVisibility(View.GONE);
                faculty2.setVisibility(View.GONE);
                faculty2txt1.setVisibility(View.GONE);

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);


                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //...............................Science and Technology University..............................

            //...............................National University..............................

            //Chittagong Govt College
            else if(value.equals("CGC")) {
                getSupportActionBar().setTitle("CGC");
                scrl.setBackgroundResource(R.drawable.national_background);

                overviewTxt1.setText("Public");

                varsityName.setText("Chittagong Govt College");
                year.setText("1869");
                student.setText("(18,000+)");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("CGC");
                location.setText("Chittagong, Bangladesh");
                campus.setText("6 acres (urban)");

                email.setText("ctgcollege@yahoo.com");
                mobile.setText("+88031616045");
                webAddress.setText("www.ctgcollege.gov.bd");

                faculty1.setText("01. Faculty of Arts & Social Science:");
                faculty1txt1.setText("1. Department of Bengali\n2. Department of English\n3. Department of Economics\n4. Department of Political Science" +
                        "\n5. Department of History\n6. Department of Islamic History and Culture\n7. Department of Philosophy\n8. Department of Philosophy" +
                        "\n9. Department of Sociology\n10. Department of Islamic Studies");

                faculty2.setText("02. Faculty of Science:");
                faculty2txt1.setText("1. Department of Geography\n2. Department of Physics\n3. Department of Chemistry\n4. Department of Botany" +
                        "\n5. Department of Zoology\n6. Department of Statistics\n7. Department of Mathematics\n8. Department of Psychology");

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);


                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //GCC
            else if(value.equals("GCC")) {
                getSupportActionBar().setTitle("GCC");
                scrl.setBackgroundResource(R.drawable.national_background);

                overviewTxt1.setText("National University");

                varsityName.setText("Government City College, Chittagong (GCC)");
                year.setText("1954");
                student.setText("(18,000+-)");
                hall.setText("N/A");
                department.setText("28");
                nickName.setText("GCC");
                location.setText("Ice Factory Road (near New Market), Chittagong-4000, Chittagong");
                campus.setText("5.169 acres ");

                email.setText("info@gccc.edu.bd");
                mobile.setText("+8801031-636051");
                webAddress.setText("www.gccc.edu.bd");

                faculty1.setText("01.Faculty of H.S.C:");
                faculty1txt1.setVisibility(View.GONE);

                faculty2.setText("02. Faculty of B.B.A(Honours) :");
                faculty2txt1.setText("1. Department of Accounting \n2. Department of  Management");

                faculty3.setText("03.Faculty of B.Sc.(Honours) :");
                faculty3txt1.setText("1.Department of Physics \n2.Department of Chemistry\n3.Department of Mathematics\n4.Department of Botany " +
                        "\n5.Department of Zoology\n6.Department of English\n7.Department of Psychology ");

                faculty4.setText("04.Faculty of B.B.S(Pass) :");
                faculty4txt1.setText("1.Department of Accounting \n2. Department of  Management");

                faculty5.setText("05.Faculty of M.B.A  :");
                faculty5txt1.setText("1.Department of Accounting \n2. Department of  Management");

                faculty6.setText("03.Faculty of B.Sc.  (Degree pass course) :");
                faculty6txt1.setText("1.Department of Physics \n2.Department of Chemistry\n3.Department of Mathematics\n4.Department of Botany " +
                        "\n5.Department of Zoology\n6.Department of English\n7.Department of Psychology ");

                faculty7.setText("03.Faculty of M.S.C:");
                faculty7txt1.setText("1.Department of Physics \n2.Department of Chemistry\n3.Department of Mathematics\n4.Department of Botany " +
                        "\n5.Department of Zoology\n6.Department of English\n7.Department of Psychology ");

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);


                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //GHMMC
            else if(value.equals("GHMMC")) {
                getSupportActionBar().setTitle("GHMMC");
                scrl.setBackgroundResource(R.drawable.national_background);

                overviewTxt1.setText("National University");

                varsityName.setText("Government Hazi Mohammad Mohsin College(GHMMC)");
                year.setText("1874 (in British India)");
                student.setText("(20,000+-)");
                hall.setText("N/A");
                department.setText("15");
                nickName.setText("GHMMC");
                location.setText("College Road, Chawkbazar,Chattrogram 4000,chittagong");
                campus.setText("31 acres ");

                email.setText(" mohsincollege_ctg@yahoo.com");
                mobile.setText("+8801031-614690");
                webAddress.setText("www.mohsincollege.edu.bd");

                faculty1.setText("01.Faculty of  Arts & Social Science :");
                faculty1txt1.setText("1.Department of  Bengali \n2.Department of Economics \n3.Department of  Political Science \n4.Department of Islamic History and Culture  " +
                        "\n5.Department of Philosophy  \n6.Department of English\n7.Department of  Sociology \n8.Department of Arabic & Islamic Studies");


                faculty2.setText("02.Faculty of Science  :");
                faculty2txt1.setText("1.Department of Physics  \n2.Department of Chemistry \n3.Department of  Botany\n4.Department of  Zoology " +
                        "\n5.Department of  Mathematics  ");

                faculty3.setText("03.Faculty of Commerce :");
                faculty3txt1.setText("1.Department of Accounting \n2. Department of  Management");

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);


                        faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);


                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);


                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //...............................National University..............................

            //...............................Private University..............................

            //Asian University for Women
            else if(value.equals("AUW")) {
                getSupportActionBar().setTitle("AUW");
                scrl.setBackgroundResource(R.drawable.background_pvt);

                overviewTxt1.setText("Private University");

                varsityName.setText("Asian University for Women");
                year.setText("2008");
                student.setText("890");
                hall.setText("N/A");
                department.setText("N/A");
                nickName.setText("AUW");
                location.setText("Chittagong, Bangladesh");
                campus.setText("N/A");

                email.setText("admissions@auw.edu.bd");
                mobile.setText("+880-31-285-4980");
                webAddress.setText("www.asian-university.org");

                facultyDepartment.setText("Tuition fees: USD $9,000\nBooks, Course Supplies, Student Activities: USD $3,000\nRoom and Board: $3,000" +
                        "\nTotal per year costs USD $15,000");

                faculty1.setVisibility(View.GONE);
                faculty1txt1.setVisibility(View.GONE);

                faculty2.setVisibility(View.GONE);
                faculty2txt1.setVisibility(View.GONE);

                faculty3.setVisibility(View.GONE);
                faculty3txt1.setVisibility(View.GONE);

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //BGC Trust University Bangladesh
            else if(value.equals("BGCTUB")) {
                getSupportActionBar().setTitle("BGCTUB");
                scrl.setBackgroundResource(R.drawable.background_pvt);

                overviewTxt1.setText("Private University");

                varsityName.setText("BGC Trust University Bangladesh");
                year.setText("2001");
                student.setText("10,600");
                hall.setText("N/A");
                department.setText("5");
                nickName.setText("BUC");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Rural, 100 acres (0.40 km2)");

                email.setText("infor@bgctub.ac.bd");
                mobile.setText("+88-03033-56192-3");
                webAddress.setText("www.bgctub.ac.bd");

                faculty1.setText("01. Faculty of Arts:");
                faculty1txt1.setText("1. Department of English - Tuition Fees: 3,854/- per month x 48 = 1,85,000/-+ 15,000/- = TK.2,00,000/-");

                faculty2.setText("02. Faculty of Business Administration:");
                faculty2txt1.setText("1. Department of Business Administration - Tuition Fees: 5,313/- per month x 48 = 2,55,000/-+ 15,000/- = TK.2,70,000/-");

                faculty3.setText("03. Faculty of Law");
                faculty3txt1.setText("1. Department of Law - Tuition Fees: 5,729/- per month x 48 = 2,75,000/-+ 15,000/- = TK.2,90,000/-");

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Chittagong Independent University
            else if(value.equals("CIU")) {
                getSupportActionBar().setTitle("CIU");
                scrl.setBackgroundResource(R.drawable.background_pvt);

                overviewTxt1.setText("Private University");

                varsityName.setText("Chittagong Independent University");
                year.setText("2001");
                student.setText("10,600");
                hall.setText("N/A");
                department.setText("7");
                nickName.setText("CIU");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Jamal Khan");

                email.setText("info@ciu.edu.bd");
                mobile.setText("+88-031-611262");
                webAddress.setText("www.ciu.edu.bd");

                faculty1.setText("01. School of Business:");
                faculty1txt1.setText("1. Department of Business Administration\n\t\tTotal Credit: 133\n\t\tFees: 4000 x 133 = TK. 5,32,000/-\n\t\tOthers: 75,000/-, Total Fess: TK.60,07,000/-");

                faculty2.setText("02. School of Engineering and Computer Science:");
                faculty2txt1.setText("1. Department of Computer Science\n2. Department of Computer Science and Engineering\n3. Department of Electrical and Electronic Engineering" +
                        "\n4. Department of Electronics and Telecommunication Engineering" +
                        "\n\t\tFor all department total credit: 140\n\t\tFees: 4000 x 140 = 5,60,000/-\n\t\tOthers: 75,000/-, Total Fess: TK.6,35,000/-");

                faculty3.setText("03. School of Law:");
                faculty3txt1.setText("1. Department of Law\n\t\tTotal Credit: 138\n\t\tFees: 4000 x 138 = 5,52,000/-" +
                        "\n\t\tOthers: 75,000/-, Total Fess: 6,27,000/-");

                faculty4.setText("04. School of Liberal Arts and Social Sciences");
                faculty4txt1.setText("1. Department of English\n\t\tTotal Credit: 129\n\t\tFees: 4000 x 129 = 5,16,000/-\n\t\tOthers: 75,000/-, Total Fess: TK. 3,33,000/-");

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //East Delta University
            else if(value.equals("EDU")) {
                getSupportActionBar().setTitle("EDU");
                scrl.setBackgroundResource(R.drawable.background_pvt);

                overviewTxt1.setText("Private University");

                varsityName.setText("East Delta University");
                year.setText("2006");
                student.setText("Approximately 2,200");
                hall.setText("N/A");
                department.setText("7");
                nickName.setText("EDU");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Urban 12 acres");

                email.setText("enquiry@eastdelta.edu.bd");
                mobile.setText("+8809638144413");
                webAddress.setText("www.eastdelta.edu.bd");

                faculty1.setText("01. School of Business Administration:");
                faculty1txt1.setText("1. Department of Business Administration\n\t\tTotal Credit: 125\n\t\tPer credit cost: 4,500/- semester fee: 11,000/-" +
                        "\n\t\tTotal cost 65,000/- for 1 semester");

                faculty2.setText("02. School of Liberal Arts & Social Science:");
                faculty2txt1.setText("1. Department of Economics\n2. Department of English" +
                        "\n\t\tTotal Credit: 120\n\t\tPer credit cost: 4,000/- semester fee: 11,000/-\n\t\tTotal cost 35,000/- for 1 semester");

                faculty3.setText("03. School of Science Engineering and Technology:");
                faculty3txt1.setText("1. Department of Computer Science and Engineering\n2. Department of EEE\n3. Department of ETE" +
                        "\n\t\tTotal Credit: 160\n\t\tPer credit cost: 4,000/- semester fee: 11,000/-\n\t\tTotal cost 47,000/- for 1 semester");

                faculty4.setVisibility(View.GONE);
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //International Islamic University, Chittagong
            else if(value.equals("IIUC")) {
                getSupportActionBar().setTitle("IIUC");
                scrl.setBackgroundResource(R.drawable.background_pvt);

                overviewTxt1.setText("Private University");

                varsityName.setText("International Islamic University, Chittagong");
                year.setText("2006");
                student.setText("10,000");
                hall.setText("6");
                department.setText("15");
                nickName.setText("IIUC");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Urban Rural");

                email.setText("info@iiuc.ac.bd");
                mobile.setText("+8803042-51154-9");
                webAddress.setText("www.iiuc.ac.bd");

                faculty1.setText("01. Faculty of Arts & Humanities:");
                faculty1txt1.setText("1. Department of Arabic Language & Literature\n2. Department of English\n3. Department of Library and Information Science");

                faculty2.setText("02. Faculty of Business Studies:");
                faculty2txt1.setText("1. Department of Business Administration");

                faculty3.setText("03. Faculty of Law:");
                faculty3txt1.setText("1. Department of Law");

                faculty4.setText("04. Faculty of Science and Engineering:");
                faculty4txt1.setText("1. Department of Aquaculture Fisheries\n2. Department of Civil Engineering\n3. Department of Computer Science & Engineering" +
                        "\n4. Department of Electrical & Electronic Engineering\n5. Department of Electrical Telecommunication Engineering\n6. Department of Pharmacy");

                faculty5.setText("05. Faculty of Shariah and Islamic Studies:");
                faculty5txt1.setText("1. Department of Al-Quran & Islamic Studies\n2. Department of Dawah & Islamic Studies");

                faculty6.setText("06. Faculty of Social Science:");
                faculty6txt1.setText("1. Department of Economics & Banking\n2. Department of Government Administration");

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Port City International University
            else if(value.equals("PCIU")) {
                getSupportActionBar().setTitle("PCIU");
                scrl.setBackgroundResource(R.drawable.background_pvt);

                overviewTxt1.setText("Private University");

                varsityName.setText("Port City International University");
                year.setText("2013");
                student.setText("More than 6,000");
                hall.setText("N/A");
                department.setText("9");
                nickName.setText("PCIU");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Urban");

                email.setText("admission@portcity.edu.bd ");
                mobile.setText("+880-31-2869877");
                webAddress.setText("www.portcity.edu.bd");

                faculty1.setText("01. Faculty of Business Studies:");
                faculty1txt1.setText("1. Department of Business Administration\n\t\tTotal Credit: 127\n\t\tAdmission Fee: 18,000/-\n\t\tper credit 2,000/-\n\t\tTotal Fees: 2,72,000/-");

                faculty2.setText("02. Faculty of Humanities & Social Science:");
                faculty2txt1.setText("1. Department of Economics\n\t\tTotal Credit: 132\n\t\tAdmission Fee: 18,000/-\n\t\tPer credit 1,400/-\n\t\tTotal Fees: 2,02,800/-\n" +
                        "\n2. Department of English\n\t\tTotal Credit: 129\n\t\tAdmission Fee: 18,000/-\n\t\tper credit 1,500/-\n\t\tTotal Fees: 2,11,000/-\n" +
                        "\n3. Department of Journalism & Media Studies\n\t\tTotal Credit: 133\n\t\tAdmission Fee: 18,000\n\t\tPer credit 1,200/-\n\t\tTotal Fees: 1,77,600/-");

                faculty3.setText("03. Faculty of Law:");
                faculty3txt1.setText("1. Department of Law\n\t\tTotal Credit: 127\n\t\tAdmission Fee: 18,000\n\t\tPer credit 2,000/-\n\t\tTotal Fees: 2,77,000/-");

                faculty4.setText("04. Faculty of Science & Engineering:");
                faculty4txt1.setText("1. Department of Civil Engineering\n\t\tTotal Credit: 159\n\t\tAdmission Fee: 18,000/-\n\t\tPer credit 1,950/-\n\t\tTotal Fees: 3,28,050/-\n" +
                        "\n2. Department of Computer Science & Engineering\n\t\tTotal Credit: 156\n\t\tAdmission Fee: 18,000/-\n\t\tPer credit 2,000/-\n\t\tTotal Fees: 3,30,800/-\n" +
                        "\n3. Department of Electrical and Electronics Engineering\n\t\tTotal Credit: 157\n\t\tAdmission Fee: 18,000/-\n\t\tPer credit 2,100/-\n\t\tTotal Fees: 3,47,700/-\n" +
                        "\n4. Department of Fashion Design and Technology\n\t\tTotal Credit: 145\n\t\tAdmission Fee: 18,000/-\n\t\tPer credit 1,700/-\n\t\tTotal Fees: 2,64,500/-\n" +
                        "\n5. Department of Textile Engineering\n\t\tTotal Credit: 159\n\t\tAdmission Fee: 18,000/-\n\t\tPer credit 1,950/-\n\t\tTotal Fees: 3,28,050/-");

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Premier University
            else if(value.equals("PU")) {
                getSupportActionBar().setTitle("PU");
                scrl.setBackgroundResource(R.drawable.background_pvt);

                overviewTxt1.setText("Private University");

                varsityName.setText("Premier University");
                year.setText("2001");
                student.setText("7,551");
                hall.setText("N/A");
                department.setText("12");
                nickName.setText("PU");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Urban");

                email.setText("info@puc.ac.bd");
                mobile.setText("+88656917");
                webAddress.setText("www.puc.ac.bd");

                faculty1.setText("01. Faculty of Social Science:");
                faculty1txt1.setText("1. Department of Economics\n\t\tTotal Credit: 120\n\t\tAdmission Fee: 15,000\n\t\tPer credit 1,500/-\n\t\tTotal Fees: 2,31,000/-\n" +
                        "\n2. Department of Social Science\n\t\tTotal Credit: 120\n\t\tAdmission Fee: 15,000\n\t\tPer credit 1,500/-\n\t\tTotal Fees: 2,31,000/-");

                faculty2.setText("02. Faculty of Arts:");
                faculty2txt1.setText("1. Department of Bengali Language & Literature\n\t\tTotal Credit: 120\n\t\tAdmission Fee: 15,000\n\t\tPer credit 2,400/-\n\t\tTotal Fees: 3,39,000/-\n" +
                        "\n2. Department of English\n\t\tTotal Credit: 120\n\t\tAdmission Fee: 15,000\n\t\tPer credit 2,400/-\n\t\tTotal Fees: 3,39,000/-");

                faculty3.setText("03. Faculty of Business Studies:");
                faculty3txt1.setText("1. Department of Business Administration\n\t\tTotal Credit: 123\n\t\tAdmission Fee: 30,000\n\t\tPer credit 2,500/-\n\t\tTotal Fees: 3,58,000/-");

                faculty4.setText("04. Faculty of Engineering:");
                faculty4txt1.setText("1. Department of Architecture\n\t\tTotal Credit: 208.5\n\t\tAdmission Fee: 15,000\n\t\tPer credit 2,500/-\n\t\tTotal Fees: 5,98,800/-\n" +
                        "\n2. Department of Computer Science & Engineering\n\t\tTotal Credit: 160\n\t\tAdmission Fee: 15,000\n\t\tPer credit 1,800/-\n\t\tTotal Fees: 3,51,000/-\n" +
                        "\n3. Department of Electrical and Electronics Engineering\n\t\tTotal Credit: 120\n\t\tAdmission Fee: 15,000\n\t\tPer credit 1,800/-\n\t\tTotal Fees: 3,51,000/-");

                faculty5.setText("05. Faculty of Law:");
                faculty5txt1.setText("1. Department of law\n\t\tTotal Credit: 120\n\t\tAdmission Fee: 15,000\n\t\tPer credit 4,000/-\n\t\tTotal Fees: 5,31,000/-");

                faculty6.setText("06. Faculty of Science:");
                faculty6txt1.setText("1. Department of Chemistry\n\t\tTotal Credit: 160\n\t\tAdmission Fee: 15,000\n\t\tPer credit 1,200/-\n\t\tTotal Fees: 2,55,000/-\n" +
                        "\n2. Department of Mathematics\n\t\tTotal Credit: 160\n\t\tAdmission Fee: 15,000\n\t\tPer credit 1,000/-\n\t\tTotal Fees: 2,23,000/-\n" +
                        "\n3. Department of Public Health (MPH)\n\t\tTotal Credit: 120\n\t\tAdmission Fee: 15,000\n\t\tPer credit 2,400/-\n\t\tTotal Fees: 3,39,000/-");

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //Southern University Bangladesh, Chittagong
            else if(value.equals("SUB")) {
                getSupportActionBar().setTitle("SUB");
                scrl.setBackgroundResource(R.drawable.background_pvt);

                overviewTxt1.setText("Private University");

                varsityName.setText("Southern University Bangladesh, Chittagong");
                year.setText("2002");
                student.setText("5,000");
                hall.setText("N/A");
                department.setText("12");
                nickName.setText("SUB");
                location.setText("Chittagong, Bangladesh");
                campus.setText("");

                email.setText("southern.edu@gmail.com");
                mobile.setText("+88031-2851336-9");
                webAddress.setText("www.southern.edu.bd");

                faculty1.setText("01. Faculty of Arts:");
                faculty1txt1.setText("1. Department of English\n\t\tTotal Credit: 126\n\t\tAdmission Fee: 13,000\n\t\tPer credit 1,588/-\n\t\tTotal Fees: 2,00,088/-\n" +
                        "\n3. Department of Law\n\t\tTotal Credit: 60\n\t\tAdmission Fee: 13,000\n\t\tPer credit 834/-\n\t\tTotal Fees: 50,040/-");

                faculty2.setText("02. Faculty of Business Administration:");
                faculty2txt1.setText("1. Department of Business Administration\n\t\tTotal Credit: 126\n\t\tAdmission Fee: 13,000\n\t\tPer credit 2,183/-\n\t\tTotal Fees: 2,75,058/-");

                faculty3.setText("03. Faculty of Science and Technology:");
                faculty3txt1.setText("1. Department of Civil Engineering\n\t\tTotal Credit: 162\n\t\tAdmission Fee: 13,000\n\t\tPer credit 1,883/-\n\t\tTotal Fees: 3,05,046/-\n" +
                        "\n2. Department of EEE\n\t\tTotal Credit: 142\n\t\tAdmission Fee: 13,000\n\t\tPer credit 1,902/-\n\t\tTotal Fees: 2,70,084/-\n" +
                        "\n3. Department of Information Technology\n\t\tTotal Credit: 145.50\n\t\tAdmission Fee: 13,000\n\t\tPer credit 1,650/-\n\t\tTotal Fees: 2,40,075/-\n" +
                        "\n4. Department of Pharmacy\n\t\tTotal Credit: 162\n\t\tAdmission Fee: 13,000\n\t\tPer credit 2,223/-\n\t\tTotal Fees: 3,60,126/-");

                faculty4.setVisibility(View.GONE);;
                faculty4txt1.setVisibility(View.GONE);

                faculty5.setVisibility(View.GONE);
                faculty5txt1.setVisibility(View.GONE);

                faculty6.setVisibility(View.GONE);
                faculty6txt1.setVisibility(View.GONE);

                faculty7.setVisibility(View.GONE);
                faculty7txt1.setVisibility(View.GONE);

                faculty8.setVisibility(View.GONE);
                faculty8txt1.setVisibility(View.GONE);

                faculty9.setVisibility(View.GONE);
                faculty9txt1.setVisibility(View.GONE);

                faculty10.setVisibility(View.GONE);
                faculty10txt1.setVisibility(View.GONE);

                faculty11.setVisibility(View.GONE);
                faculty11txt1.setVisibility(View.GONE);

                faculty12.setVisibility(View.GONE);
                faculty12txt1.setVisibility(View.GONE);

                faculty13.setVisibility(View.GONE);
                faculty13txt1.setVisibility(View.GONE);
            }

            //...............................Private University..............................
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_for_details_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.home)
        {
            Intent intent = new Intent(DetailsActivity.this, MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}