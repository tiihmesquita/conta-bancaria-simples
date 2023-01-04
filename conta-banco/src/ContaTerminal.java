import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
     
        //TODO:conhecer e importar a classe Scanner
        
        Scanner teclado = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuário
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor digita o numedo da conta: ");
        numeroConta = teclado.nextInt();

        System.out.println("Digite o numero da agencia: ");
        agencia = teclado.next();

        System.out.println("Digite seu nome: ");
        nomeCliente = teclado.nextLine();

        System.out.println("Digite seu saldo: ");
        saldo = teclado.nextFloat();
        //Obter pela classe scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        System.out.println("Ola "+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");

    }
}
