package com.example.emcako.birthdayreminder.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.emcako.birthdayreminder.R;

/**
 * Created by emcako on 1/16/2016.
 */
public class AddFriendFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_add_friend, container, false);
        return rootView;
    }


}