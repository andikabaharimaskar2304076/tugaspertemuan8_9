/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

import java.util.Scanner;

/**
 *
 * @author Acer Nitro 5
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi1, sisi2, sisi3;
        String warna;

        System.out.print("sisi1: ");
        sisi1 = input.nextInt();
        System.out.print("sisi2: ");
        sisi2 = input.nextInt();
        System.out.print("sisi3: ");
        sisi3 = input.nextInt();
        System.out.print("Masukkan warna: ");
        warna = input.next();
        System.out.print("segitiga diisi true/false: ");
        boolean terisi = input.nextBoolean();

        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setWarna(warna);
        segitiga.setTerisi(terisi);

        System.out.println("\n" + segitiga.toString());
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Diisi: " + segitiga.getIsTerisi());
    }
}
