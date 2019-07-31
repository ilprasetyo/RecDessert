package com.ilham.RecDessertApps.view.About;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ilham.RecDessertApps.R;

public class AboutFragment extends Fragment {

    public AboutFragment(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.fragment_about, container, false);

        getActivity().setTitle("About");

        return view;
    }
}
