package javaapplication1;

import javax.swing.JOptionPane;

public class JavaApplication1 {
    public static void main(String[] args) {
        
        String login = "";
        String banco_login = "";
        int senha = 0;
        int banco_senha = 0;
        
        banco_login =  JOptionPane.showInputDialog("Digite seu login");
        banco_senha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha numerica"));
        
        while(senha != banco_senha && login != banco_login){
        
            login = JOptionPane.showInputDialog("Digite seu login novamente");
            senha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha numerica novamente"));
            if(senha != banco_senha && login != banco_login){
                JOptionPane.showMessageDialog(null, "Senha ou Login Invalidas");
            }
        
        }
        
        JOptionPane.showMessageDialog(null, "Login e Senha Corretas");
        
        
    }
    
}
