
import java.util.Scanner;

public class Condicional_3 {
    
   public static Scanner entrada = new Scanner(System.in);
   
   public static void main(String[] args){

    
   int c = 0;
    for (int i=2; i<9; i++) {
             
     System.out.println("Tabla del " + i);
        for(int j = 1; j <11; j++){
            c = i*j;
            System.out.println(i +" * "+ j +" = " +c);
            
            } 
            
            }
         
       
}
}

