
package exerciciomath;

import javax.swing.JOptionPane;


public class Math7 {
    public static void main(String[] args) {
         int primeiroNumero = 0;
         int segundoNumero = 0;
        
        primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o primeiro numero: "));
        
            
            if(primeiroNumero % 2 == primeiroNumero){
                 System.out.println("Valor Pares: " + primeiroNumero);
            }else{
                System.out.println("Valor impar: " + segundoNumero);
            }
        
       
     
    }
}
