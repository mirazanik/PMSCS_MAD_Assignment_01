package com.miraz.visitingcard;

import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Md Miraz Hossain on 03-Nov-22.
 * miraz.anik@gmail.com
 */

public class RouteExpert
{
    String getRoute(Context context, String place)
    {

        StringBuilder MyRoute = new StringBuilder();
        ArrayList<RouteDetails> routeDetailsArrayList = getRouteDetailsArrayList(context);

        for (int i = 0; i < routeDetailsArrayList.size(); i++)
        {
            for (int j = 0; j < routeDetailsArrayList.get(i).getRouteList().size(); j++)
            {
                if (place.equals(routeDetailsArrayList.get(i).getRouteList().get(j)))
                {
                    MyRoute.append(routeDetailsArrayList.get(i));
                    break;
                }
            }
        }

        if(MyRoute.toString().isEmpty())
        {
            return "No Route Found";
        }
        else {
            return MyRoute.toString();
        }
    }

    private ArrayList<RouteDetails> getRouteDetailsArrayList(Context context)
    {
        RouteDetails routeDetails1 = new RouteDetails("1", "Route 1", "Md Sah Alom", "01781177191", new ArrayList<String>(Arrays.asList(context.getString(R.string.Khamarbari), context.getString(R.string.Kazipara), context.getString(R.string.Shewrapara), context.getString(R.string.Mirpur10), context.getString(R.string.Mirpur2), context.getString(R.string.Mirpur1), context.getString(R.string.Bangla_College), context.getString(R.string.Technical), context.getString(R.string.Gabtoli),context.getString(R.string.ju_university))));

        RouteDetails routeDetails2 = new RouteDetails("2", "Route 2", "Md Ashraful", "01817464825", new ArrayList<String>(Arrays.asList(context.getString(R.string.Shahbagh), context.getString(R.string.City_College), context.getString(R.string.Zigatola), context.getString(R.string.Dhanmondi15), context.getString(R.string.Star_kabab), context.getString(R.string.Sonkor), context.getString(R.string.Dhanmondi27), context.getString(R.string.Asad_Gate), context.getString(R.string.College_Gate), context.getString(R.string.Shyamoli), context.getString(R.string.Kallyanpur), context.getString(R.string.Technical), context.getString(R.string.Gabtoli),context.getString(R.string.ju_university))));

        RouteDetails routeDetails3 = new RouteDetails("3", "Route 3", "Md Sobahan", "01746689415", new ArrayList<String>(Arrays.asList(context.getString(R.string.Motijheel), context.getString(R.string.Paltan), context.getString(R.string.Press_club), context.getString(R.string.Moscho_vobon), context.getString(R.string.Shahbagh), context.getString(R.string.Science_lab), context.getString(R.string.Kalabagan), context.getString(R.string.Dhanmondi27), context.getString(R.string.College_Gate), context.getString(R.string.Shyamoli), context.getString(R.string.Kallyanpur), context.getString(R.string.Technical), context.getString(R.string.Gabtoli),context.getString(R.string.ju_university))));

        RouteDetails routeDetails4 = new RouteDetails("4", "Route 4", "Md Rubel", "01950029910", new ArrayList<String>(Arrays.asList(
                context.getString(R.string.Motijheel),
                context.getString(R.string.GPO),
                context.getString(R.string.Paltan),
                context.getString(R.string.Kakrail_more),
                context.getString(R.string.Shanti_nagar),
                context.getString(R.string.Malibagh),
                context.getString(R.string.Mouchak_Market),
                context.getString(R.string.Moghbazar_more),
                context.getString(R.string.Bangla_Motor),
                context.getString(R.string.Farmgate),
                context.getString(R.string.Manik_Mia_Avenue),
                context.getString(R.string.Gabtoli),
                context.getString(R.string.ju_university)

        )));

        RouteDetails routeDetails5 = new RouteDetails("5", "Route 5", "Md Korim", "01722160671", new ArrayList<String>(Arrays.asList(
                context.getString(R.string.Mohakhali_flyover),
                context.getString(R.string.Kakoli),
                context.getString(R.string.Banani),
                context.getString(R.string.Khilgaon),
                context.getString(R.string.Airport),
                context.getString(R.string.Azampur),
                context.getString(R.string.Abdullahpur),
                context.getString(R.string.Switch_gate),
                context.getString(R.string.Kamarpara),
                context.getString(R.string.Beribadh),
                context.getString(R.string.Ashulia),
                context.getString(R.string.Cand_b),
                context.getString(R.string.ju_university)
        )));

        ArrayList<RouteDetails> routeDetailsArrayList = new ArrayList<RouteDetails>();
        routeDetailsArrayList.add(routeDetails1);
        routeDetailsArrayList.add(routeDetails2);
        routeDetailsArrayList.add(routeDetails3);
        routeDetailsArrayList.add(routeDetails4);
        routeDetailsArrayList.add(routeDetails5);


        return routeDetailsArrayList;
    }
}
