package com.k10.quran;

public class Juzz {
    private String infoJuzz;
    private int id;
    private String ujuz;
    private String rsurah;

    public Juzz() {}

    public Juzz(int id, String ujuz, String rsurah) {
        this.id = id;
        this.ujuz = ujuz;
        this.rsurah = rsurah;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUjuz() { return ujuz; }

    public void setUjuz(String ujuz) { this.ujuz = ujuz; }

    public String getRsurah() {
        return rsurah;
    }

    public void setRsurah(String rsurah) {
        this.rsurah = rsurah;
    }

    public String getInfoJuzz() {
        return infoJuzz;
    }

    public void setInfoJuzz(String infoJuzz) {
        this.infoJuzz = infoJuzz;
    }
}