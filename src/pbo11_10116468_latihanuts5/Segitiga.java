/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11_10116468_latihanuts5;

/**
 *
 * @author User
 */
public class Segitiga implements BangunDatar{
    private int luas;
    private int keliling;
    private final int sisiAb ,sisiBc ,sisiCa ,alas, tinggi;
    
public Segitiga (int ab, int bc, int ca, int alas, int tinggi){
    this.sisiAb = ab;
    this.sisiBc = bc;
    this.sisiCa = ca;
    this.alas = alas;
    this.tinggi = tinggi;
}
        
    public void hitungLuas() {
        luas  = (int) (0.5 * alas * tinggi);
        System.out.println("Luas Segitiga : "+luas);
    }

    
    public void hitungKeliling() {
        keliling = sisiAb+sisiBc+sisiCa;
        System.out.println("Keliling Segitiga : "+keliling);
    }

}
