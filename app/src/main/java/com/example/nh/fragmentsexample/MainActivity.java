package com.example.nh.fragmentsexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements OnIncreaseClickListener {

    private int counter = 0;
    private SecondFragment secondFragment;
    private FirstFragment firstFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        secondFragment = new SecondFragment();
        firstFragment = new FirstFragment();
        firstFragment.setListener(this);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.first_fragment, firstFragment);
        ft.replace(R.id.second_fragment, secondFragment);
        ft.commit();
    }

    public void increaseClicked(){
        counter++;
        secondFragment.setCounter(counter);
    }

    @Override
    public void onIncreaseClick() {
        counter++;
        secondFragment.setCounter(counter);
    }
}
