package com.k10.quran;

public class Surahh {
    private String infoQuran;
    private String nomor;
    private String asma;
    private String nama;
    private String arti;
    private String ayat;
    private String urutan_turun;
    private String nuzul;
    private String ruku;
    private String keterangan;

    public Surahh() {}

    public Surahh(String nomor, String asma, String nama, String arti, String ayat, String urutan_turun, String nuzul, String ruku, String keterangan) {
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

    public void setNomor(String nomor) {
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

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }

    public String getUrutan_turun() {
        return urutan_turun;
    }

    public void setUrutan_turun(String urutan_turun) {
        this.urutan_turun = urutan_turun;
    }

    public String getNuzul() {
        return nuzul;
    }

    public void setNuzul(String  nuzul) {
        this.nuzul = nuzul;
    }

    public String getRuku() {
        return ruku;
    }

    public void setRuku(String ruku) {
        this.ruku = ruku;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getInfoQuran() {
        return infoQuran;
    }

    public void setInfoQuran(String infoQuran) {
        this.infoQuran = infoQuran;
    }
}