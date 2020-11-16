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
public class trench_coat extends template_method{
    String nama = "Trench Coat";
    String bahan = "Gabardin";
    String asal = "Inggris";
    int stok = 13;
    int harga = 10899;
    
    void deskripsikan(){
        System.out.println();
        System.out.println("pakaian jenis ini terbuat dari bahan " + bahan + " dan berasal dari " + asal 
        + " .");    
    }
    
    void memiliki (){
        System.out.println("saat ini kami memiliki " + stok + " " + nama + " dengan harga Rp." + harga + 
        ",-");
    }
    
}