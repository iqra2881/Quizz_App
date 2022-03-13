package com.example.lab04;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    public void bf(View view) {
        String url=("http://schemas.android.com/apk/res/android ");
        Intent in=new Intent(Intent.ACTION_VIEW);
        in.setData(Uri.parse(url));
        startActivity(in);

    }


    public void clickQA(View view) {
        Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(intent);

    }
}