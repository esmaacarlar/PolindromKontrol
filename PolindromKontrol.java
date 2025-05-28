package bm2.sinif;

import java.util.Scanner;

public class PolindromKontrol {
    public static boolean polindromMu(String ifade) {
        
        int uzunluk = ifade.length();
        int basindex;
        // Yığıt oluşturma
        stack yigit = new stack(uzunluk);
        // İlk yarıyı yığıta ekle
        for (int i = 0; i < uzunluk / 2; i++) {
            yigit.ekleme(ifade.charAt(i));
        }
        // Eğer ifade uzunluğu tekse, ortadaki karakteri atla
        if(uzunluk%2 == 0)
            basindex = uzunluk/2;
        else
            basindex = (uzunluk/2) + 1;
        // İkinci yarıyı yığıt ile karşılaştır
        for (int i = basindex; i < uzunluk; i++) {
            if (!yigit.bosmu() && yigit.cikarma() != ifade.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir kelime girin: ");
        String kullaniciIfadesi = klavye.nextLine();
        if (polindromMu(kullaniciIfadesi.toLowerCase())) {
            System.out.println("Girilen ifade bir palindromdur.");
        } 
        else {
            System.out.println("Girilen ifade bir palindrom değildir.");
        }
    }
}