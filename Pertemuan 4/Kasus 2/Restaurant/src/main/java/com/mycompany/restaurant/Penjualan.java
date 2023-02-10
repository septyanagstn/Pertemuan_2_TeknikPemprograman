package com.mycompany.restaurant;

public class Penjualan {
    private String[] nama_produk;
    private int[] quantity;
    private double[] harga_produk;
    private double harga_total;
    private static byte id =0;

    public Penjualan() {
        nama_produk = new String[10];
        quantity = new int[10];
        harga_produk = new double[10];
    }

    public void setPesanan(String getMakanan, int jumlah, double harga) {
        this.nama_produk[id] = getMakanan;
        this.quantity[id] = jumlah;
        this.harga_produk[id] = harga;
        this.nextId();
    }

    public void setHarga() {
        for (int i = 0; i < id; i++) {
            this.harga_produk[i] = this.quantity[i] * this.harga_produk[i];
        }
        for (int i = 0; i < id; i++) {
            this.harga_total = this.harga_total + this.harga_produk[i];
        }
    }

    public void daftarPesanan() {
        System.out.println("Daftar pesanan anda : ");
        System.out.println("Nama" + String.format("%18s", "Jumlah") + "\t" + "Harga");
        System.out.println("=======================================");
        for (int i = 0; i < id; i++) {
            if(nama_produk[i].length() < 6 && i+1 < 10){
                System.out.println(i + 1 + " " + nama_produk[i] + "\t\t" + quantity[i] 
                + "\tRp. " + harga_produk[i]);
            } else{
                System.out.println(i + 1 + " " + nama_produk[i] + "\t" + quantity[i] 
                + "\tRp. " + harga_produk[i]);
            }
        }
        System.out.println("=======================================");
        System.out.println("Total" + String.format("%18s", "=") 
        + "\tRp. " + harga_total);
    }

    public void nextId() {
        id++;
    }
}