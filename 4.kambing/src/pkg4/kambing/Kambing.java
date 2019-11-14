/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.kambing;

/**
 *
 * @author HP
 * Nama     :   Demmy Ahriyan Rozak
 * NIM      :   A2.1900041
 * Kelas    :   TI-IA
 */
public class Kambing {
    public void tambahKambing(){
     // deklarasi variabel lokal
    int jumlahKambing = 0;
   
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah kambing setelah ditambah : " +
            jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
}
