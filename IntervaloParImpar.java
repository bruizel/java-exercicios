import java.util.Scanner;

public class IntervaloParImpar {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        int value1 = 0;
        int value2 = 0;
        int option = 0; 

        // Valida se o primeiro número é menor que o segundo
        while (true) {

            // Recebe os números  
            System.out.println("Informe o primeiro número do intervalo: ");
            value1 = scanner.nextInt();
            System.out.println("Informe o segundo número do intervalo: ");
            value2 = scanner.nextInt();

            if (value1 > value2) {
                System.out.println("O primeiro número precisa ser menor que o segundo para gerar o intervalo! \n");            
                continue; // Retorna para o input dos números
            }
            break; // Se os inputs estiverem corretos contina 
        }
        while (true) {
            System.out.println("Você quer o intervalo dos números pares ou ímpares?");
            System.out.println("Selecione 1-Ímpar ou 2-Par");
            option = scanner.nextInt();
            
            if (option != 1 && option != 2) {
                System.out.printf("Opção %d inválida! \n", option);            
                continue; // Retorna para seleção
            }
            break;
        }

        System.out.println("\n Resultado: ");
            for (var i = value2;i >= value1; i--) {
                if (option == 1 && i % 2 != 0 ) { // Ímpar
                    System.out.println(i);
                } else if (option == 2 && i % 2 == 0) { // Par 
                    System.out.println(i);
            }
            }
    }
}

/*3. Escreva um código que o usuário entre com um primeiro número, 
um segundo número maior que o primeiro e escolhe entre a opção par e impar, 
com isso o código deve informar todos os números pares ou ímpares 
(de acordo com a seleção inicial) no intervalo de números informados, 
incluindo os números informados e em ordem decrescente; 

 */