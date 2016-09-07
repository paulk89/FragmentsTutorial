package com.example.sita.fragmentstutorial;

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Configuration configInfo = getResources().getConfiguration();

        if(configInfo.orientation == Configuration.ORIENTATION_LANDSCAPE){
            LandscapeFragment  landscapeFragment = new LandscapeFragment();
            fragmentTransaction.replace(android.R.id.content, landscapeFragment);
        }else{
            PortraitFragment  portraitFragment = new PortraitFragment();
            fragmentTransaction.replace(android.R.id.content, portraitFragment);
        }
        fragmentTransaction.commit();
    }
}
