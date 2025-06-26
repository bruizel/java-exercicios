import java.util.Scanner;

public class CalcIMC {
    public static void main (String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual seu peso? ");
        var peso = scanner.nextInt();
        System.out.println("E qual a sua altura? ");
        var altura = scanner.nextDouble();
        var imc = peso/(altura*altura);
        if (imc <= 18.5 ) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }
    }
}
