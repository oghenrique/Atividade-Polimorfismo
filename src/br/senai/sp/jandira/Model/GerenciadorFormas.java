package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class GerenciadorFormas {

    Scanner scanner = new Scanner(System.in);

    public void menu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("------------ Bem Vindo ------------");
            System.out.println("\n==> Menu:\n                      ");
            System.out.println("1 - Calcular Retângulo             ");
            System.out.println("2 - Calcular Círculo               ");
            System.out.println("3 - Sair                           ");
            System.out.println("-----------------------------------");

            System.out.print("Escolha uma opção: ");
            int optionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (optionMenu) {
                case 1:
                    System.out.print("Insira o valor do comprimento: ");
                    double comprimento = scanner.nextDouble();
                    System.out.print("Insira o valor da largura: ");
                    double largura = scanner.nextDouble();
                    Retangulo retangulo = new Retangulo(comprimento, largura);
                    retangulo.calcularArea();
                    retangulo.calcularPerimetro();
                    break;

                case 2:
                    System.out.print("Insira o valor do raio: ");
                    double raio = scanner.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    circulo.calcularArea();
                    circulo.calcularPerimetro();
                    break;

                case 3:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}