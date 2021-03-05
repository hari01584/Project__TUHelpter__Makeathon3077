package com.skullzbones.tuhelpter.ui.laundary;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.skullzbones.tuhelpter.R;
import com.skullzbones.tuhelpter.ui.main.LaundaryViewModel;

public class LaundaryFragment extends Fragment {

    private LaundaryViewModel mViewModel;

    public static LaundaryFragment newInstance() {
        return new LaundaryFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LaundaryViewModel.class);
        // TODO: Use the ViewModel
    }

}