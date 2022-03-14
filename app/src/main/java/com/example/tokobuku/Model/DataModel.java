package com.example.tokobuku.Model;

public class DataModel {
    private int id, hrBuku, stok;
    private String judul_buku, penerbi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHrBuku() {
        return hrBuku;
    }

    public void setHrBuku(int hrBuku) {
        this.hrBuku = hrBuku;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getPenerbi() {
        return penerbi;
    }

    public void setPenerbi(String penerbi) {
        this.penerbi = penerbi;
    }
}
