package pakaian;

import pakaian.AdapterPattern.Adapter_jbtersedia;

import pakaian.TemplatePattern.TemplateMethod;
import pakaian.TemplatePattern.TemplateMethod_TrenchCoat;
import pakaian.TemplatePattern.TemplateMethod_Syal;
import pakaian.SingletonPattern.singleton_baju;  

public class Pakaian {
    public static void main(String[] args) {
        
         //demo Singleton
        
        //Test ke-1 dengan panggil method turunan
        System.out.println("**Singleton**");
        System.out.println("\n ====== Test ke-1  ===== \n ");
        singleton_baju baju = singleton_baju.GetInstance(); //membuat objek baru dengan menggunakan method GetInstance
        baju.bahan_baju(); //Gunakan objek baju untuk panggil method bahan_baju di class singleton_baju untuk test class singleton berfungsi
        
        //demo Adapter
        System.out.println("");
        System.out.println("**Adapter**");
        Adapter_jbtersedia jbtersedia = new Adapter_jbtersedia();
        jbtersedia.cekjb("kemeja");
        jbtersedia.cekjb("kaos");
        jbtersedia.cekjb("gaun");
        jbtersedia.cekjb("jaket");
        
        //Demonstrasi Template Method//
        TemplateMethod presentasi = new TemplateMethod_TrenchCoat();
        presentasi.mulai();
        
        //TemplateMethod_Syal ditimpakan ke presentasi
        presentasi = new TemplateMethod_Syal();
        presentasi.mulai();
    }
    
}
