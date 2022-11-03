package com.miraz.visitingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindRouteActivity extends AppCompatActivity
{
    private RouteExpert routeExpert = new RouteExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_route);
    }

    //Call when the button gets clicked
    public void onClickFindRoute(View view)
    {
        TextView routeDetails = (TextView) findViewById(R.id.tvRouteDetails);

        //Get a reference to the Spinner
        Spinner spinnerRoute = (Spinner) findViewById(R.id.spnnerRoute);

        routeDetails.setText(routeExpert.getRoute(this,String.valueOf(spinnerRoute.getSelectedItem())));
    }
}