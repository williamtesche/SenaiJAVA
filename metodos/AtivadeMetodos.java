
package ativademetodos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AtivadeMetodos {


    public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
        int[] vetor = null;
        int tamanho = 0;
        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Carregar Vetor");
            System.out.println("2. Listar Vetor");
            System.out.println("3. Exibir apenas os números pares do vetor");
            System.out.println("4. Exibir apenas os números ímpares do vetor");
            System.out.println("5. Exibir a quantidade de números pares nas posições ímpares");
            System.out.println("6. Exibir a quantidade de números ímpares nas posições pares");
            System.out.println("7. Sair");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    tamanho = pedirTamanho(scanner);
                    vetor = carregarVetor(scanner, tamanho);
                    break;
                case 2:
                    listarVetor(vetor);
                    break;
                case 3:
                    exibirNumerosPares(vetor);
                    break;
                case 4:
                    exibirNumerosImpares(vetor);
                    break;
                case 5:
                    contarParesNasPosicoesImpares(vetor);
                    break;
                case 6:
                    contarImparesNasPosicoesPares(vetor);
                    break;
                case 7:
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

    public static int pedirTamanho(Scanner scanner) {
        System.out.print("Digite o número de posições que você deseja cadastrar: ");
        return scanner.nextInt();
    }

    public static int[] carregarVetor(Scanner scanner, int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
        return vetor;
    }

    public static void listarVetor(int[] vetor) {
        if (vetor == null) {
            System.out.println("O vetor ainda não foi carregado.");
        } else {
            System.out.println("Conteúdo do vetor:");
            for (int valor : vetor) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void exibirNumerosPares(int[] vetor) {
        System.out.println("Números pares do vetor:");
        for (int valor : vetor) {
            if (valor % 2 == 0) {
                System.out.print(valor + " ");
            }
        }
        System.out.println();
    }

    public static void exibirNumerosImpares(int[] vetor) {
        System.out.println("Números ímpares do vetor:");
        for (int valor : vetor) {
            if (valor % 2 != 0) {
                System.out.print(valor + " ");
            }
        }
        System.out.println();
    }

    public static void contarParesNasPosicoesImpares(int[] vetor) {
        int count = 0;
        for (int i = 1; i < vetor.length; i += 2) {
            if (vetor[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Quantidade de números pares nas posições ímpares: " + count);
    }

    public static void contarImparesNasPosicoesPares(int[] vetor) {
        int count = 0;
        for (int i = 0; i < vetor.length; i += 2) {
            if (vetor[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Quantidade de números ímpares nas posições pares: " + count);
    }
    
}
