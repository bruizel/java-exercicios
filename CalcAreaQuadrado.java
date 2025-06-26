import java.util.Scanner;

public class CalcAreaQuadrado {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Vamos calcular a área desse quadrado! Quantos cm tem cada lado? ");
        int side = scanner.nextInt();
        System.out.printf("O seu quadrado tem %d cm de área.", side * side);
    }
}