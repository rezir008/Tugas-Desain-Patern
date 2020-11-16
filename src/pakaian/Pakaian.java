package pakaian;
import pakaian.SingletonPattern.singleton_baju;  

public class Pakaian {
    public static void main(String[] args) {
        //demo Singleton
        
        //Test ke-1 dengan panggil method turunan
        System.out.println("**Singleton**");
        System.out.println("\n ====== Test ke-1  ===== \n ");
        singleton_baju baju = singleton_baju.GetInstance(); //membuat objek baru dengan menggunakan method GetInstance
       
    }
    
}
