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

        //.............................CMC.............................
        else if(name.equals("cmc"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.cmc1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.cmc2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.cmc3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.cmc4);
        }
        //.............................CMC.............................

        //.............................CMU.............................
        else if(name.equals("cmu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.cmu1);
        }
        //.............................CMU.............................

        //.............................CIMCH.............................
        else if(name.equals("cimch"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.cimch1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.cimch2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.cimch3);

        }
        //.............................CIMCH.............................

        //.............................AMC.............................
        else if(name.equals("amc"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.amc1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.amc2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.amc3);

        }
        //.............................AMC.............................

        //.............................SMC.............................
        else if(name.equals("smc"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.smc1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.smc2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.smc3);

        }
        //.............................SMC.............................

        //.............................SMC.............................
        else if(name.equals("mcmc"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.mcmc1);

        }
        //.............................SMC.............................

        //.............................CMC.............................
        else if(name.equals("ustc"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.ustc1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.ustc2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.ustc3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.ustc4);
        }
        //.............................CMC.............................

        //.............................bau.............................
        else if(name.equals("bau"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.bau1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.bau2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.bau3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.bau4);
        }
        //.............................bau.............................

        //.............................bau.............................
        else if(name.equals("bsmrau"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.bsmrau1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.bsmrau2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.bsmrau3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.bsmrau4);
        }
        //.............................bau.............................

        //.............................sau.............................
        else if(name.equals("sau"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.sau1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.sau2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.sau3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.sau4);
        }
        //.............................sau.............................

        //.............................stau.............................
        else if(name.equals("stau"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.stau1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.stau2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.stau3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.stau4);
        }
        //.............................stau.............................

        //.............................cvasu.............................
        else if(name.equals("cvasu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.cvasu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.cvasu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.cvasu3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.cvasu4);
        }
        //.............................cvasu.............................

        //.............................BUTEX.............................
        else if(name.equals("butex"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.butex1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.butex2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.butex3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.butex4);
        }
        //.............................BUTEX.............................

        //.............................DU.............................
        else if(name.equals("du"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.du1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.du2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.du3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.du4);
        }
        //.............................DU.............................

        //.............................RU.............................
        else if(name.equals("ru"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.ru1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.ru2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.ru3);
        }
        //.............................RU.............................

        //.............................CU.............................
        else if(name.equals("cu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.cu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.cu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.cu3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.cu4);
        }
        //.............................CU.............................

        //.............................JU.............................
        else if(name.equals("ju"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.ju1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.ju2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.ju3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.ju4);
        }
        //.............................JU.............................

        //.............................IU.............................
        else if(name.equals("iu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.iu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.iu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.iu3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.iu4);
        }
        //.............................IU.............................

        //.............................KU.............................
        else if(name.equals("ku"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.ku1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.ku2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.ku3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.ku4);
        }
        //.............................KU.............................

        //.............................JNU.............................
        else if(name.equals("jnu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.jnu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.jnu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.jnu3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.jnu4);
        }
        //.............................JNU.............................

        //.............................JKKNIU.............................
        else if(name.equals("jkkniu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.jkkniu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.jkkniu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.jkkniu3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.jkkniu4);
        }
        //.............................JKKNIU.............................

        //.............................COU.............................
        else if(name.equals("cou"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.cou1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.cou2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.cou3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.cou4);
        }
        //.............................COU.............................

        //.............................BUP.............................
        else if(name.equals("bup"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.bup1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.bup2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.bup3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.bup4);
        }
        //.............................BUP.............................

        //.............................BRUR.............................
        else if(name.equals("brur"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.brur1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.brur2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.brur3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.brur4);
        }
        //.............................BRUR.............................

        //.............................BU.............................
        else if(name.equals("bu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.bu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.bu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.bu3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.bu4);
        }
        //.............................BU.............................

        //.............................SUST.............................
        else if(name.equals("sust"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.sust1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.sust2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.sust3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.sust4);
        }
        //.............................SUST.............................

        //.............................NSTU.............................
        else if(name.equals("nstu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.nstu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.nstu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.nstu3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.nstu4);
        }
        //.............................NSTU.............................

        //.............................HSTU.............................
        else if(name.equals("hstu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.hstu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.hstu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.hstu3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.hstu4);
        }
        //.............................HSTU.............................

        //.............................MBSTU.............................
        else if(name.equals("mbstu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.mbstu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.mbstu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.mbstu3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.mbstu4);
        }
        //.............................MBSTU.............................

        //.............................PSTU.............................
        else if(name.equals("PSTU"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.pstu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.pstu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.pstu3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.pstu4);
        }
        //.............................PSTU.............................

        //.............................JUST.............................
        else if(name.equals("JUST"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.just1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.just2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.just3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.just4);
        }
        //.............................JUST.............................

        //.............................BSMRSTU.............................
        else if(name.equals("BSMRSTU"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.bsmrstu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.bsmrstu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.bsmrstu3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.bsmrstu4);
        }
        //.............................BSMRSTU.............................

        //.............................RMSTU.............................
        else if(name.equals("RMSTU"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.rmstu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.rmstu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.rmstu3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.rmstu4);
        }
        //.............................RMSTU.............................

        //.............................CSTU.............................
        else if(name.equals("cstu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.cstu1);
        }
        //.............................CSTU.............................

        //.............................CGC.............................
        else if(name.equals("cgc"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.cgc1);
        }
        //.............................CGC.............................

        //.............................GHMMC.............................
        else if(name.equals("ghmmc"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.ghmmc1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.ghmmc2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.ghmmc3);
        }
        //.............................GHMMC.............................

        //.............................AUW.............................
        else if(name.equals("auw"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.auw1);
        }
        //.............................CGC.............................

        //.............................BUC.............................
        else if(name.equals("buc"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.buc1);
        }
        //.............................BUC.............................

        //.............................CIU.............................
        else if(name.equals("ciu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.ciu1);
        }
        //.............................CIU.............................

        //.............................EDU.............................
        else if(name.equals("edu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.edu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.edu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.edu3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.edu4);
        }
        //.............................EDU.............................

        //.............................IIUC.............................
        else if(name.equals("iiuc"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.iiuc1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.iiuc2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.iiuc3);

            else if(value.equals("img4"))
                img.setBackgroundResource(R.drawable.iiuc4);
        }
        //.............................IIUC.............................

        //.............................PCIU.............................
        else if(name.equals("pciu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.pciu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.pciu2);
        }
        //.............................PCIU.............................

        //.............................PU.............................
        else if(name.equals("pu"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.pu1);

            else if(value.equals("img2"))
                img.setBackgroundResource(R.drawable.pu2);

            else if(value.equals("img3"))
                img.setBackgroundResource(R.drawable.pu3);
        }
        //.............................PU.............................

        //.............................IIUC.............................
        else if(name.equals("sub"))
        {
            if(value.equals("img1"))
                img.setBackgroundResource(R.drawable.sub1);

        }
        //.............................IIUC.............................
    }
}