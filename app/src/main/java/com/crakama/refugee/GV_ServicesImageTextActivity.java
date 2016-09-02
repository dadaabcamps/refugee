package com.crakama.refugee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by cate.rakama@gmail.com on 9/2/2016.
 */
public class GV_ServicesImageTextActivity extends AppCompatActivity {

    GridView servicesGridView;

    String[] gridViewString = {
            "PROTECTION", "Child Registration", "Repatriation", "rsd", "REFERRAL", "Resettlement",};

    int[] gridViewImageId = {
            R.drawable.protection, R.drawable.childregistration, R.drawable.repatriation, R.drawable.rsd, R.drawable.refferal,
            R.drawable.resettlement,};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gv_services);

        GV_ServicesActivity adapterViewAndroid = new GV_ServicesActivity(GV_ServicesImageTextActivity.this, gridViewString, gridViewImageId);
        servicesGridView = (GridView) findViewById(R.id.gv_services);
        servicesGridView.setAdapter(adapterViewAndroid);
        servicesGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(GV_ServicesImageTextActivity.this, "GridView Item: " + gridViewString[+i], Toast.LENGTH_LONG).show();
            }
        });

    }
}

