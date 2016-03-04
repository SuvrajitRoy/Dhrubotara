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
public class DhrubotaraContact extends Activity{
    TextView tv1,tv2,tv3,tv4;
    View v1, v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dhrubotara_contact);
        v1 = findViewById(R.id.viewDsC1);
        v2 = findViewById(R.id.viewDsC2);
        tv1=  (TextView) findViewById(R.id.tvDsC1);
        tv2=  (TextView) findViewById(R.id.tvDsC2);
        tv3=  (TextView) findViewById(R.id.tvDsC3);
        tv4=  (TextView) findViewById(R.id.tvDsC4);

        (findViewById(R.id.layout1)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
        (findViewById(R.id.layout2)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));
        (findViewById(R.id.layout3)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
    }
    public void call(View view){
        Intent intent = new Intent (Intent.ACTION_CALL , Uri.parse("tel:+88-01835911212"));
        startActivity(intent);
    }
    public void call2(View view){
        Intent intent = new Intent (Intent.ACTION_CALL , Uri.parse("tel: +88- 01671683455"));
        startActivity(intent);
    }
    public void fb(View view){
        Intent intent = new Intent (Intent.ACTION_SEND , Uri.parse("https: www.facebook.com/dhrubotarayouthdevelopment foundation"));
        startActivity(intent);
    }
}

