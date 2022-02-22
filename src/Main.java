import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		System.out.println("Digite o nome do cliente: ");
		Scanner sc = new Scanner(System.in);
		String nome = sc.nextLine();
		cliente.setNome(nome);
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		System.out.println("Digite a opção desejada: 1-> Depositar  / 2-> Transferir");
		Scanner sc1 = new Scanner(System.in);
		int opcao = sc1.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Digite o valor a ser depositado: ");
			Scanner sc2 = new Scanner(System.in);
			int dep = sc2.nextInt();
			cc.depositar(dep);
			break;
		case 2:
			System.out.println("Digite o valor a ser tranferido: ");
			Scanner sc3 = new Scanner(System.in);
			int transf = sc3.nextInt();
			cc.transferir(transf, poupanca);
			break;
		default: 
			System.out.println("Digite uma opção válida (1 ou 2) ");
		}
			
			
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
