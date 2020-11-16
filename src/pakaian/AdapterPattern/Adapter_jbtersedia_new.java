package pakaian.AdapterPattern;

public class Adapter_jbtersedia_new implements Adapter_baju{
    Adapter_baju_new adapter_baju_new;
    public Adapter_jbtersedia_new(String jbaju){
        if(jbaju.equalsIgnoreCase("kaos")){
            adapter_baju_new = new Adapter_kaos();
        }
        else if(jbaju.equalsIgnoreCase("jaket")){
            adapter_baju_new = new Adapter_jaket();
        }
    }
    @Override
    public void cekjb(String jbaju) {
        
        if(jbaju.equalsIgnoreCase("kaos")){
            adapter_baju_new.kaos(jbaju);
        }
        else if(jbaju.equalsIgnoreCase("jaket")){
            adapter_baju_new.jaket(jbaju);
        }
    }
}
