/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.deklarasi_dan_pengaksesan_variabel;

/**
 *
 * @author HP
 * Nama  : Demmy Ahriyan Rozak
 * NIM   : A2.1900041
 * Kelas : TI-IA
 */
public class Deklarasi_dan_pengaksesan_variabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilaiInt;
        final double PHI = 3.14; // konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        // menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel logika = " + nilaiLogika);
        System.out.println("Isi variabel Karakter = " + nilaiKarakter);
        
    }
    
}
