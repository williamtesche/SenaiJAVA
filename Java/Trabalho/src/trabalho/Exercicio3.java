
package trabalho;


import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner escolha = new Scanner(System.in);

        double[] vendas;
        int dias;

        if (escolha.equalsIgnoreCase("semanal")) {
            vendas = new double[7];
            dias = 7;
        } else if (escolha.equalsIgnoreCase("mensal")) {
            vendas = new double[31];
            dias = 31;
        } else {
            System.out.println("Escolha inválida. O programa será encerrado.");
            return;
        }

        for (int i = 0; i < dias; i++) {
            System.out.print("Digite o lucro do dia " + (i + 1) + ": ");
            vendas[i] = scanner.nextDouble();
        }

        scanner.close();

        double totalVendas = 0;
        for (double venda : vendas) {
            totalVendas += venda;
        }

        double mediaVendas = totalVendas / dias;

        System.out.println("Lucro total da semana/mês: " + totalVendas);
        System.out.println("Média de vendas: " + mediaVendas);
    }
}
