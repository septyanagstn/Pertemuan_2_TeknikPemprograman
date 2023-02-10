package com.mycompany.restaurant;

import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        /* kamus data untuk pesan makanan */
        Scanner sc = new Scanner(System.in);
        int inputMakanan, jumlahMakanan;
        char counter = 'y';
        // Memanggil class Restaurant dan Pesanan
        Produk menu = new Produk();
        Penjualan pesan = new Penjualan();
        // Menambahkan stok menu ke class Restaurant
        menu.tambahMenuProduk("Bala-Bala", 1_000, 40);
        menu.tambahMenuProduk("Gehu", 1_500, 30);
        menu.tambahMenuProduk("Tahu", 1_000, 25);
        menu.tambahMenuProduk("Molen", 1_000, 20);
        menu.tambahMenuProduk("Combro", 1_500, 30);
        menu.tambahMenuProduk("Misro", 1_500, 15);
        menu.tambahMenuProduk("Cireng", 1_000, 20);
        menu.tambahMenuProduk("Donat", 2_000, 25);
        menu.tambahMenuProduk("Singkong", 1_500, 15);
        menu.tambahMenuProduk("Tempe", 1_000, 30);
        // Melakukan pemesanan dengan menginput sesuai menu yang dipilih
        menu.tampilMenu();
        while (counter == 'y') {
            System.out.print("Masukkan nomor makanan yang dipilih : ");
            inputMakanan = sc.nextInt();
            System.out.print("Masukkan jumlah yang dibeli : ");
            jumlahMakanan = sc.nextInt();
            if (menu.pesanProduk(inputMakanan, jumlahMakanan)) {
                menu.newStock(inputMakanan, jumlahMakanan);
                pesan.setPesanan(menu.getProduk(inputMakanan - 1), jumlahMakanan, menu.getHarga(inputMakanan - 1));
            } else {
                System.out.println("Stok tidak cukup, masukkan jumlah sesuai stok yang ada...");
            }
            menu.tampilMenu();
            System.out.print("Ingin memesan lagi? (y/n) : ");
            counter = sc.next().charAt(0);
        }
        pesan.setHarga();
        pesan.daftarPesanan();
        sc.close();
    }
}