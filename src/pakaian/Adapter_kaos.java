package pakaian;

public class Adapter_kaos implements Adapter_baju_new{

    @Override
    public void kaos(String jbaju) {
        System.out.println("bahan "+ jbaju + " yang tersedia adalah :");
        System.out.println("1. Cotton Combed");
        System.out.println("2. Cotton Carded");
        System.out.println("3. Viscose");
        System.out.println("4. Cotton Viscose");
        System.out.println("5. Polyester");
        System.out.println("6. Hyget");
    }

    @Override
    public void jaket(String jbaju) {
        
    }
    
}
