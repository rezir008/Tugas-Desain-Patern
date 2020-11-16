package pakaian.AdapterPattern;

public class Adapter_jbtersedia implements Adapter_baju{
    Adapter_jbtersedia_new adapter_jbtersedia_new;
    
    @Override
    public void cekjb(String jbaju) {
        if(jbaju.equalsIgnoreCase("kemeja")){
            System.out.println("jenis " + jbaju + " yang tersedia adalah :");
            System.out.println("1. Flanel");
            System.out.println("2. Kantor");
            System.out.println("3. Lengan Pendek Klasik");
            System.out.println("4. Denim");
            System.out.println("5. Linen");
            System.out.println("6. Formal");
            System.out.println("7. Hawaii");
            System.out.println("8. Overshirt");
        } 
        else if(jbaju.equalsIgnoreCase("jaket") || jbaju.equalsIgnoreCase("kaos")){
            adapter_jbtersedia_new = new Adapter_jbtersedia_new(jbaju); 
            adapter_jbtersedia_new.cekjb(jbaju);
        }
        else{
            System.out.println("Jenis Baju Tidak Tersedia");
        }
        System.out.println("");
    }
    
}
