import java.util.Scanner;

public class CalcAreaRetangulo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        // Recebe as dimensões do retângulo do usuário
        System.out.println("Vamos calcular a área desse retângulo! Quantos cm tem a base? ");
        int base = scanner.nextInt();
        
        System.out.println("Boa! E quantos cm ele tem de altura? ");
        int altura = scanner.nextInt();
        
        // Calcula e exibe a área
        System.out.printf("O seu retângulo tem %d cm de área.", base * altura);
    }
}