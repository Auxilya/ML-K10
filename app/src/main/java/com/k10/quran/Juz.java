package com.k10.quran;

import java.io.Serializable;

public class Juz implements Serializable {
    private String ujuz;
    private String rsurah;

    public Juz() {
    }

    public Juz(String ujuz, String rsurah) {
        this.ujuz = ujuz;
        this.rsurah = rsurah;
    }

    public String getUjuz() {
        return ujuz;
    }

    public void setUjuz(String ujuz) {
        this.ujuz = ujuz;
    }

    public String getRsurah() {
        return rsurah;
    }

    public void setRsurah(String rsurah) {
        this.rsurah = rsurah;
    }
}