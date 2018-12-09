package com.model;

public class taxi {
    public String getLon() {
        return Lon;
    }

    public void setLon(String lon) {
        this.Lon = lon;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        this.Lat = lat;
    }

    private String Lon;
    private String Lat;

    public int getVehicleID() {
        return VehicleID;
    }

    public void setVehicleID(int vehicleID) {
        VehicleID = vehicleID;
    }

    private int VehicleID;

}
