package classSchool;

 
public class latihan2 {  
    public static void main(String[] args) {
         latihan1 alim = new latihan1(); 
         
         alim.setNama("alim rabbani"); 
         alim.setUsia(19); 
         
         
         System.out.println("nama : " + alim.getNama());
         System.out.println("usia : "  + alim.getUsia()) ; 
         
         System.out.println("=======================================");
         latihan1 alim2 = new latihan1();  
         alim.setNama("ucup"); 
         alim.setUsia(19); 
         
         
         System.out.println("nama : " + alim.getNama());
         System.out.println("usia : "  + alim.getUsia()) ; 
    }
    
    
    
}
