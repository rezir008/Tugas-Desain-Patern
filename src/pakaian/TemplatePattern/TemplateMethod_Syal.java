package pakaian.TemplatePattern;

public class TemplateMethod_Syal extends TemplateMethod{
    String nama = "Syal";
    String bahan = "Wool";
    String asal = "Italia";
    String panjang = "150 cm";
    int stok = 6;
    int harga = 55999;
    
    void deskripsikan(){
        System.out.println();
        System.out.println("pakaian jenis ini terbuat dari bahan " + bahan +
                " dan berasal dari " + asal + ".");
    }
    void memiliki(){
        System.out.println("saat ini kami memiliki " + stok + " " + nama +
                " dengan panjang " + panjang + " seharga Rp." + harga + ",-");
    }
}
