package com.model;

public class heat {
    private String Num;
    private double coord[];

    public void setNum(String num) {
        this.Num = num;
    }

    public String getNum() {
        return Num;
    }

    public double[] getCoord() {
        return coord;
    }

    public void setCoord(double[] coord) {
        this.coord = coord;
    }
}
