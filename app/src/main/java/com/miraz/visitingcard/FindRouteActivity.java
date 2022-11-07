package com.miraz.visitingcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        //Get a reference to the Spinner
        Spinner spinnerRoute = (Spinner) findViewById(R.id.spnnerRoute);

        Intent intent = new Intent(this,RouteDetailsViewActivity.class);
        intent.putExtra(Constant.ROUTE_DETAILS,routeExpert.getRoute(this,String.valueOf(spinnerRoute.getSelectedItem())));
        intent.putExtra(Constant.ROUTE_FROM_TO,String.valueOf(spinnerRoute.getSelectedItem()));
        startActivity(intent);

/*        TextView routeDetails = (TextView) findViewById(R.id.tvRouteDetails);
        routeDetails.setText(routeExpert.getRoute(this,String.valueOf(spinnerRoute.getSelectedItem())));*/
    }
}