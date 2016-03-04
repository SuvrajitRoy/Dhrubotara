package com.cste.nstu06.suvro.dhrubotara;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by SUVRO on 13-11-15.
 */
public class DydfAbOutcome extends Activity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dydf_about_outcome);
        tv1=  (TextView) findViewById(R.id.tvDyAbO);

    }


}