package com.example.universitycorner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;

public class VarsityList extends AppCompatActivity {

    private ListView listView;

    private String[] varsityList;

    private LinearLayout linearLayout;

    private String value;

    private Animation bottomAnim;

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varsity_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView)findViewById(R.id.varsityList);

        linearLayout = (LinearLayout)findViewById(R.id.linearlayout);

        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        listView.setAnimation(bottomAnim);

        Bundle bundle = getIntent().getExtras();

        //storing list from string_resources
        if(bundle != null)
        {
            value = bundle.getString("tag");
            if(value.equals("engineering")) {
                getSupportActionBar().setTitle("Engineering University");
                varsityList = getResources().getStringArray(R.array.engineering_varsity);
                linearLayout.setBackgroundResource(R.drawable.engineering_background);
            }

            else if(value.equals("medical")) {
                getSupportActionBar().setTitle("Medical College");
                varsityList = getResources().getStringArray(R.array.medical);
                linearLayout.setBackgroundResource(R.drawable.medical_background);
            }

            else if(value.equals("agricultural")) {
                getSupportActionBar().setTitle("Agricultural and Others");
                varsityList = getResources().getStringArray(R.array.agricultural);
                linearLayout.setBackgroundResource(R.drawable.agriculature_background);
            }

            else if(value.equals("general")) {
                getSupportActionBar().setTitle("Public University");
                varsityList = getResources().getStringArray(R.array.general);
                linearLayout.setBackgroundResource(R.drawable.public_background);
            }

            else if(value.equals("tech")) {
                getSupportActionBar().setTitle("Science and Technology");
                varsityList = getResources().getStringArray(R.array.science_and_tech);
                linearLayout.setBackgroundResource(R.drawable.science_tech_background);
            }

            else if(value.equals("national")) {
                getSupportActionBar().setTitle("National University");
                varsityList = getResources().getStringArray(R.array.national);
                linearLayout.setBackgroundResource(R.drawable.national_background);
            }
            else if(value.equals("pvt")) {
                getSupportActionBar().setTitle("Private University");
                varsityList = getResources().getStringArray(R.array.pvt);
                linearLayout.setBackgroundResource(R.drawable.background_pvt);
            }
        }

        adapter = new ArrayAdapter<String>(VarsityList.this, R.layout.sample_view, R.id.txtViewId, varsityList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //...............................Engineering University..............................

                if(value.equals("engineering"))
                {
                    if(adapter.getItem(position).equals("Bangladesh University of Engineering and Technology ( BUET )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "BUET");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Rajshahi University of Engineering and Technology ( RUET )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "RUET");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Chittagong University of Engineering and Technology ( CUET )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "CUET");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Khulna University of Engineering and Technology ( KUET )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "KUET");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Dhaka University of Engineering and Technology ( DUET )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "DUET");
                        startActivity(intent);
                    }
                }

                //...............................Engineering University..............................

                //...............................Medical college..............................

                else if(value.equals("medical"))
                {
                    if(adapter.getItem(position).equals("Chittagong Medical College"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "CMC");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Chittagong Medical University"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "CMU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Chittagong International Medical College"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "CIMCH");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Army Medical College Chittagong"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "AMC");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Southern Medical College, Chittagong"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "SMC");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Marine City Medical College, Chittagong"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "MCMC");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("University of Science and Technology, Chittagong"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "USTC");
                        startActivity(intent);
                    }
                }

                //...............................Medical college..............................

                //...............................Agricultural and Others..............................

                else if(value.equals("agricultural"))
                {
                    if(adapter.getItem(position).equals("Bangladesh Agricultural University ( BAU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "BAU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Bangabandhu Sheikh Mujibur Rahman Agricultural University ( BSMRAU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "BSMRAU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Sher-e-Bangla Agricultural University ( SAU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "SAU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Sylhet Agricultural University ( STAU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "StAU");
                        startActivity(intent);
                    }
                    else if(adapter.getItem(position).equals("Chittagong Veterinary and Animal Sciences University ( CVASU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "CVASU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Bangladesh University of Textile Engineering ( BUTEX )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "BUTex");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Textile Engineering College, Chittagong ( CTEC )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "CTEC");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Textile Engineering College, Noakhali"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "TECN");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Pabna Textile Engineering College"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "PTEC");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Bangabandhu Textile Engineering College"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "BTEC");
                        startActivity(intent);
                    }
                }

                //...............................Agricultural and Others..............................

                //...............................General University..............................

                else if(value.equals("general"))
                {
                    if(adapter.getItem(position).equals("University of Dhaka ( DU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "DU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("University of Rajshahi ( RU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "RU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("University of Chittagong ( CU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "CU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Jahangirnagar University ( JU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "JU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Islamic University Bangladesh ( IU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "IU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Khulna University ( KU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "KU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Jagannath University ( JNU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "JNU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Jatiya Kabi Kazi Nazrul Islam University ( JKKNIU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "JKKNIU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Comilla University ( COU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "COU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Bangladesh University of Professionals ( BUP )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "BUP");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Begum Rokeya University, Rangpur ( BRUR )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "BRUR");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("University of Barisal ( BU )"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "BU");
                        startActivity(intent);
                    }
                }

                //...............................General University..............................

                //...............................Private University..............................

                else if(value.equals("pvt"))
                {
                    if(adapter.getItem(position).equals("Asian University for Women, Chittagong"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "AUW");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Bandarban University, Chittagong"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "BUC");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("BGC Trust University Bangladesh, Chittagong"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "BGCTUB");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Chittagong Independent University"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "CIU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Coxs Bazar International University, Chittagong"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "CBIU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("East Delta University, Chittagong"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "EDU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("International Islamic University, Chittagong"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "IIUC");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Port City International University, Chittagong"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "PCIU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Premier University, Chittagong"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "PU");
                        startActivity(intent);
                    }

                    else if(adapter.getItem(position).equals("Southern University Bangladesh, Chittagong"))
                    {
                        Intent intent = new Intent(VarsityList.this, DetailsActivity.class);
                        intent.putExtra("tag", "SUB");
                        startActivity(intent);
                    }
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout, menu);

        MenuItem menuItem = menu.findItem(R.id.searchViewId);
        SearchView searchView = (SearchView)menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);

                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}