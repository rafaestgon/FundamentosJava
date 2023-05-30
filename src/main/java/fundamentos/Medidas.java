// 1 - Pacote
package fundamentos;

// 2 - Bibliotecas

import java.sql.SQLOutput;
import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in); // instanciar o objeto de leitura do console


    // 3.2 - Métodos e Funções
    public static void main(String[] args) {

        String opcao;
        double area = 0; // receber o resultado dos cálculos de área

        System.out.println("Escolha o Cálculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retângulo");
        System.out.println("(3) - Area do Triângulo");
        System.out.println("(4) - Area do Circulo");
        System.out.println("(5) - Tabuada");
        System.out.println("(6) - Fibonacci");

        opcao = entrada.nextLine(); // leitura da opção

        switch (opcao) {
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                area = calcularAreaDoRetangulo();
                break;
            case "3":
                area = calcularAreaDoTriangulo();
                break;
            case "4":
                area = calcularAreaDoCirculo();
                break;
            case "5":
                tabuada();
                break;
            case "6":
                fibonacci();
                break;
            default:
                System.out.println("Opção Inválida: " + opcao);
        }

        if (area > 0) {
            System.out.println("A Area é de " + area + "m²");
        }
    }

    public static int calcularAreaDoQuadrado() {

        int lado; // tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado

        // Desenhar o quadrado
        for (int linha = 1; linha <= lado; linha += 2) {
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("#");
            }
            System.out.println(""); // pular de linha
        }

        System.out.println("");
        return lado * lado; // retorna a área do quadrado
    }

    public static int calcularAreaDoRetangulo() {

        int ladoA;
        int ladoB;

        System.out.println("Digite o tamanho do ladoA: ");
        ladoA = entrada.nextInt();
        System.out.println("Digite o tamanho do ladoB: ");
        ladoB = entrada.nextInt();
        return ladoA * ladoB;
    }

    public static int calcularAreaDoTriangulo() {

        int base;
        int altura;

        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextInt();
        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextInt();
        return (base * altura) / 2;
    }

    public static double calcularAreaDoCirculo() {

        int raio;

        System.out.println("Digite o tamanho do raio: ");
        raio = entrada.nextInt();
        return (Math.PI * raio * raio) / 2;
    }

    public static void tabuada() {

        byte numero;
        byte i;

        System.out.print("Você quer calcular a tabuada de qual número? ");
        numero = entrada.nextByte();
        for (i = 1; i <= 10; i++) {
            System.out.print(numero * i + " ");
        }
    }

    public static void fibonacci() {

        byte numero;
        byte i;
        int num1;
        int num2;
        int fib;

        System.out.print("Quantos números deseja calcular na sequência? ");
        numero = entrada.nextByte();

        switch (numero) {
            case 0:
                System.out.println("A sequência está vazia");
                break;
            case 1:
                System.out.println("Sequeência de Fibonacci: 1");
                break;
            default:
                num1 = 0;
                num2 = 1;

                System.out.print("Sequência de Fibonacci: 1 ");
                for (i = 2; i <= numero; i++) {
                    fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;
                }

        }

    }

}
