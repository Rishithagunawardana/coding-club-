package com.example.demo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void open(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/csharp/index.htm"));
        startActivity(browserIntent);
    }
    public void java(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/java/index.htm"));
        startActivity(browserIntent);
    }
    public void cplus(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/cplusplus/index.htm"));
        startActivity(browserIntent);
    }
    public void html(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/html/index.htm"));
        startActivity(browserIntent);
    }
    public void js(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tutorialspoint.com/javascript/index.htm"));
        startActivity(browserIntent);
    }
}
