package com.cste.nstu06.suvro.dhrubotara;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by SUVRO on 09-11-15.
 */
public class DydfGyes extends Activity {
    TextView tv1,tv2;
    View v1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dydf_gyes);
        v1 = findViewById(R.id.viewDyG);
        tv1=  (TextView) findViewById(R.id.tvDyG1);
        tv2=  (TextView) findViewById(R.id.tvDyG2);
        (findViewById(R.id.layout1)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
        (findViewById(R.id.layout2)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));

    }


}
