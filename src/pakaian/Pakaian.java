package pakaian;

import pakaian.AdapterPattern.Adapter_jbtersedia;

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
    }
    
}
