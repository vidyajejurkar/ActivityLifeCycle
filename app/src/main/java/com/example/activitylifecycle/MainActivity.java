package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override

    /* onCreate call only one during lifecycle of activity. it is called when intsance of an activity get called*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("TAG","in onCreate");
    }

    /* onStart it is called when activity gets visible to user */

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG","in onStart");

    }


    /* onResume it is called when user start interacting with activity */

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG","in onResume");

    }

    /*onRestart will be called when restart the activity*/
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG","in onRestart");

    }

    /* onPause it is called when other activity comes in foreground */

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG","in onPause");

    }

    /* onStop it is called when activity is not visible to user  */

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG","in onStop");

    }

    /* onStop it is called when activity is get destroyed */

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG","in onDestroy");

    }
}


//when first tome launch app onCreate,onStart,OnResume will be called.
// when u pressed back button onPause,onStop,onDestroy will be called.
//when u pressed home button onPause,onStopwill be called.
//when u click on activity again onRestart,onStart,onResume will be called.