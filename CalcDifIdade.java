import java.util.Scanner;

public class CalcDifIdade {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // Pede o nome e a idade da primeira pessoa
        System.out.println("Informe o primeiro nome: ");
        var name1 = scanner.next();

        System.out.println("Informe a idade: ");
        var age1 = scanner.nextInt();

        // Pede o nome e a idade da segunda pessoa
        System.out.println("Informe o segundo nome: ");
        var name2 = scanner.next();

        System.out.println("Informe a idade: ");
        var age2 = scanner.nextInt();

        // Calcula a diferença de idade (em valor absoluto) e mostra o resultado
        System.out.printf("%s e %s possuem %s anos de diferença de idade", 
                          name1, name2, Math.abs(age1 - age2));
    }
}