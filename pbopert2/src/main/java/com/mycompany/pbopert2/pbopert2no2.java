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
public class pbopert2no2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = scanner.nextDouble();
        System.out.print("Masukkan nilai Tugas: ");
        double tugas = scanner.nextDouble();
        
        double NilaiAkhir = (0.35 * uts) + (0.45 *uas)+(0.20 *tugas);
    
        String ind = "";
        if(NilaiAkhir>=80 && NilaiAkhir <=100){
            ind = "A";
        }else if(NilaiAkhir>=70 && NilaiAkhir <=80){
            ind = "B";
        }else if(NilaiAkhir>=50 && NilaiAkhir <70){
            ind = "C";
        } else {
            ind = "tidak memiliki indeks";
        }
        
        System.out.println("Nilai Akhir: " + NilaiAkhir);
        System.out.println("Indeks Akhir: " + ind);
    }
}
