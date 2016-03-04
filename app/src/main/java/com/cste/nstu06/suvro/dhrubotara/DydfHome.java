package com.cste.nstu06.suvro.dhrubotara;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

/**
 * Created by SUVRO on 09-11-15.
 */
public class DydfHome extends Activity {
    TextView tv1, tv2;
    View v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dydf_home);
        v1 = findViewById(R.id.viewDyH1);
        tv1 = (TextView) findViewById(R.id.tvDyH1);
        tv2 = (TextView) findViewById(R.id.tvDyH2);
        (findViewById(R.id.layout1)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_in));
        (findViewById(R.id.layout2)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.ri8_in));

    }

//    @Override
//public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                         Bundle savedInstanceState) {
//    View view = inflater.inflate(R.layout.dydf_home, container, false);
//
//    v1 = view.findViewById(R.id.viewDyH1);
//        tv1 = (TextView) view.findViewById(R.id.tvDyH1);
//        tv2 = (TextView) view.findViewById(R.id.tvDyH2);
//
//    (view.findViewById(R.id.layout2)).startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.ri8_in));
//    (view.findViewById(R.id.layout2)).startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.ri8_in));
//    return view;
//}

}
