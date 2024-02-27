/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbopert2;
import java.util.Scanner;
/**
 *
 * @author azkiy
 */
public class pbopert2no3 {
    public static void main(String[] args) {
        // Input jumlah peserta
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = scanner.nextInt();

        // Hitung jumlah mobil yang diperlukan
        int jumlahMobil = (int) Math.ceil((double) 
                jumlahPeserta / 7);

        // Tampilkan hasil
        System.out.println("Jumlah mobil yang disediakan: "
                + jumlahMobil);
    }
}
