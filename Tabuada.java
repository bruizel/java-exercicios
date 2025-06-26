import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args) {
        var scanner = new Scanner(System.in);

        // Pede um número pro usuário gerar a tabuada
        System.out.println("Informe um número para gerar a tabuada: ");
        var number = scanner.nextInt();

        // Mostra um cabeçalho com o número escolhido
        System.out.printf("Segue tabuada do %d \n", number);

        // Loop de 1 a 10 para montar a tabuada
        for (var i = 1; i <= 10 ; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}