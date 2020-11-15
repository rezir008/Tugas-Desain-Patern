package pakaian;

public class Pakaian {
    public static void main(String[] args) {
        //demo Singleton
        System.out.println("Singleton");
        singleton_baju baju = singleton_baju.GetInstance(); //membuat objek baru dengan menggunakan method GetInstance
        baju.jenis_baju(); //Gunakan objek baju untuk panggil method jenis_baju di class singleton_baju
      
        System.out.println("");
        System.out.println("Template Method");
        //demo template method
        
        template_method presentasi = new trench_coat();
        presentasi.mulai();
        
        presentasi = new syal();
        presentasi.mulai();
      
        //demo Adapter
        System.out.println("");
        System.out.println("Adapter");
        Adapter_jbtersedia jbtersedia = new Adapter_jbtersedia();
        jbtersedia.cekjb("kemeja");
        jbtersedia.cekjb("kaos");
        jbtersedia.cekjb("gaun");
        jbtersedia.cekjb("jaket");
    }
}