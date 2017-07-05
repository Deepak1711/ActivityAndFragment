package com.example.deepak.interfragmentcommunication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {
FragmentB fragb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentA fraga=new FragmentA();
        fragb=new FragmentB();
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.main,fraga,"a_fragment");
        transaction.add(R.id.main,fragb,"b_fragment");
        transaction.commit();
    }

    @Override
    public void storeData(int Data) {

        fragb.changeData(Data);
    }
}
