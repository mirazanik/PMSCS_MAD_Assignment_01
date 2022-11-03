package com.miraz.visitingcard;

import java.util.ArrayList;

/**
 * Created by Md Miraz Hossain on 01-Nov-22.
 * miraz.anik@gmail.com
 */

public class RouteDetails
{
    private String routeID;
    private String routeName;
    private String driverName;
    private String driverNo;
    private ArrayList<String> routeList;

    public RouteDetails(String routeID, String routeName, String driverName, String driverNo, ArrayList<String> routeList)
    {
        this.routeID = routeID;
        this.routeName = routeName;
        this.driverName = driverName;
        this.driverNo = driverNo;
        this.routeList = routeList;
    }

    @Override
    public String toString()
    {


        return "Route Name=" + routeName + '\n' + "Driver Name=" + driverName + '\n' + "Driver No=" + driverNo + '\n' + "Route Details=" + routeList + "\n\n";
    }

    public ArrayList<String> getRouteList()
    {
        return routeList;
    }

    public void setRouteList(ArrayList<String> routeList)
    {
        this.routeList = routeList;
    }

    public String getRouteID()
    {
        return routeID;
    }

    public void setRouteID(String routeID)
    {
        this.routeID = routeID;
    }

    public String getRouteName()
    {
        return routeName;
    }

    public void setRouteName(String routeName)
    {
        this.routeName = routeName;
    }

    public String getDriverName()
    {
        return driverName;
    }

    public void setDriverName(String driverName)
    {
        this.driverName = driverName;
    }

    public String getDriverNo()
    {
        return driverNo;
    }

    public void setDriverNo(String driverNo)
    {
        this.driverNo = driverNo;
    }
}
