package exercicio.pkg1;
   
    import javax.swing.JOptionPane;
    import java.util.Scanner;

public class Exercicio1{
 
    public static void main(String[] args) {
       
               boolean resultado = true;
        String login = "";
        String banco_login = "";
        String senha = "";
        String banco_senha = "";
        
        
        
        banco_login = JOptionPane.showInputDialog("Crie seu login");
        banco_senha = JOptionPane.showInputDialog("Crie sua senha numerica");

        do {

            login = JOptionPane.showInputDialog("Digite seu login novamente");
            senha = JOptionPane.showInputDialog("Digite sua senha numerica novamente");
            
            if (!banco_senha.equals(senha) || !banco_login.equals(login)) {
                JOptionPane.showMessageDialog(null, "Senha ou Login Invalidas");
                resultado = false;
            } else {
                JOptionPane.showMessageDialog(null, "Login e Senha Corretas");
                resultado = true;
            }

        } while (!resultado);
        
        
    }
         

}


    
        