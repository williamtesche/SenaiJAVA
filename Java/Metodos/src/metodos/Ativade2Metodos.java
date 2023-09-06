package metodos;

import java.util.Scanner;

public class Ativade2Metodos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ClienteN = 0;
        int ClienteE = 0;
        int depositar = 0;
        int sacar = 0;
        int extrato = 0;

        int escolha;

        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha um numero\n");

            System.out.println("1. Você é Cliente: ");
            System.out.println("2. Você é Cliente Especial: ");
            System.out.println("3. Você deseja Depositar: ");
            System.out.println("4. Você deseja Sacar: ");
            System.out.println("5. sair ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    ClienteN = clienteNormal(scanner);
                    break;

                case 2:
                    ClienteE = clienteEspecial(scanner);
                    break;

                case 3:
                    depositar = clienteDepositar(scanner);
                    break;

                case 4:
                    sacar = clienteSacar(scanner);
                    break;

                case 5:
                    extrato = clienteExtrato(scanner);
                    break;
                case 6:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();

    }

    public static int clienteNormal(Scanner scanner) {
        int ClienteN = 0;
        if (1 != ClienteN) {
            System.out.println("Cliente Normal ");
        } 
        return scanner.nextInt();

    }
        public static int clienteEspecial(Scanner scanner) {
        int ClienteE = 0;
        
        if (2 != ClienteE) {
            System.out.println("Cliente Especial ");
        } 
        return scanner.nextInt();
        }
}
