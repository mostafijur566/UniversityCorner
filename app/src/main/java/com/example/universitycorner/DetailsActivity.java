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

    private String website;


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

            //Bandarban University
            else if(value.equals("BUC")) {
                getSupportActionBar().setTitle("BUC");
                scrl.setBackgroundResource(R.drawable.background_pvt);

                overviewTxt1.setText("Private University");

                varsityName.setText("Bandarban University ");
                year.setText("2018");
                student.setText("N/A");
                hall.setText("N/A");
                department.setText("3");
                nickName.setText("BUC");
                location.setText("Chittagong, Bangladesh");
                campus.setText("N/A");

                email.setText("info@bubban.edu.bd");
                mobile.setText("+8801318-305899");
                webAddress.setText("www.bubban.edu.bd");

                faculty1.setText("01. School of Arts, Social Science and Law:");
                faculty1txt1.setText("1. Department of English\n2. Department of Governance and Development Studies");

                faculty2.setText("02. School of Business Administration:");
                faculty2txt1.setText("1. Department of Business Administration\n2. Department of Hospitality & Tourism Management");

                faculty3.setText("03. School of Science, Engineering and Technology");
                faculty3txt1.setText("1. Department of Computer Science and Engineering");

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
                faculty1txt1.setText("1. Department of English");

                faculty2.setText("02. Faculty of Business Administration:");
                faculty2txt1.setText("1. Department of Business Administration");

                faculty3.setText("03. Faculty of Law");
                faculty3txt1.setText("1. Department of Law");

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
                department.setText("5");
                nickName.setText("BUC");
                location.setText("Chittagong, Bangladesh");
                campus.setText("Jamal Khan");

                email.setText("info@ciu.edu.bd");
                mobile.setText("+88-031-611262");
                webAddress.setText("www.ciu.edu.bd");

                faculty1.setText("01. School of Business:");
                faculty1txt1.setText("1. Department of Business Administration");

                faculty2.setText("02. School of Engineering and Computer Science:");
                faculty2txt1.setText("1. Department of Computer Science\n2. Department of Computer Science and Engineering\n3. Department of Electrical and Electronic Engineering" +
                        "\n4. Department of Electronics and Telecommunication Engineering");

                faculty3.setText("03. School of Law:");
                faculty3txt1.setText("1. Department of Law");

                faculty4.setText("04. School of Liberal Arts and Social Sciences");
                faculty4txt1.setText("1. Department of English");

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