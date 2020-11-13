package com.hfad.duck;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void test(View v){
        Toast t = Toast.makeText(this,getText(R.string.test),Toast.LENGTH_SHORT);
        t.show();
    }
}
