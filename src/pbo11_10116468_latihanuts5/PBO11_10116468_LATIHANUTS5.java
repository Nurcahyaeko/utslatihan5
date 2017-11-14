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
public class PBO11_10116468_LATIHANUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JajarGenjang jg = new JajarGenjang(50, 60, 70, 80, 100, 120);
        jg.hitungKeliling();
        jg.hitungLuas();
        
        
        Segitiga sg = new Segitiga(50, 60, 70, 100, 120);
        sg.hitungKeliling();
        sg.hitungLuas();
        
        // TODO code application logic here
   
    }
    
}
