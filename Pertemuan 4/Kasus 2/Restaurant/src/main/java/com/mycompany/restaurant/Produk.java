package com.mycompany.restaurant;

public class Produk {
    private String[] nama_produk;
    private double[] harga_produk;
    private int[] qty;
    private static byte id = 0;

    public Produk() {
        nama_produk = new String[10];
        harga_produk = new double[10];
        qty = new int[10];
    }

    public void tambahMenuProduk(String nama, double harga, int stok) {
        this.nama_produk[id] = nama;
        this.harga_produk[id] = harga;
        this.qty[id] = stok;
        this.nextId();
    }

    public String getProduk(int i) {
        return this.nama_produk[i];
    }

    public double getHarga(int i) {
        return this.harga_produk[i];
    }

    public void tampilMenu() {
        System.out.println("Daftar produk anda : ");
        System.out.println("Nama" + String.format("%25s", "Harga"));
        System.out.println("=======================================");
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(i + 1 + " " + nama_produk[i] + "[" + qty[i] + "]" + "\t\tRp. " + harga_produk[i]);
            } else {
                if(nama_produk[i].length() < 8){
                    System.out.println(i + 1 + " " + nama_produk[i] + "[Habis]" + "\t\tRp. -");
                } else{
                    System.out.println(i + 1 + " " + nama_produk[i] + "[Habis]" + "\tRp. -");
                }
            }
        }
    }

    public boolean isOutOfStock(int id) {
        if (qty[id] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void nextId() {
        id++;
    }

    public boolean pesanProduk(int makan, int jumlah) {
        if (qty[makan - 1] - jumlah >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void newStock(int makan, int jumlah) {
        qty[makan - 1] = qty[makan - 1] - jumlah;
    }
}