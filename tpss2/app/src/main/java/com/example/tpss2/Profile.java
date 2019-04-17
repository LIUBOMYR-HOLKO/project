package com.example.tpss2;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.widget.AppCompatEditText;

import java.lang.String;



public class Profile extends Fragment {

   EditText weight;
    EditText height;
    EditText age;
//    EditText sex;
    TextView physic;
   int w,h,a,s;

    @SuppressLint("WrongViewCast")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        weight = rootView.findViewById(R.id.weighte);
        height = rootView.findViewById(R.id.heighte);
        age = rootView.findViewById(R.id.agee);
        int w = Integer.parseInt(weight.getText().toString());
        int h = Integer.parseInt(height.getText().toString());
        int a = Integer.parseInt(age.getText().toString());

        int result = w + h+a;

//        result =  тут треба зробити шось. Шоб обрахунки виводились на екран(TextView)
         return rootView;
    }

}
