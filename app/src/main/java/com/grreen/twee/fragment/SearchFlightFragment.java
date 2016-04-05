package com.grreen.twee.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grreen.twee.R;

public class SearchFlightFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.search_layout;

    public static SearchFlightFragment getInstance(Context context) {
        Bundle args = new Bundle();
        SearchFlightFragment fragment = new SearchFlightFragment();
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.search_flights));
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}