package fundamentos;

// É bom ser utilizado quando vamos usar sem modificar nada
import static fundamentos.Medidas.entrada; // Importa algo especifico a ser utilizado que foi criado na classe Medidas
import static fundamentos.Medidas.tabuada; // Importa algo especifico a ser utilizado que foi criado na classe Medidas

public class Calculos {

    public static void main(String[] args){
        System.out.print("Deseja calcula a tabuada? <S/N> ");
        String resposta = entrada.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            tabuada();
        }
        else {
            System.out.println("Até a próxima!");
        }
    }
}
