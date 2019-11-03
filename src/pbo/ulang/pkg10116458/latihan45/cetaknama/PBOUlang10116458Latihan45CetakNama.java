/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Printer ptr = new Printer ();
        
        System.out.println("===== Aplikasi Pencetak Nama=====");    
        System.out.print("Masukkan nama anda : ");
        ptr.setNama(sc1.nextLine());
        
        System.out.print("Mau cetak nama berapa kali? : ");
        ptr.setJmlCetak(sc2.nextInt());
        
        System.out.println("Nama Anda : " + ptr.getNama());
        ptr.cetak(ptr.getJmlCetak(), ptr.getNama());
    }
    
}
