import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número para gerar a tabuada: ");
        var number = scanner.nextInt();
        System.out.printf("Segue tabuada do %d \n", number);
        for (var i = 1; i <= 10 ; i ++) {
            System.out.println(number + " x " + i + " = " + i*number);
        }
    }
}
