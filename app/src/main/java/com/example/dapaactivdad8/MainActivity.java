package com.example.dapaactivdad8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LinkPress(View v) {
        String buttonName = getResources().getResourceEntryName(v.getId());

        String productLinkName = buttonName+"link";

        int productLinkId = getResources().getIdentifier(productLinkName, "string", getPackageName());

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(productLinkId))));
    }
}