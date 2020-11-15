/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakaian;

/**
 *
 * @author Ruu
 */
public class Pakaian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // a
        //demo template method
        template_method presentasi = new trench_coat();
        presentasi.mulai();
        
        presentasi = new syal();
        presentasi.mulai();
    }
    
}
