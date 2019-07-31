package com.ilham.RecDessertApps.view.Favorit;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ilham.RecDessertApps.R;

public class FavoritFragment extends Fragment {



    public FavoritFragment(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.favorit_fragment, container, false);

        getActivity().setTitle("Favorit");

        return view;
    }
}
