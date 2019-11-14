/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.kambing_global;

/**
 *
 * @author HP
 * Nama     :   Demmy Ahriyan Rozak
 * NIM      :   A2.1900041
 * Kelas    :   TI-IA
 */
public class Kambing_global {
// Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing =88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing setelah ditambah : " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : " +
            jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing_global kambingSusu = new Kambing_global();
        
        //menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
