package TemplatePattern;

public abstract class TemplateMethod {
    String nama;
    String bahan;
    String asal;
    String ukuran;
    String panjang;
    int stok;
    int harga;
    abstract void deskripsikan();
    abstract void memiliki();
    
   
    public final void mulai() {
        deskripsikan();
        
        memiliki();
    }
}
