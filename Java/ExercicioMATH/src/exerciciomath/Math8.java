
package exerciciomath;

import javax.swing.JOptionPane;

public class Math8 {
    public static void main(String[] args) {
        int numero, cont=1;
        double quadrado, soma = 0;
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero maior do que 0 e o menor que 10"));
        }while (numero <= 0 || numero >= 10);
        
        
        do{
            if(numero % 2 !=0){
                quadrado = Math.pow(numero,2);
                soma += quadrado;
                cont++;
                
                System.out.println(cont + " o valor " + numero + " elevador ao quadrado " + quadrado + " soma dos quadrados " +soma);
            }
            numero++;
        }while(cont < 20);
        
    }
}
