package fundamentos;

// É bom ser utilizado quando vamos usar a base, mas vamos acrescentar/modificar algo
public class Contadores extends Medidas { //Traz automaticamente tudo que foi construido na classe Medidas

    public static void main(String[] args){
        System.out.print("Deseja calcula a Area do Quadrado? <S/N> ");
        String resposta = entrada.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            calcularAreaDoQuadrado();
        }
        else {
            System.out.println("Até a próxima!");
        }
    }
}
