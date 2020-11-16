package pakaian;

import TemplatePattern.TemplateMethod;
import TemplatePattern.TemplateMethod_TrenchCoat;
import TemplatePattern.TemplateMethod_Syal;

public class Pakaian {
    public static void main(String[] args) {
        
        //Demonstrasi Template Method//
        TemplateMethod presentasi = new TemplateMethod_TrenchCoat();
        presentasi.mulai();
        
        //TeplateMethod_Syal ditimpakan ke presentasi
        presentasi = new TemplateMethod_Syal();
        presentasi.mulai();
        
    }
    
}
