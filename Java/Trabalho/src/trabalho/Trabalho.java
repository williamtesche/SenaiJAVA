
package trabalho;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Trabalho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Deseja informar os valores recebidos da semana ou do mês:");
        String escolha = scanner.nextLine();

        int dias;
        if (escolha.equals("semana")) {
            dias = 7;
        } else if (escolha.equals("mês")) {
            dias = 31;
        } else {
            System.out.println("Escolha inválida.");
            return;
        }

        double[] vendas = new double[dias];
        for (int dia = 0; dia < dias; dia++) {
            System.out.print("Informe o valor vendido no dia " + (dia + 1) + ": R$");
            vendas[dia] = scanner.nextDouble();
        }

        double totalVendas = 0;
        for (double venda : vendas) {
            totalVendas += venda;
        }

        double mediaVendas = totalVendas / dias;
        double mediaLucroDiario = totalVendas / dias;

        System.out.printf("\nsTotal de vendas: R$%.2f%n", totalVendas);
        System.out.printf("Lucro diário: R$%.2f%n", mediaLucroDiario);

        scanner.close();
               
    }
    
}


