package com.jovemtranquilao.logica;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
        	
            System.out.println("Informe um número: ");
            double num = input.nextDouble();

            System.out.println("Informe outro número: ");
            double num2 = input.nextDouble();
            
            System.out.println("Informe uma operação: \n" +
                    "1. Adição (+)\n" +
                    "2. Subtração (-)\n" +
                    "3. Multiplicação (*)\n" +
                    "4. Divisão (/)\n" +
                    "5. Sair");

            
            int operacao = input.nextInt();

            if (operacao == 5) {
                System.out.println("Encerrando!");
                break;
            }

            switch (operacao) {
                case 1:
                    System.out.println("Resultado: " + (num + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Erro: divisão por zero não é permitida.");
                    } else {
                        System.out.println("Resultado: " + (num / num2));
                    }
                    break;
                default:
                    System.out.println("Operação inválida, tente novamente.");
            }
        }

        input.close();
    }
}