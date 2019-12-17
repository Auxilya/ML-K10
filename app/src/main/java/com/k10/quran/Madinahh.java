package com.k10.quran;

public class Madinahh {
    private String infoMadinahh;
    private String nomor;
    private String asma;
    private String nama;
    private String arti;
    private int ayat;
    private int urutan_turun;
    private String nuzul;
    private int ruku;
    private String  keterangan;

    public Madinahh() {}

    public Madinahh(String nomor, String asma, String nama, String arti, int ayat, int urutan_turun, String nuzul, int ruku, String keterangan) {
        this.nomor = nomor;
        this.asma = asma;
        this.nama = nama;
        this.arti = arti;
        this.ayat = ayat;
        this.urutan_turun = urutan_turun;
        this.nuzul = nuzul;
        this.ruku = ruku;
        this.keterangan = keterangan;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String  nomor) {
        this.nomor = nomor;
    }

    public String getAsma() {
        return asma;
    }

    public void setAsma(String asma) {
        this.asma = asma;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) { this.nama = nama; }

    public String getArti() {
        return arti;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }

    public int getAyat() {
        return ayat;
    }

    public void setAyat(int ayat) {
        this.ayat = ayat;
    }

    public int getUrutan_turun() {
        return urutan_turun;
    }

    public void setUrutan_turun(int urutan_turun) {
        this.urutan_turun = urutan_turun;
    }

    public String getNuzul() {
        return nuzul;
    }

    public void setNuzul(String  nuzul) {
        this.nuzul = nuzul;
    }

    public int getRuku() {
        return ruku;
    }

    public void setRuku(int ruku) {
        this.ruku = ruku;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getInfoMadinahh() {
        return infoMadinahh;
    }

    public void setInfoMadinahh(String infoMadinahh) {
        this.infoMadinahh = infoMadinahh;
    }
}