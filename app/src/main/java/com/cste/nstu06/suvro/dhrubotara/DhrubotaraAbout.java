package com.cste.nstu06.suvro.dhrubotara;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by SUVRO on 14-11-15.
 */
public class DhrubotaraAbout extends Activity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dhrubotara_about);
        tv1=  (TextView) findViewById(R.id.tvDsA);


    }


}