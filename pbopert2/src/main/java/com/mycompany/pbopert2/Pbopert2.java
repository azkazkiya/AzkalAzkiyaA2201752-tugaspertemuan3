/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbopert2;
import java.util.Scanner;

/**
 *
 * @author azkiy
 */
public class Pbopert2 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = scanner.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = scanner.nextInt();
        scanner.close();
        
        if(bil1 % 2==0 && bil2 % 2 == 0){
            int hasilJumlah = bil1 + bil2;
            System.out.println("Hasil Penjumlahan: " + hasilJumlah);
        } else if(bil1 % 2!=0 && bil2 % 2 != 0){
            int hasilKali = bil1 * bil2;
            System.out.println("Hasil perkalian: " + hasilKali);
        } else{
            System.out.println("Inputan harus 2 bilangan genap atau 2 bilangan ganjil");
        }
            
    }
}
