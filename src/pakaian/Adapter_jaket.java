package pakaian;

public class Adapter_jaket implements Adapter_baju_new{

    @Override
    public void jaket(String jbaju) {
        System.out.println("jenis "+ jbaju + " yang tersedia adalah :");
        System.out.println("1. Bomber");
        System.out.println("2. Parka");
        System.out.println("3. Hoodie");
        System.out.println("4. Kulit");
        System.out.println("5. Sport");
        System.out.println("6. Biker");
        System.out.println("7. Parasut");
    }

    @Override
    public void kaos(String jbaju) {
        
    }
    
}
