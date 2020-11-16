/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakaian;

/**
 *
 * @author user
 */
public class syal extends template_method{
    String nama = "syal";
    String bahan = "Wool";
    String asal = "Italia";
    int stok = 6;
    int harga = 55999;
    
    void deskripsikan(){
        System.out.println();
        System.out.println("pakaian jenis ini terbuat dari bahan " + bahan + " dan berasal dari " + asal + 
        " .");
    }
    
    void memiliki(){
        System.out.println("saat ini kami memiliki " + stok + " " + nama + " dengan harga Rp." + harga + 
        ",-");
    }
    
}
