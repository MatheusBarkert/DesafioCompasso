package desafio;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException,NoSuchElementException {

		File file = new File("Pessoas.csv");
		try (Scanner sc = new Scanner(System.in)){
			
			Controle controle = new Controle();

			int opcao;
			do {

				System.out.println("## Escolha uma das opções abaixo ##");
				System.out.println("Opção 1 - Cadastras pessoas");
				System.out.println("Opção 2 - Imprime pessoas cadastradas");
				System.out.println("Opção 0 - Sair do programa");
				System.out.println("_______________________________________");
				System.out.println("Digite aqui sua opção: ");
				//opcao = Integer.parseInt(sc.nextLine());// linha com problema a partir do segundo loop
				opcao = sc.nextInt();
				switch (opcao) {
				case 1:
					controle.cadastrarPessoas();
					break;

				case 2:
					controle.ImprimePessoasCadastradas(file);
					break;
				case 0:
					System.exit(-1);
					break;
				default:
					System.err.println("Nao deu");
					break;
				}

			} while (opcao != 0);

		}

	}

}
