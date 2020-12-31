package com.appliedengineering.aeinstrumentcluster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;

import com.appliedengineering.aeinstrumentcluster.communication.communication;

public class home extends AppCompatActivity {

    private Boolean isSystemDarkMode(){
        switch (getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK) {
            case Configuration.UI_MODE_NIGHT_YES:
                return true;
            case Configuration.UI_MODE_NIGHT_NO:
                return false;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(isSystemDarkMode() ? R.style.DarkTheme : R.style.LightTheme);
        setContentView(R.layout.home_layout);
        System.out.println(" is dark mode - " + isSystemDarkMode());

        communication.init();

    }


}