import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // cria o scanner para ler entradas do terminal
        var scanner = new Scanner(System.in); 

        // solicita e lê o número da conta (inteiro)
        System.out.println("Bem vindo! Por favor informe o número da conta: "); 
        int account = scanner.nextInt();
        System.out.println("Por favor informe o número da agência: ");
        var agency = scanner.next();
        System.out.println("Obrigado! E qual o seu nome? ");
        var name = scanner.next();
        float balance = 237.48f; // Define o saldo fictício da conta

        // Imprime mensagem com os dados informados
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque. \n",
    name, agency, account, balance);
    }
}

/*
Entrada de dados esperada:

Atributo       Tipo     Exemplo
------------   ------   -------------
Número         int      1021
Agência        String   067-8
Nome Cliente   String   MARIO ANDRADE
Saldo          float    237.48
*/