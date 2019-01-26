package com.example.nh.fragmentsexample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FirstFragment extends Fragment implements View.OnClickListener{

    private Button increaseBtn;
    private OnIncreaseClickListener listener;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment,container,false);
        increaseBtn = view.findViewById(R.id.btn_increase);
        increaseBtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_increase){
            //((MainActivity)getActivity()).increaseClicked();
            listener.onIncreaseClick();
        }
    }

    public void setListener(OnIncreaseClickListener listener) {
        this.listener = listener;
    }
}
