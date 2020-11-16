package pakaian.TemplatePattern;

public class TemplateMethod_TrenchCoat extends TemplateMethod {
    String nama = "Trench Coat";
    String bahan = "Gabardin";
    String asal = "Inggris";
    String ukuran = "XL";
    int stok = 13;
    int harga = 108999;
    
    void deskripsikan(){
        System.out.println();
        System.out.println("pakaian jenis ini terbuat dari bahan " + bahan +
                " dan berasal dari " + asal + ".");
    }
    void memiliki (){
        System.out.println("saat ini kami memiliki " + stok + " " + nama +
                " ukuran " + ukuran + " dengan harga Rp." + harga + ",-");
    }
}
