import java.util.Scanner;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Requisito 01: Solicitar o tamanho e elementos da matriz A
        System.out.print("Informe o número de linhas da matriz A: ");
        int linhasA = input.nextInt();
        System.out.print("Informe o número de colunas da matriz A: ");
        int colunasA = input.nextInt();

        double[][] matrizA = new double[linhasA][colunasA];
        System.out.println("Informe os elementos da matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = input.nextDouble();
            }
        }

        // Requisito 01: Solicitar o tamanho e elementos da matriz B
        System.out.print("Informe o número de linhas da matriz B: ");
        int linhasB = input.nextInt();
        System.out.print("Informe o número de colunas da matriz B: ");
        int colunasB = input.nextInt();

        double[][] matrizB = new double[linhasB][colunasB];
        System.out.println("Informe os elementos da matriz B:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = input.nextDouble();
            }
        }

        // Requisito 02: Verificar se é possível multiplicar as matrizes
        if (colunasA != linhasB) {
            System.out.println("Não é possível multiplicar as matrizes. O número de colunas de A deve ser igual ao número de linhas de B.");
            System.exit(0);
        }

        // Requisito 03: Efetuar o cálculo da multiplicação entre as matrizes
        double[][] matrizC = new double[linhasA][colunasB];
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                matrizC[i][j] = 0;
                for (int k = 0; k < colunasA; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Requisito 04: Apresentar as matrizes e seus conteúdos
        System.out.println("Matriz A:");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz B:");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz C (resultado da multiplicação):");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
