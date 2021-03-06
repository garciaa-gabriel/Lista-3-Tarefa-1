package com.example.ll3tarefa1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DebugActivity extends Activity {
    protected static final String TAG = "filtro";

    protected void onCreate(Bundle icicle){
        super.onCreate(icicle);
        Log.i(TAG, getClassName() + ".onCreate chamado.");
    }

    protected void onStart(){
        super.onStart();
        Log.i(TAG, getClassName() + ".onStart chamado.");
    }

    protected void onResume(){
        super.onResume();
        Log.i(TAG, getClassName() + ".onResume chamado.");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, getClassName() + ".onRestart chamado.");
    }

    protected void onPause(){
        super.onPause();
        Log.i(TAG, getClassName() + ".onPause chamado.");
    }

    protected void onStop(){
        super.onStop();
        Log.i(TAG, getClassName() + ".onStop chamado.");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, getClassName() + ".onDestroy chamado.");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG, getClassName() + ".onSaveInstanceState chamado.");
    }

    private String getClassName(){
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }
}
