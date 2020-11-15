package pakaian;

public class Adapter_jbtersedia implements Adapter_baju{
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
        System.out.println("");
    }
    
}
