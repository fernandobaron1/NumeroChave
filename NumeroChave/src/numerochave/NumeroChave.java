
package numerochave;

import java.util.Scanner;


public class NumeroChave {

   
    public static void main(String[] args) {
        
            Scanner leia = new Scanner(System.in);
        System.out.println ("Informe o Número");
        int numero = leia.nextInt();
        
        int numeroChave = 60;
        
        if (numero < numeroChave) {
    System.out.println(numeroChave - numero); 
    }  else  {
            System.out.println(numero - numeroChave);                    
    }
    }
    
}
