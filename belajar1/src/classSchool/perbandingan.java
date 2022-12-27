 
package classSchool;


public class perbandingan { 
    
    public static void main(String[] args) {
        int nilaiA = 12; 
        int nilaiB = 10; 
        boolean hasil ; 
        //lebih besar > 
        hasil = nilaiA > nilaiB; 
        System.out.println("Hasil nilaiA > nilaiB : " + hasil);
        //lebih kecil < 
        hasil = nilaiA < nilaiB; 
        System.out.println("Hasil nilaiA < nilaiB : " + hasil);
        //sama dengan == 
        hasil = nilaiA ==nilaiB; 
        System.out.println("Hasil nilaiA == nilaiB : " + hasil);
        //lebih besar sama dengan nilaiB 
        hasil = nilaiA >= nilaiB; 
       System.out.println("Hasil nilaiA >= nilaiB : " + hasil);
        //lebih kecil sama dengan nilaiB 
        hasil = nilaiA <= nilaiB; 
        System.out.println("Hasil nilaiA <= nilaiB : " + hasil);
        //tidak sama dengan 
        hasil = nilaiA  != nilaiB; 
       System.out.println("Hasil nilaiA != nilaiB : " + hasil);
    }
    
}
