package com.model;

public class grid {
    public String ID;
    public String name;
    public String sdate;
    public String ship;
    public String stock;
    public String note;

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public String getSdate() {
        return sdate;
    }

    public String getShip() {
        return ship;
    }

    public String getStock() {
        return stock;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
