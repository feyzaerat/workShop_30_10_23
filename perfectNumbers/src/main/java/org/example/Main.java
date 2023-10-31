package org.example;

public class Main {
    public static void main(String[] args) {

        int sayi = 2;
        int sayac = 0;

        while (sayac < 10) {
            if (isMukemmelSayi(sayi)) {
                System.out.println(sayi);
                sayac++;
            }
            sayi++;
        }
    }

    // Bir sayının mükemmel sayı olup olmadığını kontrol eden fonksiyon
    public static boolean isMukemmelSayi(int sayi) {
        int toplam = 1; // 1 her zaman bölenlerin toplamının bir parçasıdır
        for (int i = 2; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        return toplam == sayi;
    }
}