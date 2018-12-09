package com.model;

public class heatmap {
    private double Lon;
    private double Lat;
    private String Num;
    public double getLon(){
        return Lon;
    }

    public void setLon(double lon) {
        this.Lon = lon;
    }

    public void setLat(double lat) {
        this.Lat = lat;
    }

    public double getLat() {
        return Lat;
    }

    public String getNum() {
        return Num;
    }

    public void setNum(String num) {
        this.Num = num;
    }
}
