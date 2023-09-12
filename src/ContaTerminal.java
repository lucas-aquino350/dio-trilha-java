import java.util.Scanner;

public class ContaTerminal{
	
	public static void main(String[] args) throws Exception {
		
		String nomeCliente;
		String agencia;
		Integer  numero;
		Double saldo;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Olá, por gentileza, qual o seu nome?\n");
		nomeCliente = leitor.nextLine();
		
		System.out.println("Por favor, digite o nome da agência!\n");
		agencia = leitor.nextLine();
		
		System.out.println("Agora, informe o numero da conta!\n");
		numero = leitor.nextInt();
		
		System.out.println("Informe o valor do primeiro depósito!\n");
		saldo = leitor.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo "
				+ saldo + "\n já está dipónivel para saque.");
	}
}