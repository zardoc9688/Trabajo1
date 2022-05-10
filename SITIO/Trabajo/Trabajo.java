
import java.util.Scanner;

public class Trabajo {
    
   public static Scanner entrada = new Scanner(System.in);
   
   public static void main(String[] args){
       System.out.println("Ingrese un valor");
       int valor = entrada.nextInt();
       
       if(valor > 5){
   System.out.println("El valor ingresado es mayor a 5"); 
   
   } else{
       System.out.println("El valor ingresado no es mayor a 5");
   }
}
   
   
}
