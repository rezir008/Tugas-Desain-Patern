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
public abstract class template_method {
    String nama;
    String bahan;
    String asal;
    int stok;
    int harga;
    abstract void deskripsikan();
    abstract void memiliki();
    
   
    public final void mulai() {
        deskripsikan();
        
        memiliki();
    }
}
