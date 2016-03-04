package com.cste.nstu06.suvro.dhrubotara;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

/**
 * Created by SUVRO on 09-11-15.
 */
public class DydfAbout extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dydf_about);

        (findViewById(R.id.dyAbutton1)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
        (findViewById(R.id.dyAbutton2)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));
        (findViewById(R.id.dyAbutton3)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
        (findViewById(R.id.dyAbutton4)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));

    }

    public void showVission(View v) {
        Intent intent = new Intent(this, DydfAbVission.class);
        startActivity(intent);

    }
    public void showMission(View v) {
        Intent intent = new Intent(this, DydfAbMission.class);
        startActivity(intent);

    }
    public void showActivities(View v) {
        Intent intent = new Intent(this, DydfAbAct.class);
        startActivity(intent);

    }
    public void showOutcome(View v) {
        Intent intent = new Intent(this, DydfAbOutcome.class);
        startActivity(intent);

    }
}
