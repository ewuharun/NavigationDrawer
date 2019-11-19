package com.example.navigationdashboard;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    private LinearLayout houseLayout,flatLayout,renterLayout,complainLayout;
    private LinearLayout paymentDueLayout,paymentClearLayout,fileLayout,emergencyLayout;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        init(view);

        houseLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "House Layout clicked", Toast.LENGTH_SHORT).show();
            }
        });
        flatLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "flat Layout clicked", Toast.LENGTH_SHORT).show();
            }
        });

        renterLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "renter Layout clicked", Toast.LENGTH_SHORT).show();
            }
        });

        complainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "complain Layout clicked", Toast.LENGTH_SHORT).show();
            }
        });

        paymentDueLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Payment Due Layout clicked", Toast.LENGTH_SHORT).show();
            }
        });
        paymentClearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Payment Clear Layout clicked", Toast.LENGTH_SHORT).show();
            }
        });

        fileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "File Layout clicked", Toast.LENGTH_SHORT).show();

            }
        });

        emergencyLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Emergency Layout clicked", Toast.LENGTH_SHORT).show();
            }
        });





        return view;
    }

    private void init(View view) {
        houseLayout=view.findViewById(R.id.houseLayout);
        flatLayout=view.findViewById(R.id.flatLayout);
        renterLayout=view.findViewById(R.id.renterLayout);
        complainLayout=view.findViewById(R.id.complainLayout);
        paymentDueLayout=view.findViewById(R.id.paymentDueLayout);
        paymentClearLayout=view.findViewById(R.id.paymentClearLayout);
        fileLayout=view.findViewById(R.id.fileLayout);
        emergencyLayout=view.findViewById(R.id.emergencyLayout);

    }


}
