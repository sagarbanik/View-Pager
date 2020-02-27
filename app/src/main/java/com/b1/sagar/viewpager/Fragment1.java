package com.b1.sagar.viewpager;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {


    TextView tvName;
    ImageView imgView;
    Button openDialog;

    public Fragment1() {

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_layout1,container,false);

        tvName = view.findViewById(R.id.tv1);
        imgView = view.findViewById(R.id.iv1);
        openDialog = view.findViewById(R.id.btn1);

        openDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

        return view;
    }

    public void showDialog(){

        String[] data =  getResources().getStringArray(R.array.item_name);

        AlertDialog.Builder builder1 = new AlertDialog.Builder(getContext());
        builder1.setMessage("This item is : " + data[0]);
        builder1.setCancelable(true);


        builder1.setNegativeButton(
                "Close",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
}
