package com.miraz.visitingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class RouteDetailsViewActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_details_view);

        Intent intent = getIntent();
        String details = intent.getStringExtra(Constant.ROUTE_DETAILS);
        String RouteFromTo = intent.getStringExtra(Constant.ROUTE_FROM_TO) +"\nTo\n"+ getString(R.string.ju_university);

        TextView tvRouteDetails = (TextView) findViewById(R.id.tvAllRouteDetails);
        tvRouteDetails.setText(details);

        TextView tvRouteFromTo = (TextView) findViewById(R.id.tvRouteFromTo);
        tvRouteFromTo.setText(RouteFromTo);
    }
}