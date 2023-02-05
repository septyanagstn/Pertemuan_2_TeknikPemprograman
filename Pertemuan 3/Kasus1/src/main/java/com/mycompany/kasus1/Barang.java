package com.mycompany.kasus1;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public int getstok() {
        return stok;
    }

    public void addstok(int stok) {
        this.stok += stok;
    }
}