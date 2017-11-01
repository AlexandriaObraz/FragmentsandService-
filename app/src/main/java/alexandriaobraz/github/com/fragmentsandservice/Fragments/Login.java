package alexandriaobraz.github.com.fragmentsandservice.Fragments;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.util.Log;

import alexandriaobraz.github.com.fragmentsandservice.R;


public class Login extends Activity {

    public static final String TAG=Login.class.getSimpleName();
    public static final String SAVED_DATA = "saved_data";
    private String emptyString="";


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy: ");
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(SAVED_DATA, emptyString);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        emptyString=savedInstanceState.getString(SAVED_DATA);
        super.onRestoreInstanceState(savedInstanceState);
    }
}
