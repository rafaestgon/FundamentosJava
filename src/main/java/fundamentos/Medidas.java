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

}
