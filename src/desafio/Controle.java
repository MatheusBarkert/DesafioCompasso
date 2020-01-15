package desafio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Controle {

	public void ImprimePessoasCadastradas(File file) throws FileNotFoundException {
		try (Scanner sc = new Scanner((file), "UTF-8")) {
			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				String[] valores = linha.split(",");

				System.out.println("C�digo: " + valores[0]);
				System.out.println("Nome: " + valores[1]);
				System.out.println("Endere�o: " + valores[2]);
				System.out.println("Idade: " + valores[3]);
				System.out.println("-------------------------");

			}
		}

	}

	public void cadastrarPessoas(Scanner scanner) throws IOException {// PRECISO REVISAR ESSE METODO, ESTA FAZENDO DUAS
																		// COISAS

		System.out.println("Digite o código: ");
		int codigo = Integer.parseInt(scanner.nextLine());

		System.out.println("Digite o nome: ");
		String nome = scanner.nextLine();

		System.out.println("Digite o endereço: ");
		String endereco = scanner.nextLine();

		System.out.println("Digite a idade: ");
		int idade = Integer.parseInt(scanner.nextLine());

		Pessoa p = new Pessoa(codigo, nome, endereco, idade);

		FileWriter fw = new FileWriter("Pessoas.csv", true);
		PrintWriter gravaArquivo = new PrintWriter(fw);

		gravaArquivo.printf("%d,%s,%s,%d\r\n", p.getCodigo(), p.getNome(), p.getEndereco(), p.getIdade());

		fw.close();

	}

}
