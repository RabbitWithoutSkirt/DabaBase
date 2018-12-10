package com.model;

import java.util.List;

public class heat {
    private int elevation;
    private List coord;

    public void setElevation(int num) {
        this.elevation = num;
    }

    public int getElevation() {
        return elevation;
    }

    public List getCoord() {
        return coord;
    }

    public void setCoord(List coord) {
        this.coord = coord;
    }
}
