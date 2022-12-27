package classSchool;

import java.util.Scanner;


public class latiahPercabangan { 
    
    public static void main(String[] args) {
        String nama ; 
        int  belanja;  
  
         
         Scanner input = new Scanner(System.in); 
         System.out.println("nama anda : ");
         nama = input.next(); 
         System.out.println("Total Belanjaan : Rp ");
         belanja = input.nextInt(); 
         
         
         if (belanja > 100000){
             System.out.println("selamat " + nama  +" anda mendapatkan hadiah"); 
             
         }
         
         System.out.println("terimakasih , datang lagi yah ");  
         
         
    }
    
}
