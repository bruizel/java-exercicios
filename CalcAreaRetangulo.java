import java.util.Scanner;

public class CalcAreaRetangulo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Vamos calcular a área desse retângulo! Quantos cm tem a base? ");
        int base = scanner.nextInt();
        System.out.println("Boa! E quantos cm ele tem de altura? ");
        int altura = scanner.nextInt();
        System.out.printf("O seu retângulo tem %d cm de área.", base * altura);
    }
}