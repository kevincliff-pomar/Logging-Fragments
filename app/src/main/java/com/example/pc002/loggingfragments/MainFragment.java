package com.example.pc002.loggingfragments;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main_fragment, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();

        Log.d("FRAGMENT_TAG", "Fragment 1 onResume()");
    }

    @Override
    public void onStart() {
        super.onStart();

        Log.d("FRAGMENT_TAG", "Fragment 1 onStart()");
    }

    @Override
    public void onPause() {
        super.onPause();

        Log.d("FRAGMENT_TAG", "Fragment 1 onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();

        Log.d("FRAGMENT_TAG", "Fragment 1 onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d("FRAGMENT_TAG", "Fragment 1 onDestroy()");
    }
}
