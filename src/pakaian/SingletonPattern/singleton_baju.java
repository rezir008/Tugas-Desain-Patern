/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakaian.SingletonPattern;

/**
 *
 * @author FERRY PRATAMA
 */
public class singleton_baju {
    private static singleton_baju instance; //membuat instance/objek singleton_baju
  
  private singleton_baju(){} //mode private agar tidak dapat di instansiasi(pembuatan instance/objek) oleh class lain
  public static singleton_baju GetInstance() // Menggantikan objek singleto_baju menggunakan GetInstance, untuk memanggil di class lain
  {
    if(instance == null){ //cek instance/objek bernilai null atau tidak
     instance = new singleton_baju();}//jika null maka buat instance/objek baru
    return instance; }
//Pengecekan di atas memastikan bahwa hanya akan ada satu instance/objek dari kelas tersebut
  
    public static void bahan_baju() //Membuat method turunan yang digunakan untuk mengetest method singleton dari class singleton_baju
   {
       System.out.println("Bahan Baju : Spandex");
   }  
}
