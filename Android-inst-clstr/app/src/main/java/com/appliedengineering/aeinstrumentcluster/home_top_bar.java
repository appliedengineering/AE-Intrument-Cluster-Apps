package com.appliedengineering.aeinstrumentcluster;
//import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class home_top_bar extends Fragment {
    public home_top_bar(){
        super(R.layout.home_top_bar_layout);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        // inflate the layout for this fragment
        View view = super.onCreateView(inflater, container, savedInstanceState);
        System.out.println("called create view for fragment");

        return view;
        //View view = inflater.inflate(R.layout.home_layout, container, false);
        //
        //return view;
    }

}