package com.cste.nstu06.suvro.dhrubotara;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Dhrubotara extends Fragment {
	Button btnHome , btnAbout ,btnExCom ,btnWhatDo ,btnPatner, btnContact;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.dhrubotara, container, false);
		
		btnHome = (Button) view.findViewById(R.id.dsssbutton1);
        btnHome.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , DhrubotaraHome.class);
				startActivity(i);
			}
		});
		
		btnAbout = (Button) view.findViewById(R.id.dsssbutton2);
        btnAbout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , DhrubotaraAbout.class);
				startActivity(i);
			}
		});
		
		btnExCom = (Button) view.findViewById(R.id.dsssbutton3);
		btnExCom.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , DhrubotaraExCommittee.class);
				startActivity(i);
			}
		});
		btnWhatDo = (Button) view.findViewById(R.id.dsssbutton4);
		btnWhatDo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , DhrubotaraWhatDo.class);
				startActivity(i);
			}
		});
		btnPatner = (Button) view.findViewById(R.id.dsssbutton5);
		btnPatner.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , DhrubotaraPartner.class);
				startActivity(i);
			}
		});

        btnContact = (Button) view.findViewById(R.id.dsssbutton6);
        btnContact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent (getActivity() , DhrubotaraContact.class);
                startActivity(i);
            }
        });
		return view;
	}
	

	


}
