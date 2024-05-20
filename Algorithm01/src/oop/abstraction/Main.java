package oop.abstraction;

// Soyut sınıf
abstract class Sekil {
    // Soyut yöntem
    public abstract double alanHesapla();

    // Soyut olmayan yöntem
    public void yazdir() {
        System.out.println("Bu bir şekildir.");
    }
}

// Soyut sınıftan türetilen alt sınıf
class Dikdortgen extends Sekil {
    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    // Soyut yöntemi uygulama
    @Override
    public double alanHesapla() {
        return uzunluk * genislik;
    }
}

// Soyut sınıftan türetilen başka bir alt sınıf
class Daire extends Sekil {
    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    // Soyut yöntemi uygulama
    @Override
    public double alanHesapla() {
        return Math.PI * yaricap * yaricap;
    }
}

public class Main {
    public static void main(String[] args) {
        // Sekil sınıfından nesne oluşturulamaz (soyut bir sınıf olduğu için).
        // Sekil sekil = new Sekil(); // Hatalı

        // Alt sınıflardan nesne oluşturulabilir ve kullanılabilir.
        Dikdortgen dikdortgen = new Dikdortgen(5, 3);
        System.out.println("Dikdörtgen Alanı: " + dikdortgen.alanHesapla()); // 15.0
        dikdortgen.yazdir(); // Bu bir şekildir.

        Daire daire = new Daire(4);
        System.out.println("Daire Alanı: " + daire.alanHesapla()); // 50.26548245743669
        daire.yazdir(); // Bu bir şekildir.
    }
}