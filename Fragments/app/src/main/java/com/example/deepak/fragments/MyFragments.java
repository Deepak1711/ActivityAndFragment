package com.example.deepak.fragments;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by deepak on 24/6/16.
 */
public class MyFragments extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout= inflater.inflate(R.layout.fragments_my,container,false);
        EditText et=(EditText)layout.findViewById(R.id.editText);
        et.setText("HI");
        return  layout;
    }
}
