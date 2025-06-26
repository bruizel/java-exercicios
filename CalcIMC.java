import java.util.Scanner;

public class CalcIMC {
    public static void main (String[] args) {
        var scanner = new Scanner(System.in);

        // Pede o peso do usuário (em kg)
        System.out.println("Qual seu peso em kg? ");
        var peso = scanner.nextInt();

        // Pede a altura (em metros)
        System.out.println("E qual a sua altura em metros? ");
        var altura = scanner.nextDouble();

        // Calcula o IMC: peso dividido pela altura ao quadrado
        var imc = peso / (altura * altura);

        // Verifica a faixa do IMC e imprime a classificação correspondente
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