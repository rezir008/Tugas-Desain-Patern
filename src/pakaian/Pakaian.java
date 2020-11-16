package pakaian;

import pakaian.AdapterPattern.Adapter_jbtersedia;

import pakaian.TemplatePattern.TemplateMethod;
import pakaian.TemplatePattern.TemplateMethod_TrenchCoat;
import pakaian.TemplatePattern.TemplateMethod_Syal;

public class Pakaian {
    public static void main(String[] args) {
        
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
