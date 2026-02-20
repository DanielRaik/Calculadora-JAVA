package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        Historico historico = new Historico();

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== CALCULADORA JAVA made by: Daniel Ribeiro ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Ver historico");
            System.out.println("6 - Excluir historico");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: "); // interface de escolha simples para o usuario

            // resposta de cada escolha
            try {
                int opcao = scanner.nextInt();

                if (opcao == 0) {
                    System.out.println("Encerrando...");
                    continuar = false;
                    continue;
                }

                if (opcao == 5) {
                    historico.mostrar();
                    continue;
                }

                if (opcao == 6) {
                    historico.limpar();
                    continue;
                }

                if (opcao < 1 || opcao > 4) {
                    System.out.println("Opção Inválida.");
                    continue;
                }

                System.out.print("Digite o primeiro número: ");
                double a = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double b = scanner.nextDouble();

                double resultado = 0;
                String operacao = "";

                switch (opcao) {
                    case 1:
                        resultado = calculadora.somar(a, b);
                        operacao = a + " + " + b + " = " + resultado;
                        break;

                    case 2:
                        resultado = calculadora.subtrair(a, b);
                        operacao = a + " - " + b + " = " + resultado;
                        break;

                    case 3:
                        resultado = calculadora.multiplicar(a, b);
                        operacao = a + " * " + b + " = " + resultado;
                        break;

                    case 4:
                        resultado = calculadora.dividir(a, b);
                        operacao = a + " / " + b + " = " + resultado;
                        break;
                }
                System.out.println("Resultado: " + resultado);
                historico.adicionar(operacao); // adiciona a operação ao histórico

            // tratamento de erros
            } catch (InputMismatchException e) {
                System.out.println("Erro: entrada inválida. Digite apenas números.");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}