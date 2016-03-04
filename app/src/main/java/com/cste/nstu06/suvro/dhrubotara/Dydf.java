package com.cste.nstu06.suvro.dhrubotara;

//import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Dydf extends Fragment {
	Button btnhome ,btnaboutDydf ,btnBoard,btnGyes,btnMedia,btnVolunteer,btnContact;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.dydf, container, false);
		
		
		btnhome = (Button) view.findViewById(R.id.dydfbutton1);
		btnhome.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , DydfHome.class);
				startActivity(i);
			}
		});

        btnaboutDydf = (Button) view.findViewById(R.id.dydfbutton2);
        btnaboutDydf.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent (getActivity() , DydfAbout.class);
                startActivity(i);
            }
        });
		btnBoard = (Button) view.findViewById(R.id.dydfbutton3);
		btnBoard.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i = new Intent (getActivity() , DydfBoard.class);
				startActivity(i);
			}
		});

        btnGyes = (Button) view.findViewById(R.id.dydfbutton4);
        btnGyes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent (getActivity() , DydfGyes.class);
                startActivity(i);
            }
        });
//        btnMedia = (Button) view.findViewById(R.id.dydfbutton5);
//        btnMedia.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent (getActivity() , DydfMedia.class);
//                startActivity(i);
//            }
//        });
//        btnVolunteer = (Button) view.findViewById(R.id.dydfbutton6);
//        btnVolunteer.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent (getActivity() , DydfVolunteer.class);
//                startActivity(i);
//            }
//        });
        btnContact = (Button) view.findViewById(R.id.dydfbutton7);
        btnContact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent (getActivity() , DydfContact.class);
                startActivity(i);
            }
        });
		return view;
	}
	


}
