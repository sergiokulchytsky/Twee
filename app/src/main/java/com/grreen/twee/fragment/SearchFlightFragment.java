package com.grreen.twee.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

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
        final Context contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.style.TextInput);
        LayoutInflater localInflater = inflater.cloneInContext(contextThemeWrapper);

        view = localInflater.inflate(LAYOUT, container, false);

        initSpinner(view, R.id.flight_class, R.array.class_array, R.layout.spinner_item, R.layout.spinner_dropdown_item);

        initSpinner(view, R.id.adults_spin, R.array.num_array, R.layout.spinner_item_ad, R.layout.spinner_dropdown_item);
        initSpinner(view, R.id.children_spin, R.array.num_array, R.layout.spinner_item_ch, R.layout.spinner_dropdown_item);
        initSpinner(view, R.id.infants_spin, R.array.num_array, R.layout.spinner_item_inf, R.layout.spinner_dropdown_item);

        initButton();

        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    private void initSpinner(View view, int id, int content, int itemLayout, int dropLayout) {
        final Spinner classSpinner = (Spinner) view.findViewById(id);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), content, itemLayout);
        adapter.setDropDownViewResource(dropLayout);
        if (classSpinner != null) {
            classSpinner.setAdapter(adapter);
        }

        assert classSpinner != null;
        classSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                classSpinner.setPrompt("Select class...");
            }
        });

    }

    private void initButton() {
        Button button = (Button) view.findViewById(R.id.search);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}