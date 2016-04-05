package com.grreen.twee.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grreen.twee.R;

public class SearchFlightFragment extends Fragment {

    private static final int LAYOUT = R.layout.search_layout;

    private View view;

    public static SearchFlightFragment getInstance() {
        Bundle args = new Bundle();
        SearchFlightFragment fragment = new SearchFlightFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}