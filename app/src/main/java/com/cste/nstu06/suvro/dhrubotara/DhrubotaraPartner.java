package com.cste.nstu06.suvro.dhrubotara;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by SUVRO on 14-11-15.
 */
public class DhrubotaraPartner extends Activity{
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dhrubotara_partner);
        tv1=  (TextView) findViewById(R.id.tvDsP);


    }

}

