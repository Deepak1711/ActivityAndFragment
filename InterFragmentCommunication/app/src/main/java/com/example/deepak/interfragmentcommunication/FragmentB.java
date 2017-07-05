package com.example.deepak.interfragmentcommunication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by deepak on 24/6/16.
 */
public class FragmentB extends Fragment {
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.b_fragment,container,false);
    }

    public void changeData(int Data)
    {
      textView= (TextView) getActivity().findViewById(R.id.textView);
        String msg=Data+"";
        textView.setText(msg);
    }
}
