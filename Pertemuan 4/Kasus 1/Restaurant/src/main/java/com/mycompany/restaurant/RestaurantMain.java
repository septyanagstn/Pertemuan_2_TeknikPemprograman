package com.mycompany.restaurant;

public class RestaurantMain {
    public static void main(String[] args) {

        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        // memanggil modul pesan makan dan mengurangi stoknya
        menu.pesanMakan(1, 10);
        menu.tampilMenuMakanan();
    }
}