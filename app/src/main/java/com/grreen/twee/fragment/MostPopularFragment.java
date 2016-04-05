package com.grreen.twee.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grreen.twee.R;

public class MostPopularFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.popular_layout;

    public static MostPopularFragment getInstance(Context context) {
        Bundle args = new Bundle();
        MostPopularFragment mostPopularFragment= new MostPopularFragment();
        mostPopularFragment.setContext(context);
        mostPopularFragment.setTitle(context.getString(R.string.most_popular));
        mostPopularFragment.setArguments(args);

        return mostPopularFragment;
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
