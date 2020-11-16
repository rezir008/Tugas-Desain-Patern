package TemplateMethod;

public abstract class TemplateMethod {
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
