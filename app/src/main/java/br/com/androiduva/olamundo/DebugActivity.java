package br.com.androiduva.olamundo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DebugActivity extends Activity {
    protected static final String TAG = "teste";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "DebugActivity .onCreate() chamado");
        setContentView(R.layout.activity_debug);
    }

    @Override
    protected void onStart() {
        Log.i(TAG, "DebugActivity .onStart() chamado");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.i(TAG, "DebugActivity .onRestart() chamado");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "DebugActivity .onResume() chamado");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "DebugActivity .onPause() chamado");
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.i(TAG, "DebugActivity .onSaveInstanceState() chamado");
        super.onSaveInstanceState(outState);
    }
}
