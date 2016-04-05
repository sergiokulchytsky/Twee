package com.grreen.twee.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grreen.twee.R;

public class MostPopularFragment extends Fragment {

    private static final int LAYOUT = R.layout.popular_layout;

    private View view;

    public static MostPopularFragment getInstance() {
        Bundle args = new Bundle();
        MostPopularFragment mostPopularFragment= new MostPopularFragment();
        mostPopularFragment.setArguments(args);

        return mostPopularFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

}
