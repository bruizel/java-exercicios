import java.util.Scanner;

public class CalcDifIdade {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro nome: ");
        var name1 = scanner.next();
        System.out.println("Informe a idade: ");
        var age1 = scanner.nextInt();
        System.out.println("Informe o segundo nome: ");
        var name2 = scanner.next();
        System.out.println("Informe a idade: ");
        var age2 = scanner.nextInt();
        System.out.printf("%s e %s possuem %s anos de diferença de idade", name1, name2, Math.abs(age1 - age2));
    }
}
