/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.memasukkan_nilai_dari_keyboard;

import java.util.Scanner;
/**
 *
 * @author HP
 * Nama  : Demmy Ahriyan Rozak
 * NIM   : A2.1900041
 * Kelas : TI-IA
 */
public class Memasukkan_nilai_dari_keyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println(" Nama anda adalah "+nama);
    }
    
}
