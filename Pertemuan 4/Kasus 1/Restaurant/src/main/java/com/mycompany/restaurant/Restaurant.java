package com.mycompany.restaurant;
public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id=0;
    
    public Restaurant(){
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
        this.nextId();
    }
    public void tampilMenuMakanan() {
        for (int i =0; i <=id; i++){
            if(!isOutOfStock(i)){
                System.out.println(i+1 + " " +nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }      
    }
    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        } else{
            return false;
        }
    }
    public void nextId(){
        id++;
    }
    public void pesanMakan(int makan, int jumlah) {
        if(isOutOfStock(makan-1) == false) {
            newStock(makan-1, jumlah);
        }
    }    
    public void newStock(int makan, int jumlah) {
        stok[makan] = stok[makan] - jumlah;
    }
}
