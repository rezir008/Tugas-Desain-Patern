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
    String bahan;
    String asal;
    abstract void deskripsikan();
    
   
    public final void mulai() {
        deskripsikan();
    }
}
