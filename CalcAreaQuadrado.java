import java.util.Scanner;

public class CalcAreaQuadrado {
    public static void main(String[] args) {
        // Cria o scanner pra ler o que o usuário digita
        var scanner = new Scanner(System.in);
        
        // Pede pro usuário informar o tamanho do lado do quadrado
        System.out.println("Vamos calcular a área desse quadrado! Quantos cm tem cada lado? ");
        
        // Lê o valor digitado e guarda na variável side
        int side = scanner.nextInt();
        
        // Calcula a área (lado * lado) e mostra pra pessoa
        System.out.printf("O seu quadrado tem %d cm de área.", side * side);
    }
}